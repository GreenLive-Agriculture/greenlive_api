package osc.greenlive.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import osc.greenlive.model.User;
import osc.greenlive.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserServiceImpl user_service ;
	
	public UserController(UserServiceImpl user_service)
	{
		this.user_service = user_service ;
	}
	
	@PostMapping("/save")
	public User userSave(User user) {
		return this.user_service.saveUser(user);
	}

}
