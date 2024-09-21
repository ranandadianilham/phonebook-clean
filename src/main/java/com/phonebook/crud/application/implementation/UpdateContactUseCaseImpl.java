package com.phonebook.crud.application.implementation;

import java.util.Optional;

import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.infrastructure.repository.ContactRepository;
import com.phonebook.crud.usecase.UpdateContactUseCase;

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
