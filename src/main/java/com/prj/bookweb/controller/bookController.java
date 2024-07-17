package com.prj.bookweb.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class bookController {

  @GetMapping("/book/addBookPage")
  public String addBookPage(){
    return "/book/addBook.html";
  }
}
