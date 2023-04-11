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
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);  
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        System.out.println("Ingrese un número a buscar en el vector");
        int x=leer.nextInt();
        int [] vector= new int[n];
        int ban=0;
        for (int i=0; i<n;i++) {
        int numRandom=(int)(Math.random()*10+1) ;   
        vector[i]=numRandom;
        if (vector[i]==x) {
            System.out.println("El número buscado se encuentra el vector ["+i+"]");
            ban=ban+1;
        }
        }
        if (ban==0)  {
            System.out.println("No se encuentra el número ingresado.");
        }
    }
}
