/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.visa.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author JORGE CASTILLO
 */
@Entity
@Table(name="usuarios")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User implements Serializable {
    @Id
    private String usuario;
    @Column(name="secretpassword")
    private String secretpassword;
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getPassword() {
        return secretpassword;
    }

    public void setPassword(String secretpassword) {
        this.secretpassword = secretpassword;
    }
}
