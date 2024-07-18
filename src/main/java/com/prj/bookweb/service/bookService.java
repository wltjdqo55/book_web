package com.prj.bookweb.service;

import com.prj.bookweb.entity.vo.bookVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class bookService {

  public boolean addBook(bookVO bookVO){
    System.out.println(bookVO.getBookImage().get(0));
    return false;
  }
}
