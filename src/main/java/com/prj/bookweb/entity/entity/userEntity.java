package com.prj.bookweb.entity.entity;

import com.prj.bookweb.entity.vo.userVO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Table(name="users")
public class userEntity {

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

  public userEntity(userVO userVO){
    this.id = userVO.getId();
    this.userName = userVO.getUserName();
    this.userEmail = userVO.getUserEmail();
    this.userPhone = userVO.getUserPhone();
    this.userBirth = userVO.getUserBirth();
    this.userPostAddress = userVO.getUserPostAddress();
    this.userDetailAddress = userVO.getUserDetailAddress();
    this.account = userVO.getAccount();
  }

}
