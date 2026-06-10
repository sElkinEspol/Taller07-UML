package com.example.model;

import java.util.List;

public class Profesor extends PersonalAcademico{

    public Profesor(String usuario, String contraseña, String nombre, String apellido, List<Indicente> indicidente,
            List<Indicente> indicidente2) {
        super(usuario, contraseña, nombre, apellido, indicidente, indicidente2);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //Logica del metood
    }

    public void calificarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //Logica del metood
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        //Logica del metood
    }

    public void crearNuevoForo(Foro foro){
        //Logica del metood
    }
}
