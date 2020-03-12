package com.nunoRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nunoRest.Model.User;
import com.nunoRest.Service.IUserService;

@RestController
@RequestMapping("/api")
public class UserController {
	private IUserService userService;

	@Autowired
	public UserController(IUserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public List<User> get(){
		return userService.getAll();
	}
	
	@PostMapping("/add")
	public void addUser(@RequestBody User user) {
		userService.add(user);
	}
	@PostMapping("/update")
	public void update(@RequestBody User user) {
		userService.update(user);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody User user) {
		userService.delete(user);
	}
	
	@GetMapping("/users/{id}")
	public User getById(@PathVariable Long id){
		return userService.getById(id);
	}
}
