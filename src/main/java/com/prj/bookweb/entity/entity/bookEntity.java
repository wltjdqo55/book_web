package com.prj.bookweb.entity.entity;

import com.prj.bookweb.entity.vo.bookVO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name="book")
public class bookEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String bookId;

  private String bookName;

  private String bookWriter;

  private String bookPublisher;

  private String bookCategory;

  private String bookPublicationDate;

  private boolean reserved;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
  private List<fileEntity> files = new ArrayList<>();

  public bookEntity(bookVO bookVO){
    this.id = bookVO.getId();
    this.bookId = bookVO.getBookId();
    this.bookName = bookVO.getBookName();
    this.bookWriter = bookVO.getBookWriter();
    this.bookPublisher = bookVO.getBookPublisher();
    this.bookCategory = bookVO.getBookCategory();
    this.bookPublicationDate = bookVO.getBookPublicationDate();
  }

  public bookEntity(long id){
    this.id = id;
  }
}
