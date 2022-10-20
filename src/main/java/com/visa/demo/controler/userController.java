/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.controler;

import com.visa.demo.model.User;
import com.visa.demo.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JORGE CASTILLO
 */
@RestController
@RequestMapping("/log")
@CrossOrigin(origins="https://frontendpruebas-e410e.web.app")
public class userController {
    
    @Autowired
    private UserRepo repo;
    
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User userData){
        
        User user=repo.findByUsuario(userData.getUsuario());
        if(user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);
        return(ResponseEntity<?>) ResponseEntity.internalServerError();
        
        
    }
    
    
    
}
