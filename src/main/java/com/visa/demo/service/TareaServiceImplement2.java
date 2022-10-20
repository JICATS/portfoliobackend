/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.dao.TareaDao2;

import com.visa.demo.model.Tarea2;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JORGE CASTILLO
 */
@Service
public class TareaServiceImplement2 implements TareaService2{
    @Autowired
    private TareaDao2 tareaDao2;
    @Override
    @Transactional(readOnly =true)
    public List<Tarea2> findAllusers(){
       
       return (List<Tarea2>) tareaDao2.findAll();
   }
    @Override
   @Transactional(readOnly=false)
   public Tarea2 save(Tarea2 tarea){
       return tareaDao2.save(tarea);
   }
   
   @Override
   @Transactional(readOnly=true)
   public Tarea2 findById(Integer id){
       return tareaDao2.findById(id).orElse(null);
   }
    @Override
   @Transactional(readOnly=false)
   public void delete(Integer id){
       tareaDao2.deleteById(id);
   }
    
    
    
}
