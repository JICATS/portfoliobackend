/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.model.Tarea4;
import java.util.List;

/**
 *
 * @author JORGE CASTILLO
 */
public interface TareaService4 {
    public List<Tarea4> findAllusers();
    public Tarea4 save(Tarea4 tarea);
    public Tarea4 findById(Integer id);
    public void delete(Integer id);
    
}
