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
public class ejextra5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas de la matriz.");
        int n=leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz.");
        int m=leer.nextInt();
        int [][] matriz=new int[n][m];
        int suma=0;
        for (int i=0; i<n;i++)  {
        for (int j=0; j<m;j++)  {
        int numRandom=(int)(Math.random()*10+1) ;
        matriz[i][j]=numRandom;
        suma=suma+matriz[i][j];
        }
        }
        
        for (int i=0; i<n;i++)  {
        for (int j=0; j<m;j++)  {
            System.out.print(matriz[i][j]);
        }
            System.out.println(" ");
        }
        System.out.println("La suma de todos los elementos de la matriz es igual a: "+suma);
    }
}
