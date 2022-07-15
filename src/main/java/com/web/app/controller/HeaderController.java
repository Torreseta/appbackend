package com.web.app.controller;

import com.web.app.dto.HeaderDto;
import com.web.app.dto.Mensaje;
import com.web.app.entity.Header;
import com.web.app.service.HeaderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/header")
@CrossOrigin(origins = "http://localhost:4200")
public class HeaderController {
    
    @Autowired
    HeaderService headerService;

    @GetMapping("/lista")
    public ResponseEntity<List<Header>> lista(){
        List<Header> lista = headerService.lista();
        return new ResponseEntity(lista, HttpStatus.OK);
    } 

    @GetMapping("/detail/{id}")
    public ResponseEntity<Header> getById(@PathVariable("id") int id){
        if(!headerService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encuentra el registro") {}, HttpStatus.
NOT_FOUND);
        Header header = headerService.getOne(id).get();
            return new ResponseEntity(header, HttpStatus.OK);
    } 

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody HeaderDto headerDto){
        Header header = new Header();
        
        header.setImg_banner (headerDto.getImg_banner());
        header.setPerfil (headerDto.getPerfil());
        header.setImg_perfil (headerDto.getImg_perfil());
        header.setNombre (headerDto.getNombre());
        header.setPosicion (headerDto.getPosicion());
        header.setTitulo (headerDto.getTitulo());

        headerService.Guardar(header);
        return new ResponseEntity(new Mensaje("Se ha creado con exito") {}, HttpStatus.OK);
    } 

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id")int id, @RequestBody HeaderDto headerDto){
        
        Header header = headerService.getOne(id).get();
        
        header.setImg_banner(headerDto.getImg_banner());
        header.setPerfil(headerDto.getPerfil());
        header.setImg_perfil(headerDto.getImg_perfil());
        header.setNombre(headerDto.getNombre());
        header.setPosicion(headerDto.getPosicion());
        header.setTitulo(headerDto.getTitulo());

        headerService.Guardar(header);
        return new ResponseEntity(new Mensaje("Registro Actualizado"), HttpStatus.OK);
    } 

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrar(@PathVariable("id")int id){
        if(!headerService.ExistsById(id))
            return new ResponseEntity(new Mensaje("No se encontro registro"), HttpStatus.NOT_FOUND);
        headerService.Borrar(id);
        return new ResponseEntity(new Mensaje("Se ha eliminado"), HttpStatus.OK);
    }
}