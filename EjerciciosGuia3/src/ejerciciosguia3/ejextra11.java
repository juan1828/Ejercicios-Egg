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
public class ejextra11 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero.");
        Scanner leer=new Scanner(System.in);
        int num=leer.nextInt();
        int cont=0;
        do 
        {
        num=num/10;
        cont++;
        } while (num>=10);
        System.out.println("La cantidad de d[igitos del numero introducido es: "+ (cont+1));
    }
}
