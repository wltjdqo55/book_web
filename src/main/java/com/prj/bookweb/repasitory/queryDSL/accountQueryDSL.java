package com.prj.bookweb.repasitory.queryDSL;

import com.prj.bookweb.entity.dto.accountDTO;
import com.prj.bookweb.entity.entity.QaccountEntity;
import com.prj.bookweb.entity.entity.accountEntity;
import com.prj.bookweb.entity.vo.accountVO;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class accountQueryDSL {

  private final JPAQueryFactory jpaQueryFactory;
  public accountEntity loginCheck(accountVO accountVO){

    return jpaQueryFactory
        .selectFrom(QaccountEntity.accountEntity)
        .where(
            checkUserInfo(accountVO)
        )
        .fetchOne();

  }

  private BooleanExpression checkUserInfo(accountVO accountVO){
    return QaccountEntity.accountEntity.userName.eq(accountVO.getUserName()).and(QaccountEntity.accountEntity.userBirth.eq(accountVO.getUserBirth())).and(QaccountEntity.accountEntity.userPhone.eq(accountVO.getUserPhone()));
  }

  public List<accountEntity> getSearchUsers(accountVO accountVO){
    return jpaQueryFactory
        .selectFrom(QaccountEntity.accountEntity)
        .where(
            checkSearchKeywordAndOption(accountVO)
        )
        .fetch();
  }

  private BooleanExpression checkSearchKeywordAndOption(accountVO accountVO){
    if(accountVO.getSearchOption().equals("all")){
      return QaccountEntity.accountEntity.userName.contains(accountVO.getSearchKeyword());
    }
    else {
      return QaccountEntity.accountEntity.account.eq(accountVO.getSearchOption()).and(QaccountEntity.accountEntity.userName.contains(accountVO.getSearchKeyword()));
    }
  }
}
