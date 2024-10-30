package com.noel.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noel.curso.springboot.webapp.springboot_web.models.User;
import com.noel.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/var")
public class PathVariableController {

  // ATRIBUTOS DE CLASE

  @Value("${config.username}")
  private String username;

  @Value("${config.message}")
  private String message;

  @Value("${config.listOfValues}")
  private List<String> listOfValues;

  @Value("${config.code}")
  private Integer code;

  @Value("#{'${config.listOfValues}'.split(',')}")
  private List<String> valueList;

  @Value("#{'${config.listOfValues}'.toUpperCase()}")
  private String valueString;

  @Value("#{${config.valuesMap}}")
  private Map<String, Object> valueMap;

  @Value("#{${config.valuesMap}.product}")
  private String product;

  @Value("#{${config.valuesMap}.price}")
  private Long price;

  @Autowired
  private Environment environment;

  // MÉTODOS

  @GetMapping("/baz/{message}")
  public ParamDto baz(@PathVariable String message) {
    
    ParamDto param = new ParamDto();
    param.setMessage(message);
    return param;

  }

  @GetMapping("/mix/{product}/{id}")
  public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {
    
    Map<String, Object> json = new HashMap<>();
    json.put("product", product);
    json.put("id", id);
    
    return json;

  }

  @PostMapping("/create")
  public User creatUser(@RequestBody User user) {
    // Hacer algo con el usuariop, save en la bbdd
    user.setName(user.getName().toUpperCase());
    
    return user;
  }

  @GetMapping("/values")
  public Map<String, Object> valuesMap() {
    Map<String, Object> json= new HashMap<>();

    json.put("username", username);
    json.put("code", code);
    json.put("message", message);
    json.put("message2", environment.getProperty("config.message"));
    json.put("code2", environment.getProperty("config.code", Long.class));
    json.put("listOfValues", listOfValues);
    json.put("valueList", valueList);
    json.put("valueString", valueString.split(","));
    json.put("valueMap", valueMap);
    json.put("product", product);
    json.put("price", price);

    return json;
  }

}
