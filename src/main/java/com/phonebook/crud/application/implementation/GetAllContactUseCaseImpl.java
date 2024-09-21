package com.phonebook.crud.application.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.phonebook.crud.application.usecase.GetAllContactsUseCase;
import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.domain.ContactRepository;

@Service
public class GetAllContactUseCaseImpl implements GetAllContactsUseCase {
    private final ContactRepository contactRepository;

    public GetAllContactUseCaseImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> execute() {
        return contactRepository.findAll();
    }

}
