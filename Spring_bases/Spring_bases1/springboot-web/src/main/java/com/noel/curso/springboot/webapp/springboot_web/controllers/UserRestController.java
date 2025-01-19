package com.noel.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noel.curso.springboot.webapp.springboot_web.models.User;
import com.noel.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public UserDto details() {

    UserDto userDto = new UserDto();
    User user = new User("Noel", "Sariñena");
    userDto.setUser(user);
    userDto.setTitle("Hola mundo Spring Boot");

    return userDto;
  }

  @GetMapping("/list")
  public List<User> list() {
    User user = new User("Noel", "Sariñena");
    User user2 = new User("Pepe", "Guzmán");
    User user3 = new User("Toni", "Doe");
    
    List<User> users = Arrays.asList(user, user2, user3);
    /* List<User> users = new ArrayList<>();
    users.add(user);
    users.add(user2);
    users.add(user3); */

    return users;
  }

  @GetMapping("/details-map")
  public Map<String, Object> detailsMap() {

    User user = new User("Noel", "Sariñena");
    Map<String, Object> body = new HashMap<>();

    body.put("title", "Hola Mundo Spring Boot");
    body.put("user", user);

    return body;
  }

}
