package com.noel.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.noel.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {

    User user = new User("Noel", "Sariñena");

    user.setEmail("noelsava25@gmail.com");
    model.addAttribute("title", "Hola Mundo Spring Boot");
    model.addAttribute("user", user);

    return "details";
  }

  @GetMapping("/list")
  public String list(ModelMap model) {
    List<User> users = Arrays.asList(
      new User("Pepa", "Gonzalez"), 
      new User("Lalo", "Perez", "lalo@correo.com"),
      new User("Juanita", "Roe", "juana@correo.com"),
      new User("Noel", "Sariñena")
    );

    model.addAttribute("users", users);
    model.addAttribute("title", "Listado de usuarios");

    return "list";
  }

}
