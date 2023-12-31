package com.contact.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.modal.Contact;
import com.contact.services.ContactService;

@RestController
public class ContactControllor {

	@Autowired
	private ContactService contactService;

	@GetMapping("/contact/users/{uuid}")
	public ResponseEntity<List<Contact>> getContactsByUser(@PathVariable Long uuid) {
		return new ResponseEntity<List<Contact>>(contactService.getContactsUser(uuid), HttpStatus.OK);
	}

	@PostMapping("/contact/users/{uuid}")
	public ResponseEntity<Contact> addContacts(@PathVariable Long uuid ,@RequestBody Contact contact){
		return new ResponseEntity<Contact>(contactService.addContact(uuid,contact),HttpStatus.ACCEPTED);
	}
}
