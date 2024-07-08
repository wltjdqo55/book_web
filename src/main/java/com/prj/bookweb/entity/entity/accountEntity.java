package com.prj.bookweb.entity.entity;

import com.prj.bookweb.entity.vo.accountVO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Table(name="users")
public class accountEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;

  private String userName;

  private String userEmail;

  private String userPhone;

  private String userBirth;

  private String userPostAddress;

  private String userDetailAddress;

  private String account;

  public accountEntity(accountVO accountVO){
    this.id = accountVO.getId();
    this.userName = accountVO.getUserName();
    this.userEmail = accountVO.getUserEmail();
    this.userPhone = accountVO.getUserPhone();
    this.userBirth = accountVO.getUserBirth();
    this.userPostAddress = accountVO.getUserPostAddress();
    this.userDetailAddress = accountVO.getUserDetailAddress();
    this.account = accountVO.getAccount();
  }

}
