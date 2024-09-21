package com.phonebook.crud.infrastructure.controller;

import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.usecase.CreateContactUseCase;
import com.phonebook.crud.usecase.DeleteContactUseCase;
import com.phonebook.crud.usecase.GetAllContactsUseCase;
import com.phonebook.crud.usecase.GetContactByIdUseCase;
import com.phonebook.crud.usecase.UpdateContactUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final GetAllContactsUseCase getAllContactsUseCase;
    private final GetContactByIdUseCase getContactByIdUseCase;
    private final CreateContactUseCase createContactUseCase;
    private final UpdateContactUseCase updateContactUseCase;
    private final DeleteContactUseCase deleteContactUseCase;

    @Autowired
    public ContactController(GetAllContactsUseCase getAllContactsUseCase,
            GetContactByIdUseCase getContactByIdUseCase,
            CreateContactUseCase createContactUseCase,
            UpdateContactUseCase updateContactUseCase,
            DeleteContactUseCase deleteContactUseCase) {
        this.getAllContactsUseCase = getAllContactsUseCase;
        this.getContactByIdUseCase = getContactByIdUseCase;
        this.createContactUseCase = createContactUseCase;
        this.updateContactUseCase = updateContactUseCase;
        this.deleteContactUseCase = deleteContactUseCase;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return getAllContactsUseCase.execute();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Long id) {
        Optional<Contact> contact = getContactByIdUseCase.execute(id);
        return contact.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return createContactUseCase.execute(contact);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable Long id, @RequestBody Contact contactDetails) {
        Contact updatedContact = updateContactUseCase.execute(id, contactDetails);
        return updatedContact != null ? ResponseEntity.ok(updatedContact) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        deleteContactUseCase.execute(id);
        return ResponseEntity.noContent().build();
    }
}