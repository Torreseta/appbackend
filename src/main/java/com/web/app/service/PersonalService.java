package com.web.app.service;

import com.web.app.entity.Personal;
import com.web.app.repository.PersonalRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonalService {
    
    @Autowired
    PersonalRepository personalRepository;

    public List<Personal> lista(){
        return personalRepository.findAll();
    }

    public Optional<Personal> getOne(int id){
        return personalRepository.findById(id);
    }

    public void save(Personal personal){
        personalRepository.save(personal);
    }

    public void delete(int id){
        personalRepository.deleteById(id);
    }

    public boolean ExistsById(int id){
        return personalRepository.existsById(id);
    }

}
