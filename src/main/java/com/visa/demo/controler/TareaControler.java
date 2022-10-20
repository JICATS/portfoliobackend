/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.controler;

import com.visa.demo.model.Tarea;

import com.visa.demo.service.TareaService;

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
@RequestMapping("/api")
public class TareaControler {
    @Autowired
    private TareaService tareaService;
    
    
    // listar todo
    @GetMapping("/experience")
    public List<Tarea> listar(){
        return tareaService.findAll();
    }
    //get tarea
    @GetMapping("/experience/{id}")
    public Tarea GetTarea(@PathVariable Integer id){
        return tareaService.findById(id);
    }
    
    
    //guardar
    @PostMapping("/experience")
    public Tarea guardar(@RequestBody Tarea tarea){
        return tareaService.save(tarea);
    }
    
    //modificar
    @PutMapping("/experience/{id}")
    public Tarea modicar(@RequestBody Tarea tarea,@PathVariable Integer id){
        Tarea tareaActual= tareaService.findById(id);
        tareaActual.setPuesto(tarea.getPuesto());
        tareaActual.setDescripcion(tarea.getDescripcion());
        tareaActual.setPeriodo(tarea.getPeriodo());
        
        
        
        return tareaService.save(tareaActual);
    }
    @DeleteMapping("/experience/{id}")
    public void eliminar(@PathVariable Integer id){
        tareaService.delete(id);
    }
    
    
    
   
    
}

