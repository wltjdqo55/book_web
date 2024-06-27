package com.prj.bookweb.controller;

import com.prj.bookweb.entity.vo.userVO;
import com.prj.bookweb.service.accountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class accountController {

  private final accountService accountService;

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
    userVO.setAccount("회원");
    accountService.userAdd(userVO);

    return "/account/userAdd";
  }
}
