package com.prj.bookweb.controller;

import com.prj.bookweb.entity.vo.userVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

  @GetMapping("/account/userAdd")
  public String join(){
    return "/account/userAdd.html";
  }

  @PostMapping("/account/userAddOK")
  public String userAdd(userVO userVO){
    System.out.println(userVO);
    return "/account/userAdd";
  }
}
