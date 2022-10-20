/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.dao.TareaDao5;
import com.visa.demo.model.Tarea5;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JORGE CASTILLO
 */
@Service
public class TareaServiceImplement5 implements TareaService5{
    
    @Autowired
    private TareaDao5 tareaDao5;
    @Override
    @Transactional(readOnly =true)
    public List<Tarea5> findAllusers(){
       
       return (List<Tarea5>) tareaDao5.findAll();
   }
    
}
