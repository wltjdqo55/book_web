package com.prj.bookweb.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class bookDTO {

  private long id;

  private String bookId;

  private String bookName;

  private String bookWriter;

  private String bookPublisher;

  private String bookCategory;

  private String bookPublicationDate;
}
