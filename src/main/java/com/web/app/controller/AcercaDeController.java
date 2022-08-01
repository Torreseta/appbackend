package com.web.app.controller;


import com.web.app.dto.AcercaDeDto;
import com.web.app.dto.Mensaje;
import com.web.app.entity.AcercaDe;
import com.web.app.service.AcercaDeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/acercade"})/*entrellaves ({"/acercade"})*/
@CrossOrigin(origins = "http://localhost:4200")
public class AcercaDeController {
    
    @Autowired
    AcercaDeService acercadeService;

    @GetMapping({"/lista"})
    public ResponseEntity<List<AcercaDe>> lista(){
        List<AcercaDe> lista = acercadeService.lista();
           return new ResponseEntity(lista, HttpStatus.OK);
    } 

    @GetMapping({"/detail/{id}"})
    public ResponseEntity<AcercaDe> getById(@PathVariable("id") int id){
        if(!acercadeService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encuentra el registro") {}, HttpStatus.
NOT_FOUND);
        AcercaDe acercade = acercadeService.getOne(id).get();
            return new ResponseEntity(acercade, HttpStatus.OK);
    } 

    @PostMapping({"/create"})
    public ResponseEntity<?> create(@RequestBody AcercaDeDto acercadeDto){
        AcercaDe acercade = new AcercaDe();
        acercade.setInfo(acercadeDto.getInfo());
        
        acercadeService.save(acercade);
            return new ResponseEntity(new Mensaje("Se ha creado con exito"), HttpStatus.OK);
    } 

    @PutMapping({"/update/{id}"})
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody AcercaDeDto acercadeDto){
        
        AcercaDe acercade = acercadeService.getOne(id).get();
        acercade.setInfo(acercadeDto.getInfo());
        
        acercadeService.save(acercade);
            return new ResponseEntity(new Mensaje("Registro Actualizado"), HttpStatus.OK);
    } 

    @DeleteMapping({"/delete/{id}"})
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        if(!acercadeService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encontro registro"), HttpStatus.NOT_FOUND);
        acercadeService.delete(id);
            return new ResponseEntity(new Mensaje("Se ha eliminado"), HttpStatus.OK);
    }
}