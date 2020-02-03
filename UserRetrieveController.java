package com.rest.springboot.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.springboot.bean.User;
import com.rest.springboot.bean.UserRegistration;


@Controller
public class UserRetrieveController {
  
  @RequestMapping(method = RequestMethod.GET, value="/user/alluser")
  
  @ResponseBody
  public List<User> getAllUsers() {
  return UserRegistration.getInstance().getUserRecords();
  }
  }