package com.web.app.repository;

import com.web.app.entity.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository extends JpaRepository<AcercaDe, Integer> {
    
}