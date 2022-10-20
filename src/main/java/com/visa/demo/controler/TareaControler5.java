/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.controler;

import com.visa.demo.model.Tarea5;
import com.visa.demo.service.TareaService5;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JORGE CASTILLO
 */
@RestController
@CrossOrigin(origins="https://frontendpruebas-e410e.web.app")
@RequestMapping("/api/")
public class TareaControler5 {
    
    @Autowired
    private TareaService5 tareaService5;
    
    //listar users
    @GetMapping("/login")
    public List<Tarea5> listar3(){
        return tareaService5.findAllusers();
    }
    
}
