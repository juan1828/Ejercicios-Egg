/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia4;

import java.util.Scanner;

/**
 *
 * @author arce
 */
public class ejercicio2 {
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      String opcion;
      do {
        System.out.println("Ingrese nombre y edad de una persona.");
        String nombre=leer.nextLine() ;
        int edad=leer.nextInt() ;
        funcionNombreEdad(nombre, edad);
        System.out.println("¿Quiere seguir ingresando personas? (SI/NO)");
        opcion=leer.next();
      } while (!"NO".equalsIgnoreCase(opcion) );
    }
    
    public static void funcionNombreEdad(String nombre, int edad)  {
            System.out.println("Datos:");
            System.out.println("Nombre: "+ nombre);
            System.out.println("Edad: "+ edad);
            String mayor;
            if (edad>=18){
            mayor= "Verdadero";
            } else {
            mayor= "falso";
            }
            System.out.println("¿Es mayor de edad?: "+ mayor);
    
}
        
}
