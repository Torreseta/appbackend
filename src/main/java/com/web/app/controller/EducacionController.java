package com.web.app.controller;

import com.web.app.dto.EducacionDto;
import com.web.app.dto.Mensaje;
import com.web.app.entity.Educacion;
import com.web.app.service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    @Autowired
    EducacionService educacionService;

    @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> lista(){
        List<Educacion> lista = educacionService.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    } 

    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id") int id){
        if(!educacionService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encuentra el registro") {}, HttpStatus.
NOT_FOUND);
        Educacion educacion = educacionService.getOne(id).get();
            return new ResponseEntity(educacion, HttpStatus.OK);
    } 

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody EducacionDto educacionDto){
        Educacion educacion = new Educacion();
        educacion.setLogo_img(educacionDto.getLogo_img());
        educacion.setInstitucion(educacionDto.getInstitucion());
        educacion.setTitulo(educacionDto.getTitulo());
        educacion.setPeriodo(educacionDto.getPeriodo());
        
        educacionService.Guardar(educacion);
        return new ResponseEntity(new Mensaje("Se ha creado con exito") {}, HttpStatus.OK);
    } 

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody EducacionDto educacionDto){
        
        Educacion educacion = educacionService.getOne(id).get();
        educacion.setLogo_img(educacionDto.getLogo_img());
        educacion.setInstitucion(educacionDto.getInstitucion());
        educacion.setTitulo(educacionDto.getTitulo());
        educacion.setPeriodo(educacionDto.getPeriodo());

        educacionService.Guardar(educacion);
        return new ResponseEntity(new Mensaje("Registro Actualizado"), HttpStatus.OK);
    } 

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrar(@PathVariable("id")int id){
        if(!educacionService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encontro registro"), HttpStatus.NOT_FOUND);
        educacionService.Borrar(id);
        return new ResponseEntity(new Mensaje("Se ha eliminado"), HttpStatus.OK);
    }
}