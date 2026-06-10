package com.example.model;

import java.util.List;

public class PersonalAcademico extends Usuario{
    private List<Indicente> indicidente;

    public PersonalAcademico(String usuario, String contraseña, String nombre, String apellido,
            List<Indicente> indicidente, List<Indicente> indicidente2) {
        super(usuario, contraseña, nombre, apellido, indicidente);
        indicidente = indicidente2;
    }

    public List<Indicente> getIndicidente() {
        return indicidente;
    }

    public void setIndicidente(List<Indicente> indicidente) {
        this.indicidente = indicidente;
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
