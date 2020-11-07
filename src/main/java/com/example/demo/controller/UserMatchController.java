package com.example.demo.controller;

import javax.validation.constraints.Min;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.persistances.Match;
import com.example.demo.persistances.User;
import com.example.demo.services.UserMatchService;
import com.example.demo.validator.CheckId;

@Controller
@RequestMapping("/user-match")
public class UserMatchController {

	private static final Logger LOGGER = Logger.getLogger(UserMatchController.class);

	@Autowired
	private UserMatchService userService;

	@GetMapping("/user")

	public String getUserDetails(@RequestParam(name = "id") @CheckId @Min(value = 0) Long id, Model modelView) {
		User user = userService.getUserDetails(id);
		LOGGER.info("user Details::" + user);
		modelView.addAttribute("user", user);
		// return ResponseEntity.ok(new ResponseObj(200, "success", "Users fetched
		// Successfully..", user));
		return "index";

	}

	@PostMapping("/match/{id}")
	public Match getMatchDetails(@RequestParam Long id) {
		return userService.getMatchDetails(id);
	}

}
