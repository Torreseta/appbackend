package com.web.app.service;


import com.web.app.entity.Hard;
import com.web.app.repository.HardRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HardService {
    
    @Autowired
    HardRepository hardRepository;

    public List<Hard> lista(){
        return hardRepository.findAll();
    }

    public Optional<Hard> getOne(int id){
        return hardRepository.findById(id);
    }

    public void Guardar(Hard hard){
        hardRepository.save(hard);
    }

    public void Borrar (int id){
        hardRepository.deleteById(id);
    }

    public boolean ExistsById(int id){
        return hardRepository.existsById(id);
    }
}