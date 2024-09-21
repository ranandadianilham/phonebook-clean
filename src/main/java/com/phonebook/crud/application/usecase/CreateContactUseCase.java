package com.phonebook.crud.application.usecase;

import com.phonebook.crud.domain.Contact;

public interface CreateContactUseCase {
    Contact execute(Contact contact);
}
