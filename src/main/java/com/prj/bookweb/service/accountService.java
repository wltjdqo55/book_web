package com.prj.bookweb.service;

import com.prj.bookweb.entity.dto.userDTO;
import com.prj.bookweb.entity.entity.userEntity;
import com.prj.bookweb.entity.vo.userVO;
import com.prj.bookweb.repasitory.jpa.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class accountService {

  private final userRepository userRepository;

  @Transactional
  public void userAdd(userVO userVO){

    new userDTO(userRepository.save(new userEntity(userVO)));
  }
}
