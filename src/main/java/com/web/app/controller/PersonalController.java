package com.web.app.controller;

import com.web.app.dto.Mensaje;
import com.web.app.dto.PersonalDto;
import com.web.app.entity.Personal;
import com.web.app.service.PersonalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping({"/personal"})
@CrossOrigin(origins = "http://localhost:4200")
public class PersonalController {
    
    @Autowired
    PersonalService personalService;

    @GetMapping({"/lista"})
    public ResponseEntity<List<Personal>> lista(){
        List<Personal> lista = personalService.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    } 

    @GetMapping({"/detail/{id}"})
    public ResponseEntity<Personal> getById(@PathVariable("id") int id){
        if(!personalService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encuentra el registro"), HttpStatus.
NOT_FOUND);
        Personal personal = personalService.getOne(id).get();
            return new ResponseEntity(personal, HttpStatus.OK);
    } 

    @PostMapping({"/create"})
    public ResponseEntity<?> create(@RequestBody PersonalDto personalDto){
        Personal personal = new Personal();
        personal.setHeader (personalDto.getHeader());
        personal.setAcercade (personalDto.getAcercade());
        personal.setEducacion (personalDto.getEducacion());
        personal.setExperiencia (personalDto.getExperiencia());
        personal.setHard (personalDto.getHard());
        personal.setProyectos (personalDto.getProyectos());
        personalService.save(personal);
        return new ResponseEntity(new Mensaje("Se ha creado con exito"), HttpStatus.OK);
    } 

    @PutMapping({"/update/{id}"})
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody PersonalDto personalDto){
        Personal personal = personalService.getOne(id).get();
        personal.setHeader (personalDto.getHeader());
        personal.setAcercade (personalDto.getAcercade());
        personal.setEducacion (personalDto.getEducacion());
        personal.setExperiencia (personalDto.getExperiencia());
        personal.setHard (personalDto.getHard());
        personal.setProyectos (personalDto.getProyectos());
        personalService.save(personal);
        return new ResponseEntity(new Mensaje("Registro Actualizado"), HttpStatus.OK);
    } 

    @DeleteMapping({"/borrar/{id}"})
    public ResponseEntity<?> borrar(@PathVariable("id")int id){
        if(!personalService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encontro registro"), HttpStatus.NOT_FOUND);
        personalService.delete(id);
        return new ResponseEntity(new Mensaje("Se ha eliminado") {}, HttpStatus.OK);
    }

}
