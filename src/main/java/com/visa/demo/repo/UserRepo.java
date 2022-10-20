/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.repo;

import com.visa.demo.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JORGE CASTILLO
 */
@Repository
public interface UserRepo extends JpaRepository<User, String>{
    User findByUsuario(String usuario);
    
}
