/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.model.Tarea;


import java.util.List;

/**
 *
 * @author JORGE CASTILLO
 */
public interface TareaService {
    public List<Tarea> findAll();
    public Tarea findById(Integer id);
    public Tarea save(Tarea tarea);
    public void delete(Integer id);
    
  

   
    
}

