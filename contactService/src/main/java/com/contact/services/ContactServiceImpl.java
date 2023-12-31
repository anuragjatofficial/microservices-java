package com.contact.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.exceptions.InvalidUserException;
import com.contact.modal.Contact;
import com.contact.modal.User;
import com.contact.repository.ContactRepository;
import com.contact.repository.UserRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public List<Contact> getContactsUser(Long uuid) {
		if (uuid == null)
			throw new InvalidUserException("please pass the proper value");
		User user = userRepository.findById(uuid)
				.orElseThrow(() -> new InvalidUserException("can't find any user with id " + uuid));
		return user.getContacts();
	}

	@Override
	public Contact addContact(Long uuid, Contact contact) {
		if (uuid == null)
			throw new InvalidUserException("please pass the proper value");
		User user = userRepository.findById(uuid)
				.orElseThrow(() -> new InvalidUserException("can't find any user with id " + uuid));
		contact.setUser(user);
		Contact contact2 = contactRepository.save(contact);
		return contact2;
	}

}
