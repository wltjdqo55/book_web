package com.prj.bookweb.repasitory.jpa;

import com.prj.bookweb.entity.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<userEntity, Long> {

}
