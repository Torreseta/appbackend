package com.web.app.repository;

import com.web.app.entity.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository extends JpaRepository<AcercaDe, Integer> {
   /*List<AcercaDe>findAll();
   Optional<AcercaDe> findById(int id);
   void create(AcercaDe acercade);
   void update(AcercaDe acercade);
   void save(AcercaDe acercade);
   void deleteById(int id); 
   boolean existsById(int id);*/
}