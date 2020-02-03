package com.rest.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.springboot.bean.User;
import com.rest.springboot.bean.UserRegistration;
import com.rest.springboot.bean.UserRegistrationResponse;

@Controller
public class UserRegistrationController {

	  @RequestMapping(method = RequestMethod.POST, value="/register/user")
	  @ResponseBody
	  public UserRegistrationResponse registerStudent(@RequestBody User user) {
	  System.out.println("In registerStudent");
	  UserRegistrationResponse usrregreply = new UserRegistrationResponse();           
	  UserRegistration.getInstance().add(user);
	        //We are setting the below value just to reply a message back to the caller
	  usrregreply.setName(user.getName());
	  usrregreply.setPhonenumber(user.getPhonenumber());
	  usrregreply.setUserregistrationnumber(user.getUserregistrationnumber());
	 // usrregreply.setPhonenumber(user.getPhonenumber());
	  //usrregreply.setUserregistrationnumber
	usrregreply.setRegistrationStatus(" Successful");
	
	  return usrregreply;
	}

}
