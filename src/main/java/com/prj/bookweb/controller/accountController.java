package com.prj.bookweb.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class accountController {

  @GetMapping("/")
  public String index(){
    return "/index.html";
  }

  @GetMapping("/account/login")
  public String login(){
    return "/account/login.html";
  }

  @GetMapping("/account/join")
  public String join(){
    return "/account/join.html";
  }
}
