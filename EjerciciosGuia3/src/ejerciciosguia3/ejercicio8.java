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
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado:");
        int N = leer.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
}
    }
