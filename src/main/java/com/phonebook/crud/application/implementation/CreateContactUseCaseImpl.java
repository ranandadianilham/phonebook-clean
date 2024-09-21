package com.phonebook.crud.application.implementation;

import org.springframework.stereotype.Service;

import com.phonebook.crud.application.usecase.CreateContactUseCase;
import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.domain.ContactRepository;

@Service
public class CreateContactUseCaseImpl implements CreateContactUseCase{
    private final ContactRepository contactRepository;

    public CreateContactUseCaseImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact execute(Contact contact) {
        return contactRepository.save(contact);
    }

}
