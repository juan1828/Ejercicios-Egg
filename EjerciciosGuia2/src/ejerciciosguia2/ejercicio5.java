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
public class ejercicio5 {
     public static void main(String[] args) {
        int num;
        System.out.println("Ingresa un número.");
        Scanner leer= new Scanner(System.in);
        num= leer.nextInt();
        System.out.println("El doble del número ingresado es: "+ num*2);
        System.out.println("El triple del número ingresado es: "+ num*3);
        System.out.println("La raiz cuadrada del número ingresado es: "+Math.sqrt(num));
        
    }
}
