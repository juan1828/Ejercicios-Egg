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
public class ejercicioGuia5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese cuatro numeros entre 1 y 20.");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int num3=leer.nextInt();
        int num4=leer.nextInt();
        System.out.print(num1);
        for (int i=0; i<num1; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num2);
        for (int i=0; i<num2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num3);
        for (int i=0; i<num3; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num4);
        for (int i=0; i<num4; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
