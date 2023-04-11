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
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma=0;
        int sumaDiag=0;
        int sumaDiaginv=0;
        int[][] matriz = new int[3][3];
        
        //relleno la matriz normal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Introduzca el valor de fila: "+i+" columna: "+j+", que no se mayor a 9.");
                do {
                 matriz[i][j] = leer.nextInt();
                } while (matriz[i][j]>9);
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma=suma+matriz[i][j];
                if (i==j){
                sumaDiag=sumaDiag+matriz[i][j];
                }
            }
        }
       
        int x=0;
        for (int y=2;y>-1;y--) {
        sumaDiaginv=sumaDiaginv+matriz[x][y];
        x++;
            
        }
       
        System.out.println(suma);
         System.out.println(sumaDiag);
          System.out.println(sumaDiaginv);
       
        if (suma/3==sumaDiag && suma/3==sumaDiaginv && sumaDiag==sumaDiaginv) {
            System.out.println("La matriz es magica");
        } else {
        System.out.println("La matriz no es magica");
        }
        
        
        
        
        
        
        
        
        
    }
}
