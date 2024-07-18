package com.prj.bookweb.service;

import com.prj.bookweb.entity.dto.accountDTO;
import com.prj.bookweb.entity.dto.bookDTO;
import com.prj.bookweb.entity.entity.bookEntity;
import com.prj.bookweb.entity.entity.fileEntity;
import com.prj.bookweb.entity.vo.bookVO;
import com.prj.bookweb.repasitory.jpa.bookRepository;
import com.prj.bookweb.repasitory.jpa.fileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class bookService {

  private final bookRepository bookRepository;
  private final fileRepository fileRepository;


  public bookDTO addBook(bookVO bookVO){
    bookDTO bookDTO = new bookDTO(bookRepository.save(new bookEntity(bookVO)));
    if(bookVO.getBookImage()!=null){
        bookImageAdd(bookVO.getBookImage(), bookDTO.getId());
    }
    return bookDTO;
  }

  public void bookImageAdd(List<MultipartFile> list, long id){

    String path = "C:\\study\\bookweb\\imageFile";
    File Folder = new File(path);

    if(!Folder.exists()){
      try{
        boolean result = Folder.mkdir();
        if(result){
          System.out.println("폴더 생성완료");
        }else{
          System.out.println("폴더 생성에 실패하였습니다.");
        }
      }catch(Exception e){
        e.getStackTrace();
      }
    }else{
      System.out.println("폴더가 이미 존재합니다.");
    }

    for(MultipartFile multipartFile : list){

      String fileName = multipartFile.getOriginalFilename();

      File savaFile = new File(path, Objects.requireNonNull(fileName));
      try (FileOutputStream fos = new FileOutputStream(savaFile)) {
        fos.write(multipartFile.getBytes());
      } catch (IOException e) {
        e.printStackTrace();
      }
      int pathPoint = Objects.requireNonNull(fileName).lastIndexOf('.');
      String filePoint = fileName.substring(pathPoint + 1);

      fileRepository.save(new fileEntity(multipartFile.getOriginalFilename(), path, filePoint, id, fileName));
    }
  }

  public List<bookDTO> getBookList(){
    return bookRepository.findAll().stream().map(bookDTO::new).collect(Collectors.toList());
  }
}
