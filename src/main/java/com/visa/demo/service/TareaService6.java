/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.visa.demo.service;

import com.visa.demo.model.Tarea6;
import java.util.List;

/**
 *
 * @author JORGE CASTILLO
 */
public interface TareaService6 {
    public List<Tarea6> findAllusers();
    public Tarea6 save(Tarea6 tarea);
    public Tarea6 findById(Integer id);
    public void delete(Integer id);
    
}
