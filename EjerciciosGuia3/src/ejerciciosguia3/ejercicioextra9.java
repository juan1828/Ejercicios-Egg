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
public class ejercicioextra9 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un dividendo.");
        int divid=leer.nextInt();
        int cont=0;
        System.out.println("Ingrese un divisor.");
        int divis=leer.nextInt();
        while (divid>=divis) 
        {
        divid=divid-divis;
        cont++;
        }
        System.out.println("El resto de la división es: "+ divid);
        System.out.println("El cociente de la división es: "+ cont);
        
    }
            
}
