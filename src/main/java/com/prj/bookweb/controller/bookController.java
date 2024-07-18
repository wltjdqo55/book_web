package com.prj.bookweb.controller;

import com.prj.bookweb.entity.dto.bookDTO;
import com.prj.bookweb.entity.vo.bookVO;
import com.prj.bookweb.service.bookService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class bookController {

  private final bookService bookService;

  @GetMapping("/book/addBookPage")
  public String addBookPage(){
    return "/book/addBook.html";
  }

  @PostMapping("/book/addBook")
  @ResponseBody
  public bookDTO addBook(bookVO bookVO) {
     return bookService.addBook(bookVO);
  }

  @GetMapping("/book/getBookList")
  @ResponseBody
  public List<bookDTO> getBookList(){
    return bookService.getBookList();
  }

  @GetMapping("/book/bookDetail/{id}")
  public String bookDetail(@PathVariable long id, Model model){
    model.addAttribute("id", id);
    return "/book/bookDetail.html";
  }

  @GetMapping("/book/getBookDetailInfo/{id}")
  @ResponseBody
  public bookDTO getBookDetailInfo(@PathVariable long id){
    return bookService.getBookDetailInfo(id);
  }
}
