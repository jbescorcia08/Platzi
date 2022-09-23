/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sistemas
 */
public class POO {
    public static void main(String[] args) {
        Alumno alun1 = new Alumno();
        Alumno alun2 = new Alumno(1, "Jesus", "Barrios");
        
        alun1.setId(1);
        alun1.setNombre("Bley");
        alun1.setApellido("Munoz");
        
        System.out.println("El ID del Alumno es: "+alun1.getId());
        System.out.println("Nombre del alumno: "+alun1.getNombre());
        System.out.println("Apellido: "+alun1.getApellido());
        System.out.println("________________________________");
        
        alun2.setId(2);
        System.out.println("El ID del Alumno es: "+alun2.getId());
        System.out.println("Nombre del alumno: "+alun2.getNombre());
        System.out.println("Apellido: "+alun2.getApellido());
        
        
    }
}
