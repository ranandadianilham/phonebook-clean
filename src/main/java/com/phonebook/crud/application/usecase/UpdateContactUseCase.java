package com.phonebook.crud.application.usecase;

import com.phonebook.crud.domain.Contact;

public interface UpdateContactUseCase {
    public Contact execute(Long id, Contact contactDetails);
}
