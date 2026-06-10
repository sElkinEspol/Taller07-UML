package com.example.model;

import java.util.Date;

public class Evaluacion extends ActividadSumativa{
    private int limiteDeTiempo;
        
    public Evaluacion(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion,
            String id, int limiteDeTiempo) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
        this.limiteDeTiempo = limiteDeTiempo;
    }

    public int getLimiteDeTiempo() {
        return limiteDeTiempo;
    }

    public void setLimiteDeTiempo(int limiteDeTiempo) {
        this.limiteDeTiempo = limiteDeTiempo;
    }




}
