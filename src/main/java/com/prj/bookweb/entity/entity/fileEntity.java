package com.prj.bookweb.entity.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="file")
public class fileEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String originalFileName;

  private String filePath;

  private String fileType;

  private String fileName;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "book_id")
  private bookEntity book;

  public fileEntity(String originalFileName, String path, String fileType, long id, String fileName){
    this.fileName = fileName;
    this.originalFileName = originalFileName;
    this.fileType = fileType;
    this.filePath = path;
    this.book = new bookEntity(id);
  }
}
