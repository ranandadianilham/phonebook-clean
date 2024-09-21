package com.phonebook.crud.application;


import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.infrastructure.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class ContactService {

    private final ContactRepository contactRepository;


    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact updateContact(Long id, Contact contactDetails) {
        Optional<Contact> existingContact = contactRepository.findById(id);
        if (existingContact.isPresent()) {
            Contact contact = existingContact.get();
            contact.setName(contactDetails.getName());
            contact.setPhoneNumber(contactDetails.getPhoneNumber());
            contact.setEmail(contactDetails.getEmail());
            return contactRepository.save(contact);
        }
        return null;
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}