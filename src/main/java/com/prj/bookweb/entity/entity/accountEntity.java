package com.prj.bookweb.entity.entity;

import com.prj.bookweb.eNum.eNumAccountType;
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

  @Enumerated(EnumType.STRING)
  private eNumAccountType account;

  public accountEntity(accountVO accountVO){
    this.id = accountVO.getId();
    this.userName = accountVO.getUserName();
    this.userEmail = accountVO.getUserEmail();
    this.userPhone = accountVO.getUserPhone();
    this.userBirth = accountVO.getUserBirth();
    this.userPostAddress = accountVO.getUserPostAddress();
    this.userDetailAddress = accountVO.getUserDetailAddress();
    if(eNumAccountType.employee.name().equals(accountVO.getAccount())){
      this.account = eNumAccountType.employee;
    }
    else if(eNumAccountType.member.name().equals(accountVO.getAccount())){
      this.account = eNumAccountType.member;
    }
  }

}
