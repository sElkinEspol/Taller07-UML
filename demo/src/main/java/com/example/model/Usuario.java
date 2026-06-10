package com.example.model;

import java.util.List;

public class Usuario {
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private List<Indicente> indicidente;
    
    public Usuario(String usuario, String contraseña, String nombre, String apellido, List<Indicente> indicidente) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.indicidente = indicidente;
    }
    
    public List<Indicente> getIndicidente() {
        return indicidente;
    }
    public void setIndicidente(List<Indicente> indicidente) {
        this.indicidente = indicidente;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
