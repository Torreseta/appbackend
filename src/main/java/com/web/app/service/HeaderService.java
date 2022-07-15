package com.web.app.service;

import com.web.app.entity.Header;
import com.web.app.repository.HeaderRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HeaderService {
    
    @Autowired
    HeaderRepository headerRepository;

    public List<Header> lista(){
        return headerRepository.findAll();
    }

    public Optional<Header> getOne(int id){
        return headerRepository.findById(id);
    }

    public void Guardar(Header header){
        headerRepository.save(header);
    }

    public void Borrar (int id){
        headerRepository.deleteById(id);
    }

    public boolean ExistsById(int id){
        return headerRepository.existsById(id);
    }
}