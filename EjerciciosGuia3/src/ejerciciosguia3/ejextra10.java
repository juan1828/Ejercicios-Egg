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
public class ejextra10 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double n1=(Math.random()*10);
        int num1=(int)n1;
        //System.out.println(num1);
        double n2=(Math.random()*10);
        int num2=(int)n2;
        //System.out.println(num2);
        int multi=num1*num2;
        int resp;
        System.out.println("El programa a generado dos números aleatorios y los ha multiplicado. Adivina la respuesta.");
        do {
        resp=leer.nextInt();
        if (resp != multi)
        {
            System.out.println("Incorrecto, intentelo de nuevo.");
        } else {System.out.println("Correcto");}
        } while (resp != multi);
    }
 
}
