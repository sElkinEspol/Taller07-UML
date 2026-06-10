package com.example.model;

public class Administrador extends Usuario {

    public Administrador(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void crearUsuarioConRol(String usuario, String contraseña){
        //Logica del Metodo
    }

    public void asignarPermiso(String usuario){
        //Logica del Metodo
    }

    public void actualizarSoftware(){
        //Logica del Metodo
    }

    public void asignarResponsable(Curso curso, Profesor responsable){
        //Logica del Metodo
    }
}
