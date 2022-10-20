/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.dao.TareaDao6;
import com.visa.demo.model.Tarea6;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JORGE CASTILLO
 */
@Service
public class TareaServiceImplement6 implements TareaService6 {
    @Autowired
    private TareaDao6 tareaDao6;
    @Override
    @Transactional(readOnly =true)
    public List<Tarea6> findAllusers(){
       
       return (List<Tarea6>) tareaDao6.findAll();
   }
   @Override
   @Transactional(readOnly=false)
   public Tarea6 save(Tarea6 tarea){
       return tareaDao6.save(tarea);
   }
   
   @Override
   @Transactional(readOnly=true)
   public Tarea6 findById(Integer id){
       return tareaDao6.findById(id).orElse(null);
   }
   @Override
   @Transactional(readOnly=false)
   public void delete(Integer id){
       tareaDao6.deleteById(id);
   }
    
}
