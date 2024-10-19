package com.noel.curso.springboot.webapp.springboot_web.models;

public class User {

  // ATRIBUTOS
  private String name;
  private String lastname;

  // CONSTRUCTORES
  public User() {
  }

  public User(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
  }

  // GETTERS Y SETTERS
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  

}
