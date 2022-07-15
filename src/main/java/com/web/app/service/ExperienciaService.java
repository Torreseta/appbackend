package com.web.app.service;


import com.web.app.entity.Experiencia;
import com.web.app.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExperienciaService {
    
    @Autowired
    ExperienciaRepository experienciaRepository;
    
    public List<Experiencia> lista(){
        return experienciaRepository.findAll();
    }

    public Optional<Experiencia> getOne(int id){
        return experienciaRepository.findById(id);
    }
   
    public void Guardar(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }

    public void Borrar (int id){
        experienciaRepository.deleteById(id);
    }

    public boolean ExistsById(int id){
        return experienciaRepository.existsById(id);
    }
}
