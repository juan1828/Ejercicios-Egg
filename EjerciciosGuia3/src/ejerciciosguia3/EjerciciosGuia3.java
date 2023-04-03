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
public class EjerciciosGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos números.");
        Scanner leer=new Scanner(System.in);
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        if (num1>25 || num2>25) {
            if (num1>25 && num2>25) {
                System.out.println("Los dos números ingresados son mayores a 25.");     
            } else {
            if (num1>25 && num2<=25){
                System.out.println("El primer numero es mayor a 25.");
            } else {System.out.println("El segundo número es mayor a 25.");
            }
            }
            
        } else {
            System.out.println("Ninguno de los números ingresados es mayor a 25.");
    }
    }
    }