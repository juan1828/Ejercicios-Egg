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
public class ejextra3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector.");
        int n=leer.nextInt();
        int[] vector= new int [n];
        RellenarVector(vector, n);
        
        ImprimirVector(vector, n);
    }
    public static int[] RellenarVector(int[] vector, int n) {
    for (int i=0; i<n;i++) {
        int numRandom=(int)(Math.random()*10+1) ;   
        vector[i]=numRandom;
        }
    return vector;
    }
    
    public static void ImprimirVector(int [] vector, int n) {
        System.out.println("Valores del vector:");
        for (int i=0; i<n;i++)  {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println(" ");
    }
}
