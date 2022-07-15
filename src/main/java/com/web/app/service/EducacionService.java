package com.web.app.service;

import com.web.app.entity.Educacion;
import com.web.app.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    
    @Autowired
    EducacionRepository educacionRepository;

    public List<Educacion> lista(){
        return educacionRepository.findAll();
    }

    public Optional<Educacion> getOne(int id){
        return educacionRepository.findById(id);
    }

    public void Guardar(Educacion educacion){
        educacionRepository.save(educacion);
    }

    public void Borrar (int id){
        educacionRepository.deleteById(id);
    }

    public boolean ExistsById(int id){
        return educacionRepository.existsById(id);
    }
}