package com.prj.bookweb.repasitory.jpa;

import com.prj.bookweb.entity.entity.bookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepository extends JpaRepository<bookEntity, Long> {
}
