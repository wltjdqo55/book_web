package com.prj.bookweb.repasitory.jpa;

import com.prj.bookweb.entity.entity.fileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fileRepository extends JpaRepository<fileEntity, Long> {
}
