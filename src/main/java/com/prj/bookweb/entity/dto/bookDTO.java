package com.prj.bookweb.entity.dto;

import com.prj.bookweb.entity.entity.bookEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class bookDTO {

  long id;

  private String bookId;

  private String bookName;

  private String bookWriter;

  private String bookPublisher;

  private String bookCategory;

  private String bookPublicationDate;

  private boolean reserved;

  public bookDTO(bookEntity bookEntity) {
    this.id = bookEntity.getId();
    this.bookId = bookEntity.getBookId();
    this.bookName = bookEntity.getBookName();
    this.bookWriter = bookEntity.getBookWriter();
    this.bookPublisher = bookEntity.getBookPublisher();
    this.bookCategory = bookEntity.getBookCategory();
    this.bookPublicationDate = bookEntity.getBookPublicationDate();
  }
}
