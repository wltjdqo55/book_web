package com.prj.bookweb.entity.dto;

import com.prj.bookweb.entity.entity.userEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class userDTO {

  long id;

  private String userName;

  private String userEmail;

  private String userPhone;

  private String userBirth;

  private String userPostAddress;

  private String userDetailAddress;

  private String account;

  public userDTO(userEntity entity) {
    this.id = entity.getId();
    this.userName = entity.getUserName();
    this.userEmail = entity.getUserEmail();
    this.userPhone = entity.getUserPhone();
    this.userBirth = entity.getUserBirth();
    this.userPostAddress = entity.getUserPostAddress();
    this.userDetailAddress = entity.getUserDetailAddress();
    this.account = entity.getAccount();
  }
}
