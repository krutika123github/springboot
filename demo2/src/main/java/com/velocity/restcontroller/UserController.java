package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Nominee;
import com.velocity.model.User;
import com.velocity.service.NomineeService;
import com.velocity.service.UserService;


	@RestController
	@RequestMapping(value="/user")
	public class UserController {
		@Autowired
		private UserService userService;
		
		@Autowired
		private NomineeService nomineeService;
		
		@PostMapping("/updateUserNominee")
		ResponseEntity<User> saveUserNominee(@RequestBody User user){
			User user1 = userService.updateUser(user);
			List<Nominee> nominees= user.getNomineeList();
			for(Nominee nominee : nominees) {
				nominee.setUserid(user.getId());
				nomineeService.updateNominee(nominee);
			}
			return ResponseEntity.ok().body(user1);
		}

	}


