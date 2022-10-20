/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.visa.demo.dao;

import com.visa.demo.model.Tarea;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author JORGE CASTILLO
 */
public interface TareaDao extends CrudRepository<Tarea, Integer> {
    
}

