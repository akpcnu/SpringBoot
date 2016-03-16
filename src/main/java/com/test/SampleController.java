package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SampleController {

	@Autowired
	private UsersRepository usersRepository;
	
	@RequestMapping("/hello")
	public List<Users> getUsers(){
		List<Users> users = usersRepository.findAll();
		System.out.println("Size is  " + users.size());
		return users;
	}
	
}
