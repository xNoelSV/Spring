package com.noel.curso.springboot.webapp.springboot_web.models.dto;

import com.noel.curso.springboot.webapp.springboot_web.models.User;

public class UserDto {

  // ATRIBUTOS

  private String title;
  private User user;

  // GETTERS Y SETTERS

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

}
