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
public class ejextra3 {
    public static void main(String[] args) {
        System.out.println("Ingrese una letra.");
        Scanner leer=new Scanner(System.in);
        String letra=leer.next();
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
        System.out.println("La letra ingresada es una vocal.");
        } else {
           System.out.println("La letra ingresada no es una vocal"); 
            }
    }
            
}
