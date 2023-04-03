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
public class ejercicioGuia4 {
    public static void main(String[] args) {
        int num;
        int contador=0;
        int contador2=0;
        Scanner leer=new Scanner(System.in);
                do {
                    num=leer.nextInt();
                    contador=(contador+num);
                    contador2=(contador2+1);
                    if (num==0) {
                        break;
                    }
                } while (contador2<20);
                
        System.out.println("Se capturó el numero cero.");
        System.out.println("La suma de los numeros ingresados es "+ contador);
    }
}
