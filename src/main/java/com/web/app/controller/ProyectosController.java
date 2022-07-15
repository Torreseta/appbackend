package com.web.app.controller;

import com.web.app.dto.Mensaje;
import com.web.app.dto.ProyectosDto;
import com.web.app.entity.Proyectos;
import com.web.app.service.ProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosController {
    
    @Autowired
    ProyectosService proyectosService;

    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> lista(){
        List<Proyectos> lista = proyectosService.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    } 

    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") int id){
        if(!proyectosService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encuentra el registro") {}, HttpStatus.
NOT_FOUND);
        Proyectos proyectos = proyectosService.getOne(id).get();
            return new ResponseEntity(proyectos, HttpStatus.OK);
    } 

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ProyectosDto proyectosDto){
        Proyectos proyectos = new Proyectos();
        proyectos.setNombre(proyectosDto.getNombre());
        proyectos.setImg(proyectosDto.getImg());
        proyectos.setFecha_realizacion(proyectosDto.getFecha_realizacion());
        proyectos.setDescripcion(proyectosDto.getDescripcion());
        proyectos.setLink(proyectosDto.getLink());
        
        proyectosService.Guardar(proyectos);
        return new ResponseEntity(new Mensaje("Se ha creado con exito") {}, HttpStatus.OK);
    } 

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody ProyectosDto proyectosDto){
        
        Proyectos proyectos = proyectosService.getOne(id).get();
        proyectos.setNombre(proyectosDto.getNombre());
        proyectos.setImg(proyectosDto.getImg());
        proyectos.setFecha_realizacion(proyectosDto.getFecha_realizacion());
        proyectos.setDescripcion(proyectosDto.getDescripcion());
        proyectos.setLink(proyectosDto.getLink());

        proyectosService.Guardar(proyectos);
        return new ResponseEntity(new Mensaje("Registro Actualizado"), HttpStatus.OK);
    } 

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrar(@PathVariable("id")int id){
        if(!proyectosService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encontro registro"), HttpStatus.NOT_FOUND);
        proyectosService.Borrar(id);
        return new ResponseEntity(new Mensaje("Se ha eliminado"), HttpStatus.OK);
    }
}