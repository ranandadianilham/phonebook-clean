package com.phonebook.crud.usecase;

import java.util.Optional;

import com.phonebook.crud.domain.Contact;

public interface GetContactByIdUseCase {
    public Optional<Contact> execute(Long id);
}
