package com.example.model;

public class PersonalAcademico extends Usuario{

    public PersonalAcademico(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void reportarError(String email, String contenido){
        //Logica del Metodo
    }

    public void solicitarAsesoramiento(String email, String contenido){
        //Logica del Metodo
    }

    public void comentarEnForo(Foro foro, String comentario){
        //Logica del Metodo
    }
}
