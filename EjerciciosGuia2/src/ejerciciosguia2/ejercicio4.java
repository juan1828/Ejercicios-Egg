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
public class ejercicio4 {
    public static void main(String[] args) {
        double num;
        System.out.println("Ingrese una cantidad de grados centigrados.");
        Scanner leer= new Scanner(System.in);
        num= leer.nextInt();
        System.out.println("La conversión de grados centigrados a Farenheit es:");
        System.out.println(num+" grados cetígrados es igual a:"+(32+(9 * num / 5))+" grados Fahrenheit");
        
    }
}
