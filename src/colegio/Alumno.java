package colegio;

import java.util.*;

public class Alumno {

    int legajo;
    String apellido, nombre;
    HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new HashSet();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        materias.add(m);        
    }
    
    public int cantidadMaterias(){
        System.out.println(materias.size()); //agregué esta línea para mostrar el retorno.
        return materias.size();
    }
}
