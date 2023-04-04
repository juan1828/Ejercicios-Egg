/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia4;

import java.util.Scanner;

/**
 *
 * @author arce
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número.");
        int num=leer.nextInt();
        boolean retorno=FuncionPrimo(num);
        System.out.println("¿El número es primo? "+retorno);
        
    }
    
    public static boolean FuncionPrimo(int num){
        boolean primo = true;
        
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
            primo = false;
            break;
            }
        }

        
        return primo;
    }
}
