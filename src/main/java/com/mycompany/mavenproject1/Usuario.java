/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class Usuario {
    private int id; 
    private String nombre; 
    private String contraseña;
    
public Usuario(){
    
} 

public Usuario(int id, String nombre, String contraseña){
    this.id = id; 
    this.nombre = nombre;
    this.contraseña = contraseña;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contreseña) {
        this.contraseña = contreseña;
    }
}
