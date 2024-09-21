package com.phonebook.crud.application.implementation;

import java.util.List;
import java.util.Optional;

import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.infrastructure.repository.ContactRepository;
import com.phonebook.crud.usecase.GetContactByIdUseCase;

public class GetContactByIdUseCaseImpl implements GetContactByIdUseCase {
    private final ContactRepository contactRepository;

    public GetContactByIdUseCaseImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Optional<Contact> execute(Long id) {
        return contactRepository.findById(id);
    }
}
