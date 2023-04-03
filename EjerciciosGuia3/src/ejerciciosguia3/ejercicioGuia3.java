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
public class ejercicioGuia3 {
    public static void main(String[] args) {
        System.out.println("Ingrese una nota entre 0 y 10.");
       Scanner leer=new Scanner(System.in); 
       int nota=leer.nextInt();
       while (nota<0 || nota>10){
           System.out.println("Valor icorrecto, intentelo de nuevo.");
           nota=leer.nextInt();
       }
        System.out.println("Saliste del bucle.");
    }
}
