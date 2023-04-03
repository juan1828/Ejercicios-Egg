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
public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Envie una cadena de 5 caracteres de largo, cuyo primer caracter sea una X y el último una O.");
        Scanner leer=new Scanner(System.in);
        String cadena;
        int num1=0;
        int num2=0;
        do {
        cadena=leer.nextLine();
        if (cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O") && cadena.length()== 5 ) {
            System.out.println("Correcto.");
            num1=num1+1;
        } else if (!"&&&&".equals(cadena)){
            System.out.println("Incorrecto");
            num2=num2+1;
        }
        
        } while (!"&&&&".equals(cadena));
        
        System.out.println("Secuencia FDE ingresada. Final de los envíos.");
        System.out.println("Cantidad de lecturas correctas: "+ num1);
        System.out.println("Cantidad de lecturas incorrectas: "+ num2);
        
        
    }
}
