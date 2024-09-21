package com.phonebook.crud.application.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonebook.crud.application.usecase.DeleteContactUseCase;
import com.phonebook.crud.domain.ContactRepository;
@Service
public class DeleteContactUseCaseImpl implements DeleteContactUseCase {
    private final ContactRepository contactRepository;

    public DeleteContactUseCaseImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public void execute(Long id) {
        contactRepository.deleteById(id);
    }
}
