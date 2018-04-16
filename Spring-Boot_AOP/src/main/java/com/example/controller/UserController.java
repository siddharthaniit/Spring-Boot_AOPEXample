package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
    @RequestMapping(value="/save",method=RequestMethod.GET)
	public User save(@RequestParam int id,@RequestParam String name)
	{
		return userService.save(id,name);
		
	}
    
    @RequestMapping(value="/save1",method=RequestMethod.GET)
  	public User save1(@RequestParam int id,@RequestParam String name,@RequestParam String email)
  	{
  		return userService.save1(id,email,name);
  		
  	}
    
    @RequestMapping(value="/save2",method=RequestMethod.POST)
  	public User save2(@RequestBody User user)
  	{
  		return userService.save2(user);
  		
  	}
	
	

}
