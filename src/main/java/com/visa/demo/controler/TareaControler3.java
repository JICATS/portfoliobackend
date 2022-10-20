/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.controler;

import com.visa.demo.model.Tarea3;
import com.visa.demo.service.TareaService3;
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
public class TareaControler3 {
    
    @Autowired
    private TareaService3 tareaService3;
    
    //listar users
    @GetMapping("/habilidad")
    public List<Tarea3> listar3(){
        return tareaService3.findAllusers();
    }
    //guardar
    @PostMapping("/habilidad")
    public Tarea3 guardar(@RequestBody Tarea3 tarea){
        return tareaService3.save(tarea);
    }
    
    
    //get tarea
    @GetMapping("/habilidad/{id}")
    public Tarea3 GetTarea(@PathVariable Integer id){
        return tareaService3.findById(id);
    }
    
    //modificar
    @PutMapping("/habilidad/{id}")
    public Tarea3 modicar(@RequestBody Tarea3 tarea,@PathVariable Integer id){
        Tarea3 tareaActual= tareaService3.findById(id);
        tareaActual.setTipo(tarea.getTipo());
        tareaActual.setHabilidad(tarea.getHabilidad());
        tareaActual.setGrado(tarea.getGrado());
        
        
        
        return tareaService3.save(tareaActual);
    }
    @DeleteMapping("/habilidad/{id}")
    public void eliminar(@PathVariable Integer id){
        tareaService3.delete(id);
    }
    
    
    
}
