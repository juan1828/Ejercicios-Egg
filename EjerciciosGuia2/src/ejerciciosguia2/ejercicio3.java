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
public class ejercicio3 {
    public static void main(String[] args) {
        String frase;
        
        System.out.println("Ingresa una frase");
        Scanner leer= new Scanner(System.in);
        frase= leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());
    }
}
