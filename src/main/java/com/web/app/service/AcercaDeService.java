package com.web.app.service;


import com.web.app.entity.AcercaDe;
import com.web.app.repository.AcercaDeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AcercaDeService {
    @Autowired
    AcercaDeRepository acercadeRepository;

    public List<AcercaDe> lista(){
        return acercadeRepository.findAll();
    }

    public Optional<AcercaDe> getOne(int id){
        return acercadeRepository.findById(id);
    }

    public void Guardar(AcercaDe acercade){
        acercadeRepository.save(acercade);
    }

    public void Borrar (int id){
        acercadeRepository.deleteById(id);
    }

    public boolean ExistsById(int id){
        return acercadeRepository.existsById(id);
    }
}
