package com.prj.bookweb.entity.entity;

import com.prj.bookweb.entity.vo.bookVO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="book")
public class bookEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long Id;

  private String bookId;

  private String bookName;

  private String bookWriter;

  private String bookPublisher;

  private String bookCategory;

  private String bookPublicationDate;

  private boolean isReserved;

  public bookEntity(bookVO bookVO){
    this.Id = bookVO.getId();
    this.bookId = bookVO.getBookId();
    this.bookName = bookVO.getBookName();
    this.bookWriter = bookVO.getBookWriter();
    this.bookPublisher = bookVO.getBookPublisher();
    this.bookCategory = bookVO.getBookCategory();
    this.bookPublicationDate = bookVO.getBookPublicationDate();
  }
}
