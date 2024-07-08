package com.prj.bookweb.controller;

import com.prj.bookweb.account.accountSession;
import com.prj.bookweb.entity.vo.accountVO;
import com.prj.bookweb.service.accountService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
  public String userAdd(accountVO userVO){
    System.out.println(userVO);
    userVO.setAccount("회원");
    accountService.userAdd(userVO);

    return "/account/userAdd.html";
  }

  @GetMapping("/account/success")
  public String success(){
    return "/account/success.html";
  }

  @GetMapping("/account/loginCheck")
  @ResponseBody
  public boolean loginCheck(accountVO accountVO, HttpSession session){
    boolean flag = false;
    if(accountService.loginCheck(accountVO)){
      accountSession.setSession(accountVO, session, 3600);
      flag = true;
    }
    return flag;
  }

  @GetMapping("/main")
  public String mainPage(){
    return "/main.html";
  }
}
