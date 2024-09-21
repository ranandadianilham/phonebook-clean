package com.phonebook.crud.application.implementation;

import java.util.List;

import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.infrastructure.repository.ContactRepository;
import com.phonebook.crud.usecase.GetAllContactsUseCase;

public class GetAllContactUseCaseImpl implements GetAllContactsUseCase {
    private final ContactRepository contactRepository;

    public GetAllContactUseCaseImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> execute() {
        return contactRepository.findAll();
    }

}
