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
public class ejercicio5 {
    public static void main(String[] args) {

        int cont = 0;
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizTransp = new int[3][3];
        //relleno la matriz normal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = leer.nextInt();
            }
        }
        //muestro la matriz normal
        System.out.println("Matriz normal.");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        //relleno y muestro la matriz transpuesta
        System.out.println("Matriz Transpuesta.");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizTransp[j][i] = matriz[j][i];
                System.out.print(matrizTransp[j][i]);
            }
            System.out.println(" ");

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] == -matrizTransp[i][j]) {
                    //System.out.println("contador");
                    cont++;
                }
            }
        }

        if (cont == 9) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
       
    }
}
