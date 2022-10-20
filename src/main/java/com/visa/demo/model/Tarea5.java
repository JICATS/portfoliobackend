/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author JORGE CASTILLO
 */
@Entity
@Table(name="usuarios")
public class Tarea5 implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="usuario")
    private String usuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="secretpassword")
    private String secretpassword;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSecretpassword() {
        return secretpassword;
    }

    public void setSecretpassword(String secretpassword) {
        this.secretpassword = secretpassword;
    }
    
    
    
    
}
