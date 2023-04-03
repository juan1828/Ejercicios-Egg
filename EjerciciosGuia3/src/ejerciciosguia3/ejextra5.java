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
public class ejextra5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio que es usted (A/B/C).");
        String letra=leer.next();
        System.out.println("Ingrese el costo de su tratamiento.");
        int num=leer.nextInt();
        switch (letra) {
            case "A":
                System.out.println("Usted tiene 50% de descuento, el costo de su tratamiento es de: "+ num/2);
            break;
            case "B":
                System.out.println("Usted tiene 35% de descuento, el costo de su tratamiento es de: "+ num*0.35);
            break;
            case "C":
                System.out.println("Usted no tiene descuento, el costo de su tratamiento es de: "+ num);
            break;
    }
}
    }
