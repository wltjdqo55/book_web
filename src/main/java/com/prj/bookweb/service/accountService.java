package com.prj.bookweb.service;

import com.prj.bookweb.entity.dto.accountDTO;
import com.prj.bookweb.entity.entity.accountEntity;
import com.prj.bookweb.entity.vo.accountVO;
import com.prj.bookweb.repasitory.jpa.accountRepository;
import com.prj.bookweb.repasitory.queryDSL.accountQueryDSL;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class accountService {

  private final accountRepository accountRepository;
  private final accountQueryDSL accountQueryDSL;

  @Transactional
  public void userAdd(accountVO accountVO){
    new accountDTO(accountRepository.save(new accountEntity(accountVO)));
  }

  public accountEntity loginCheck(accountVO accountVO){
    return accountQueryDSL.loginCheck(accountVO);
  }
}
