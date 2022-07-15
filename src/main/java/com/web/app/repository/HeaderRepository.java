package com.web.app.repository;

import com.web.app.entity.Header;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface HeaderRepository extends JpaRepository<Header, Integer> {
    
}
