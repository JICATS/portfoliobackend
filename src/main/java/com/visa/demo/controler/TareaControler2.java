/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.controler;

import com.visa.demo.model.Tarea2;
import com.visa.demo.service.TareaService2;
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
public class TareaControler2 {
    
    @Autowired
    private TareaService2 tareaService2;
    
   
    //guardar
    @PostMapping("/education")
    public Tarea2 guardar(@RequestBody Tarea2 tarea){
        return tareaService2.save(tarea);
    }
    
    
    @GetMapping("/education")
    public List<Tarea2> listar3(){
        return tareaService2.findAllusers();
    }
    //get tarea
    @GetMapping("/education/{id}")
    public Tarea2 GetTarea(@PathVariable Integer id){
        return tareaService2.findById(id);
    }
    //modificar
    @PutMapping("/education/{id}")
    public Tarea2 modicar(@RequestBody Tarea2 tarea,@PathVariable Integer id){
        Tarea2 tareaActual= tareaService2.findById(id);
        tareaActual.setTipo(tarea.getTipo());
        tareaActual.setTitulo(tarea.getTitulo());
        tareaActual.setPeriodo(tarea.getPeriodo());
        tareaActual.setInstitucion(tarea.getInstitucion());
        
        
        
        return tareaService2.save(tareaActual);
    }
    @DeleteMapping("/education/{id}")
    public void eliminar(@PathVariable Integer id){
        tareaService2.delete(id);
    }
    
    
    
    
}
