/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.dao.TareaDao3;

import com.visa.demo.model.Tarea3;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JORGE CASTILLO
 */
@Service
public class TareaServiceImplement3 implements TareaService3{
    @Autowired
    private TareaDao3 tareaDao3;
    @Override
    @Transactional(readOnly =true)
    public List<Tarea3> findAllusers(){
       
       return (List<Tarea3>) tareaDao3.findAll();
   }
   @Override
   @Transactional(readOnly=false)
   public Tarea3 save(Tarea3 tarea){
       return tareaDao3.save(tarea);
   }
   
   @Override
   @Transactional(readOnly=true)
   public Tarea3 findById(Integer id){
       return tareaDao3.findById(id).orElse(null);
   }
   @Override
   @Transactional(readOnly=false)
   public void delete(Integer id){
       tareaDao3.deleteById(id);
   }
    
    
    
}
