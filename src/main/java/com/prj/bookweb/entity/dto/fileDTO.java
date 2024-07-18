package com.prj.bookweb.entity.dto;

import com.prj.bookweb.entity.entity.fileEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class fileDTO {

  private long id;

  private String originalFileName;

  private String filePath;

  private String fileType;

  private String fileName;

  public fileDTO(fileEntity file){
    this.id = file.getId();
    this.originalFileName = file.getOriginalFileName();
    this.filePath = file.getFilePath();
    this.fileName = file.getFileName();
    this.fileType = file.getFileType();
  }
}
