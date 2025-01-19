package com.noel.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.noel.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.noel.curso.springboot.webapp.springboot_web.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
  
  @RequestMapping("/foo")
  public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola que tal") String message) {
    ParamDto param = new ParamDto();
    param.setMessage(message != null ? message : "Hola");

    return param;
  }
  
  @GetMapping("/bar")
  public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {
    
    ParamMixDto params = new ParamMixDto();
    params.setMessage(text);
    params.setCode(code);

    return params;
  }

  @GetMapping("/request")
  public ParamMixDto request(HttpServletRequest request) {
    Integer code = 0; 
    try {
      code = Integer.parseInt(request.getParameter("code"));
    } catch (NumberFormatException nfe) {}
    
    ParamMixDto params = new ParamMixDto();
    params.setCode(code);
    params.setMessage(request.getParameter("message"));

    return params;
  }

}
