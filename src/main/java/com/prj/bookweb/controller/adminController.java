package com.prj.bookweb.controller;

import com.prj.bookweb.entity.dto.accountDTO;
import com.prj.bookweb.entity.vo.accountVO;
import com.prj.bookweb.service.accountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class adminController {

  private final accountService accountService;

  @GetMapping("/admin/adminMain")
  public String adminMain(){
    return "/admin/adminMain.html";
  }

  @GetMapping("/admin/getUserAll")
  @ResponseBody
  public List<accountDTO> getUserAll(){
    return accountService.getUserAll();
  }

  @GetMapping("/admin/getSearchUsers")
  @ResponseBody
  public List<accountDTO> getSearchUsers(accountVO accountVO){
    System.out.println(accountVO);
    return accountService.getSearchUsers(accountVO);
  }
}
