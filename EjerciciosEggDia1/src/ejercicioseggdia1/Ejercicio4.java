/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseggdia1;

import java.util.Scanner;

/**
 *
 * @author arce
 */
public class Ejercicio4 {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad = 19;
       String nombre = "Juan Francisco";
        System.out.println("Mi edad es "+edad);
        System.out.println("Mi nombre es "+nombre);
       Scanner leer = new Scanner(System.in);
       String name;
   
        System.out.println(nombre.length());
       name=leer.next();
        System.out.println("Hola! mi nombre es "+ name);
        
    }
}
