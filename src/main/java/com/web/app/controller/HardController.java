package com.web.app.controller;

import com.web.app.dto.HardDto;
import com.web.app.dto.Mensaje;
import com.web.app.entity.Hard;
import com.web.app.service.HardService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping({"/hard"})
@CrossOrigin(origins = "http://localhost:4200")
public class HardController {
    
    @Autowired
    HardService hardService;

    @GetMapping({"/lista"})
    public ResponseEntity<List<Hard>> lista(){
        List<Hard> lista = hardService.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    } 

    @GetMapping({"/detail/{id}"})
    public ResponseEntity<Hard> getById(@PathVariable("id") int id){
        if(!hardService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encuentra el registro") {}, HttpStatus.
NOT_FOUND);
        Hard hard = hardService.getOne(id).get();
            return new ResponseEntity(hard, HttpStatus.OK);
    } 

    @PostMapping({"/create"})
    public ResponseEntity<?> create(@RequestBody HardDto hardDto){
        Hard hard = new Hard();
        hard.setPorcentaje(hardDto.getPorcentaje());
        hard.setLenguaje(hardDto.getLenguaje());
        
        hardService.save(hard);
        return new ResponseEntity(new Mensaje("Se ha creado con exito"), HttpStatus.OK);
    } 

    @PutMapping({"/update/{id}"})
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody HardDto hardDto){
        
        Hard hard = hardService.getOne(id).get();
        hard.setPorcentaje(hardDto.getPorcentaje());
        hard.setLenguaje(hardDto.getLenguaje());
        
        hardService.save(hard);
        return new ResponseEntity(new Mensaje("Registro Actualizado"), HttpStatus.OK);
    } 

    @DeleteMapping({"/delete/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!hardService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encontro registro"), HttpStatus.NOT_FOUND);
        hardService.delete(id);
        return new ResponseEntity(new Mensaje("Se ha eliminado"), HttpStatus.OK);
    }
}
