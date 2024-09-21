package com.phonebook.crud.application.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.crud.application.usecase.UpdateContactUseCase;
import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.domain.ContactRepository;
import com.phonebook.crud.infrastructure.dto.CreateContactDto;

@Service
public class UpdateContactUseCaseImpl implements UpdateContactUseCase {
    private final ContactRepository contactRepository;

    public UpdateContactUseCaseImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact execute(Long id, Contact contactDetails) {
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

}
