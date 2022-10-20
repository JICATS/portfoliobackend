/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.controler;

import com.visa.demo.model.Tarea6;
import com.visa.demo.service.TareaService6;
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
public class TareaControler6 {
    @Autowired
    private TareaService6 tareaService6;
    
    //listar users
    @GetMapping("/mainData")
    public List<Tarea6> listar3(){
        return tareaService6.findAllusers();
    }
    //guardar
    @PostMapping("/mainData")
    public Tarea6 guardar(@RequestBody Tarea6 tarea){
        return tareaService6.save(tarea);
    }
    
    
    //get tarea
    @GetMapping("/mainData/{id}")
    public Tarea6 GetTarea(@PathVariable Integer id){
        return tareaService6.findById(id);
    }
    
    //modificar
    @PutMapping("/mainData/{id}")
    public Tarea6 modicar(@RequestBody Tarea6 tarea,@PathVariable Integer id){
        Tarea6 tareaActual= tareaService6.findById(id);
        tareaActual.setProfesion(tarea.getProfesion());
        tareaActual.setDescripcion(tarea.getDescripcion());
        tareaActual.setPuesto(tarea.getPuesto());
        
        tareaActual.setPeriodo(tarea.getPeriodo());
        
        
        
        
        return tareaService6.save(tareaActual);
    }
    @DeleteMapping("/mainData/{id}")
    public void eliminar(@PathVariable Integer id){
        tareaService6.delete(id);
    }
    
}
