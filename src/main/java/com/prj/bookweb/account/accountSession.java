package com.prj.bookweb.account;


import com.prj.bookweb.entity.dto.accountDTO;
import com.prj.bookweb.entity.vo.accountVO;
import jakarta.servlet.http.HttpSession;

public class accountSession {

  //세션값 설정
  public static void setSession(accountDTO accountDTO, HttpSession session, int time){
    session.setAttribute("userInfo", accountDTO);
    intervalSession(time, session);
  }

  //세션 유지시간 설정
  public static void intervalSession(int time, HttpSession session){
    session.setMaxInactiveInterval(time);
  }

  //세션값 삭제
  public static void removeSession(String sessionName, HttpSession session){    
    session.removeAttribute(sessionName);
  }
  
  //세션 전체 제거, 무효화
  public static void closeSession(HttpSession session){
    session.invalidate();
  }
}
