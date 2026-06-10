package com.example.model;

import java.util.List;

public class Estudiante extends PersonalAcademico{

    public Estudiante(String usuario, String contraseña, String nombre, String apellido, List<Indicente> indicidente,
            List<Indicente> indicidente2) {
        super(usuario, contraseña, nombre, apellido, indicidente, indicidente2);
    }

    public void solicitarInscripcionCurso(Curso curso){
        //Logica del metood
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //Logica del metood
    }
}
