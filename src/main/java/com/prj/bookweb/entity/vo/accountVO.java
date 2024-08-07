package com.prj.bookweb.entity.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class accountVO {

  private long id;

  private String userName;

  private String userBirth;

  private String userPhone;

  private String userEmail;

  private String userPostAddress;

  private String userDetailAddress;

  private String account;

  // 검색조건
  private String searchOption;

  private String searchKeyword;

}
