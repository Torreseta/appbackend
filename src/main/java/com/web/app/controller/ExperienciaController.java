package com.web.app.controller;

import com.web.app.dto.ExperienciaDto;
import com.web.app.dto.Mensaje;
import com.web.app.entity.Experiencia;
import com.web.app.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping({"/experiencia"})
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    ExperienciaService experienciaService;

    @GetMapping({"/lista"})
    public ResponseEntity<List<Experiencia>> lista(){
        List<Experiencia> lista = experienciaService.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    } 

    @GetMapping({"/detail/{id}"})
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){
        if(!experienciaService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encuentra el registro") {}, HttpStatus.
NOT_FOUND);
        Experiencia experiencia = experienciaService.getOne(id).get();
            return new ResponseEntity(experiencia, HttpStatus.OK);
    } 

    @PostMapping({"/create"})
     public ResponseEntity<?> create(@RequestBody ExperienciaDto experienciaDto){
        Experiencia experiencia = new Experiencia();
        experiencia.setEmpresa(experienciaDto.getEmpresa());
        experiencia.setImg_exp(experienciaDto.getImg_exp());
        experiencia.setCargo(experienciaDto.getCargo());
        experiencia.setInicio(experienciaDto.getInicio());
        experiencia.setFin(experienciaDto.getFin());
        experiencia.setProvincia(experienciaDto.getProvincia());
        experiencia.setPais(experienciaDto.getPais());
        experienciaService.save(experiencia);
            return new ResponseEntity(new Mensaje("Se ha creado con exito"), HttpStatus.OK);
    } 

    @PutMapping({"/update/{id}"})
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody ExperienciaDto experienciaDto){
        Experiencia experiencia = experienciaService.getOne(id).get();
        experiencia.setEmpresa(experienciaDto.getEmpresa());
        experiencia.setImg_exp(experienciaDto.getImg_exp());
        experiencia.setCargo(experienciaDto.getCargo());
        experiencia.setInicio(experienciaDto.getInicio());
        experiencia.setFin(experienciaDto.getFin());
        experiencia.setProvincia(experienciaDto.getProvincia());
        experiencia.setPais(experienciaDto.getPais());
        experienciaService.save(experiencia);
            return new ResponseEntity(new Mensaje("Registro Actualizado"), HttpStatus.OK);
    } 

    @DeleteMapping({"/delete/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!experienciaService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encontro registro"), HttpStatus.NOT_FOUND);
        experienciaService.delete(id);
            return new ResponseEntity(new Mensaje("Se ha eliminado"), HttpStatus.OK);
    }
}
