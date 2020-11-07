package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistances.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
