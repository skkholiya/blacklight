package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistances.Match;
import com.example.demo.persistances.User;
import com.example.demo.repository.MatchRepo;
import com.example.demo.repository.UserRepo;

@Service
public class UserMatchService {
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private MatchRepo matchRepo;

	public User getUserDetails(Long id) {
		User userResponse = userRepo.getOne(id);
		return userResponse;
	}

	public Match getMatchDetails(Long id) {
		return matchRepo.getOne(id);
	}
}
