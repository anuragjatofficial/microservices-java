package com.userService.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.userService.modal.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
