package com.prj.bookweb.eNum;

public enum eNumAccountType {

  member("회원"),
  employee("사원");

  private String value;

  eNumAccountType(String value){
    this.value = value;
  }

  public String getValue(){
    return value;
  }
}
