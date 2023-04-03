/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia3;

import java.util.Scanner;

/**
 *
 * @author arce
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase que empieze por A.");
        String frase=leer.nextLine();
        String Letra=frase.substring(0,1);
        if (Letra.equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto.");
        }
        
    }
}
