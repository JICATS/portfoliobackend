/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.model.Tarea2;
import java.util.List;

/**
 *
 * @author JORGE CASTILLO
 */
public interface TareaService2 {
    public List<Tarea2> findAllusers();
    public Tarea2 save(Tarea2 tarea);
    public Tarea2 findById(Integer id);
    public void delete(Integer id);
    
}
