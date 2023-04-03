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
public class ejextra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double est;
        double prom1 = 0;
        double prom2 = 0;
        int num1=0;
        System.out.println("¿Cuantas estaturas desea ingresar?");
        int num = leer.nextInt();
        System.out.println("Ingrese las estaturas");
        for (int i = 1; i < num + 1; i++) {
            est = leer.nextDouble();
            if (est < 1.60) {
                prom1=prom1+est;
                prom2=prom2+est;
                num1++;
            } else {
                prom2=prom2+est;
            }
        }
        System.out.println("Promedio de estaturas debajo de 1.60: " + prom1/num1);
        System.out.println("Promedio de estaturas general: " + prom2/num);
    }
}
