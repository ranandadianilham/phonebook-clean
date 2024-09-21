package com.phonebook.crud.application.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.crud.application.usecase.GetContactByIdUseCase;
import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.domain.ContactRepository;

@Service
public class GetContactByIdUseCaseImpl implements GetContactByIdUseCase {
    private final ContactRepository contactRepository;


    public GetContactByIdUseCaseImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Optional<Contact> execute(Long id) {
        return contactRepository.findById(id);
    }
}
