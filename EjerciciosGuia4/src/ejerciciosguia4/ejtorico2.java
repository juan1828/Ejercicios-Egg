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
public class ejtorico2 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros.");
        Scanner leer=new Scanner(System.in);
        int num1=leer.nextInt();
        int num2=leer.nextInt();
      
        
        EsMultiplo(num1,num2);
    }
       public static void EsMultiplo(int num1,int num2)  {
           
       if (num1%num2==0 ){
           System.out.println("El primer numero es multiplo del segundo.");
       } else {
       System.out.println("El primer numero no es multiplo del segundo.");
       }
       }   
}
