/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author arce
 */
public class ejextra1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector.");
        int n=leer.nextInt();
        int[] vector= new int [n];
        int suma=0;
        System.out.println("Ingrese los valores del vector.");
        for (int i=0; i<n;i++) {
        vector[i]=leer.nextInt();
        suma=suma+vector[i];
        }
        System.out.println("La suma de todos los elementos del vctor es: "+suma);
    }
}
