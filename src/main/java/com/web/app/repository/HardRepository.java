package com.web.app.repository;

import com.web.app.entity.Hard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardRepository extends JpaRepository<Hard, Integer> {
    
}