# Phonebook

directory:

- Application layer
    /application/implementation
        contain service for contacts, separated for each actions
    /application/usecase
        interface for implementaion
- domain layer
    /domain
        contain domain model and contact repo interface
- Presentation layer
    /infrastructure/controller
        contain controller for crud contact
    /infrastructure/repository
        contain jpa repo for contact
