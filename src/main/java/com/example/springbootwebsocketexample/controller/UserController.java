package com.example.springbootwebsocketexample.controller;

import com.example.springbootwebsocketexample.model.User;
import com.example.springbootwebsocketexample.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


  @MessageMapping("/user")
  @SendTo("/topic/user")
  public UserResponse getUser(User user){
    return new UserResponse(user.getMessage());
  }
}
