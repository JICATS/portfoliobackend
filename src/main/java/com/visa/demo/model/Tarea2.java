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
@Table(name="educacion")
public class Tarea2 implements Serializable {
    


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="usuario")
    private String usuario;
    @Column(name="tipo")
    private String tipo;
    @Column(name="titulo")
    private String titulo;
    @Column(name="periodo")
    private String periodo;
    @Column(name="institucion")
    private String institucion;
    
    

     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getPeriodo(){
        return periodo;
    }
    
    public void setPeriodo(String periodo){
        this.periodo=periodo;
    }
    
    public String getInstitucion(){
        return institucion;
    }
    
    public void setInstitucion(String institucion){
        this.institucion=institucion;
    }

    

    
 }


    

