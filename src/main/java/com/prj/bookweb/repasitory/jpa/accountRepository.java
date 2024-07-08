package com.prj.bookweb.repasitory.jpa;

import com.prj.bookweb.entity.entity.accountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accountRepository extends JpaRepository<accountEntity, Long> {

}
