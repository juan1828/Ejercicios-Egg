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
public class EjerciciosGuia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos números por teclado.");
         Scanner leer1 = new Scanner(System.in);
         Scanner leer2 = new Scanner(System.in);
         int num1;
         int num2;
         num1=leer1.nextInt();
         num2=leer2.nextInt();
         int suma= num1+num2;
         System.out.println("La suma de los dos números ingresados es: "+suma);
    }
    
}
