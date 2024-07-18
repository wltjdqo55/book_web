package com.prj.bookweb.service;

import com.prj.bookweb.entity.dto.accountDTO;
import com.prj.bookweb.entity.entity.accountEntity;
import com.prj.bookweb.entity.vo.accountVO;
import com.prj.bookweb.repasitory.jpa.accountRepository;
import com.prj.bookweb.repasitory.queryDSL.accountQueryDSL;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class accountService {

  private final accountRepository accountRepository;
  private final accountQueryDSL accountQueryDSL;

  @Transactional
  public void userAdd(accountVO accountVO){
    new accountDTO(accountRepository.save(new accountEntity(accountVO)));
  }

  public accountDTO loginCheck(accountVO accountVO){
    return new accountDTO(accountQueryDSL.loginCheck(accountVO));
  }

  public List<accountDTO> getUserAll(){
    return accountRepository.findAll().stream().map(accountDTO::new).collect(Collectors.toList());
  }

  public List<accountDTO> getSearchUsers(accountVO accountVO){
    List<accountEntity> list = accountQueryDSL.getSearchUsers(accountVO);
    return list.stream().map(accountDTO::new).collect(Collectors.toList());
  }
}
