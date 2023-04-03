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
public class ejextra4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10.");
        int num=leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("El equivalente de "+ num+" en romano es I");
            break;
            case 2:
                System.out.println("El equivalente de "+ num+" en romano es II");
            break;
            case 3:
                System.out.println("El equivalente de "+ num+" en romano es III");
            break;
            case 4:
                System.out.println("El equivalente de "+ num+" en romano es IV");
            break;
            case 5:
                System.out.println("El equivalente de "+ num+" en romano es V");
            break;
            case 6:
                System.out.println("El equivalente de "+ num+" en romano es VI");
            break;
            case 7:
                System.out.println("El equivalente de "+ num+" en romano es VII");
            break;
            case 8:
                System.out.println("El equivalente de "+ num+" en romano es VIII");
            break;
            case 9:
                System.out.println("El equivalente de "+ num+" en romano es IX");
            break;
            case 10:
                System.out.println("El equivalente de "+ num+" en romano es X");
            break;
            default:
                System.out.println("El número ingresado no esta en los parámetros.");
        }
    }
}
