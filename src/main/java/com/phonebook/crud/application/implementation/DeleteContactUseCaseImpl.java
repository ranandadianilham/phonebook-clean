package com.phonebook.crud.application.implementation;

import com.phonebook.crud.infrastructure.repository.ContactRepository;
import com.phonebook.crud.usecase.DeleteContactUseCase;

public class DeleteContactUseCaseImpl implements DeleteContactUseCase {
    private final ContactRepository contactRepository;

    public DeleteContactUseCaseImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void execute(Long id) {
        contactRepository.deleteById(id);
    }
}
