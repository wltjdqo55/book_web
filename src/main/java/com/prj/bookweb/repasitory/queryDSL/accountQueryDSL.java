package com.prj.bookweb.repasitory.queryDSL;

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
  public boolean loginCheck(accountVO accountVO){
    List<accountEntity> entity  = jpaQueryFactory
        .selectFrom(QaccountEntity.accountEntity)
        .where(
            checkUserInfo(accountVO)
        )
        .fetch();
    return entity != null && !entity.isEmpty();
  }

  private BooleanExpression checkUserInfo(accountVO accountVO){
    return QaccountEntity.accountEntity.userName.eq(accountVO.getUserName()).and(QaccountEntity.accountEntity.userBirth.eq(accountVO.getUserBirth())).and(QaccountEntity.accountEntity.userPhone.eq(accountVO.getUserPhone()));
  }
}