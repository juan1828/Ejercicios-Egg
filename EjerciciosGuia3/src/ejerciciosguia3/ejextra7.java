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
public class ejextra7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantos números desea ingresar?");
        int num = leer.nextInt();
        int cont = 1;
        int max = 0;
        int min = 0;
        int prom = 0;
        System.out.println("Ingrese los números.");
        while (cont <= num) {
            int n = leer.nextInt();
            
            prom = prom + n;
            
            if (n>max){
            max=n;
            }
            if (cont==1){
            min=n;
            } else if (n<min){
            min=n;
            }
            cont++;
        }
        System.out.println("número máximo: "+ max);
        System.out.println("Número mínimo: "+ min);
        System.out.println("Promedio: "+ prom/num);
    }
            
}
