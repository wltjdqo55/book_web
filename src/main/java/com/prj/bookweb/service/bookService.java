package com.prj.bookweb.service;

import com.prj.bookweb.entity.dto.bookDTO;
import com.prj.bookweb.entity.entity.bookEntity;
import com.prj.bookweb.entity.vo.bookVO;
import com.prj.bookweb.repasitory.jpa.bookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class bookService {

  private final bookRepository bookRepository;

  public boolean addBook(bookVO bookVO){
    System.out.println(bookVO);
    bookDTO bookDTO = new bookDTO(bookRepository.save(new bookEntity(bookVO)));
    System.out.println(bookDTO);
    //bookRepository.findById(bookDTO.getId());
    return false;
  }
}
