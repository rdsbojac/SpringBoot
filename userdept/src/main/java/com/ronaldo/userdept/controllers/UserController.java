package com.ronaldo.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldo.userdept.entities.User;
import com.ronaldo.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value ="/users")
public class UserController {
	
	@Autowired /*Injeção de dependencia*/
	private UserRepository userRepository;
	
	
	@GetMapping
	public List<User> findAll() { /*Metodo que retorna todos os usuarios do banco de dados*/
		List<User> result = userRepository.findAll();
		return result;
	}
	
	@GetMapping(value="/{id}")
	public User findById(@PathVariable Long id) { /*Metodo que retorna usuario passado como argumento*/
		User result = userRepository.findById(id).get(); 
		return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		User result = userRepository.save(user);
		return result;
	}
	

	


}
