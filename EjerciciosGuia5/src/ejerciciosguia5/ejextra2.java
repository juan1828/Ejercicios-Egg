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
public class ejextra2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la dimension de los dos vectores.");
        int n=leer.nextInt();
        int[] vector1= new int [n];
        int[] vector2= new int [n];
        boolean igual=true;
        System.out.println("Ingrese los valores del vector 1.");
        for (int i=0; i<n;i++) {
        vector1[i]=leer.nextInt();
        }
        System.out.println("Ingrese los valores del vector 2.");
        for (int i=0; i<n;i++) {
        vector2[i]=leer.nextInt();
        if (vector2[i]!=vector1[i]){
            igual=false;
            break;
        }
        }
        
        if(igual==true){
             System.out.println("Los vectores son iguales.");
        } else{
         System.out.println("Los vectores no son iguales.");
        }
        
    }
}
