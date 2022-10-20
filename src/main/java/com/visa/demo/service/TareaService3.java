/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.model.Tarea3;
import java.util.List;

/**
 *
 * @author JORGE CASTILLO
 */
public interface TareaService3 {
    public List<Tarea3> findAllusers();
    public Tarea3 save(Tarea3 tarea);
    public Tarea3 findById(Integer id);
    public void delete(Integer id);
    
    
}
