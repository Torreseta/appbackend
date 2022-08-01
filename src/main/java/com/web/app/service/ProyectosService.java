package com.web.app.service;


import com.web.app.entity.Proyectos;
import com.web.app.repository.ProyectosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {
    
    @Autowired
    ProyectosRepository proyectosRepository;

    public List<Proyectos> lista(){
        return proyectosRepository.findAll();
    }

    public Optional<Proyectos> getOne(int id){
        return proyectosRepository.findById(id);
    }

    public void save(Proyectos proyectos){
        proyectosRepository.save(proyectos);
    }

    public void delete(int id){
        proyectosRepository.deleteById(id);
    }

    public boolean ExistsById(int id){
        return proyectosRepository.existsById(id);
    }
}
