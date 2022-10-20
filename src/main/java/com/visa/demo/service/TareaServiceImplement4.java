/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.dao.TareaDao4;
import com.visa.demo.model.Tarea4;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JORGE CASTILLO
 */
@Service
public class TareaServiceImplement4 implements TareaService4{
    
    @Autowired
    private TareaDao4 tareaDao4;
    @Override
    @Transactional(readOnly =true)
    public List<Tarea4> findAllusers(){
       
       return (List<Tarea4>) tareaDao4.findAll();
   }
   @Override
   @Transactional(readOnly=false)
   public Tarea4 save(Tarea4 tarea){
       return tareaDao4.save(tarea);
   }
   
   @Override
   @Transactional(readOnly=true)
   public Tarea4 findById(Integer id){
       return tareaDao4.findById(id).orElse(null);
   }
   @Override
   @Transactional(readOnly=false)
   public void delete(Integer id){
       tareaDao4.deleteById(id);
   }
    
}
