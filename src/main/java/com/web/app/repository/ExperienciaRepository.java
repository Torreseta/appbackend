package com.web.app.repository;

import com.web.app.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {
}