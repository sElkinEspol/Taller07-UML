package com.example.model;

import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesEnEsperaDeInscripcion;
    private Profesor profesor;
    private List<Foro> foro;
    private List<ActividadSumativa> actividadesSumativas;

    public Curso(String id, String nombre, boolean estadoDisponible, List<Estudiante> estudiantesInscritos,
            List<Estudiante> estudiantesEnEsperaDeInscripcion, Profesor profesor, List<Foro> foro,
            List<ActividadSumativa> actividadesSumativas) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.estudiantesInscritos = estudiantesInscritos;
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
        this.profesor = profesor;
        this.foro = foro;
        this.actividadesSumativas = actividadesSumativas;
    }
    
    public List<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }
    public void setActividadesSumativas(List<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }
    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }
    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }
    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }
    public List<Estudiante> getEstudiantesEnEsperaDeInscripcion() {
        return estudiantesEnEsperaDeInscripcion;
    }
    public void setEstudiantesEnEsperaDeInscripcion(List<Estudiante> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public List<Foro> getForo() {
        return foro;
    }
    public void setForo(List<Foro> foro) {
        this.foro = foro;
    }
}
