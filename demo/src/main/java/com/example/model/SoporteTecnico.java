package com.example.model;

public class SoporteTecnico extends Usuario{

    public SoporteTecnico(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void brindarAsistencia(Usuario usuario){
        //Logica del Metodo
    }

    public void resolverProblemaTecnico(Usuario usuario){
        //Logica del Metodo
    }

    public void derivarProblemaDeGestion(Administrador administrador){
        //Logica del Metodo
    }
}
