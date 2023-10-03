package com.contact.services;

import java.util.List;

import com.contact.modal.Contact;

public interface ContactService {
	
	List<Contact> getContactsUser(Long uuid);

	Contact addContact(Long uuid,Contact contact);	

}
