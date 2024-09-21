package com.phonebook.crud.usecase;

import java.util.List;

import com.phonebook.crud.domain.Contact;

public interface GetAllContactsUseCase {

    public List<Contact> execute();
}
