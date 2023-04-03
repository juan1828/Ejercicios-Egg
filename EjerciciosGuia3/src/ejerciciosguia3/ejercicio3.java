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
public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres de largo.");
        String frase=leer.nextLine();
        if (frase.length()==8){
         System.out.println("Correcto.");
        }else {
            System.out.println("Incorrecto.");
            }
        
    }
}
