package com.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
