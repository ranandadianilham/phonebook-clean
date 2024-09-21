package com.phonebook.crud.application.implementation;

import java.util.List;

import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.infrastructure.repository.ContactRepository;
import com.phonebook.crud.usecase.CreateContactUseCase;

public class CreateContactUseCaseImpl  implements CreateContactUseCase {
    private final ContactRepository contactRepository;

    public CreateContactUseCaseImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact execute(Contact contact) {
        return contactRepository.save(contact);
    }


}
