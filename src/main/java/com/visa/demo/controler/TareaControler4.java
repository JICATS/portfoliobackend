/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.controler;

import com.visa.demo.model.Tarea4;
import com.visa.demo.service.TareaService4;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JORGE CASTILLO
 */
@RestController
@CrossOrigin(origins="https://frontendpruebas-e410e.web.app")
@RequestMapping("/api/")
public class TareaControler4 {
    
    @Autowired
    private TareaService4 tareaService4;
    
    //listar users
    @GetMapping("/proyectos")
    public List<Tarea4> listar3(){
        return tareaService4.findAllusers();
    }
    //guardar
    @PostMapping("/proyectos")
    public Tarea4 guardar(@RequestBody Tarea4 tarea){
        return tareaService4.save(tarea);
    }
    
    
    //get tarea
    @GetMapping("/proyectos/{id}")
    public Tarea4 GetTarea(@PathVariable Integer id){
        return tareaService4.findById(id);
    }
    
    //modificar
    @PutMapping("/proyectos/{id}")
    public Tarea4 modicar(@RequestBody Tarea4 tarea,@PathVariable Integer id){
        Tarea4 tareaActual= tareaService4.findById(id);
        tareaActual.setNombre(tarea.getNombre());
        tareaActual.setDescripcion(tarea.getDescripcion());
        tareaActual.setFecha(tarea.getFecha());
        
        tareaActual.setLink(tarea.getLink());
        tareaActual.setUrl(tarea.getUrl());
        
        
        
        return tareaService4.save(tareaActual);
    }
    @DeleteMapping("/proyectos/{id}")
    public void eliminar(@PathVariable Integer id){
        tareaService4.delete(id);
    }
    
}
