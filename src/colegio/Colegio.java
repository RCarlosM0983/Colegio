/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author carlo_000
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia mat1 = new Materia(12, "Ingles I", 1);
        Materia mat2 = new Materia(13, "Matematicas", 1);
        Materia mat3 = new Materia(14, "Laboratorio I", 1);
        
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        
        a1.agregarMateria(mat1);
        a1.agregarMateria(mat2);
        a1.agregarMateria(mat3);
        
        a2.agregarMateria(mat1);
        a2.agregarMateria(mat2);
        a2.agregarMateria(mat3);
        
        System.out.println(a1.cantMaterias());
        System.out.println(a2.cantMaterias());
    }
    
}
