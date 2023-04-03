/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia2;

import java.util.Scanner;

/**
 *
 * @author arce
 */
public class ejercicio2 {
     public static void main(String[] args) {
        String nombre;
        System.out.println("Ingresa tu nombre por teclado.");
        Scanner leer=new Scanner(System.in);
        nombre=leer.nextLine();
        System.out.println("Tu nombre es: "+nombre);
    }
}
