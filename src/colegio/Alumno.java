/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.util.HashSet;



/**
 *
 * @author carlo_000
 */
public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia>materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
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
    
public void agregarMateria(Materia m){
        materias.add(m);
  }
public int cantMaterias(){
    return materias.size();
}

    @Override
    public String toString() {
        return apellido +  ": legajo=" + legajo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    

       
}
