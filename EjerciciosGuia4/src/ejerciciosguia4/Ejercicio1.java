package ejerciciosguia4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author arce
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese dos números.");
         Scanner leer=new Scanner(System.in);
         int num1=leer.nextInt();
         int num2=leer.nextInt();
         System.out.println("¿Que desea hacer?");
         System.out.println("1-Sumar");
         System.out.println("2-Restar");
         System.out.println("3-Multiplicar");
         System.out.println("4-División");
         int opcion=leer.nextInt();
         int retorno;
         switch (opcion) {
           case 1:
               retorno = sumar(num1, num2);

    	       System.out.println("La suma de ambos es: " + retorno);
	

           break;
           case 2:
	       retorno = restar(num1, num2);

    	       System.out.println("La resta de ambos es: " + retorno);
           break;
	   case 3:
	       retorno = multiplicar(num1, num2);

    	       System.out.println("La multiplicacion de ambos es: " + retorno);
           break;
           case 4:
               retorno = dividir(num1, num2);

    	       System.out.println("La division de ambos es: " + retorno);
           break;
           }
    }
    public static int sumar(int n1,int n2) {
      int suma=n1+n2;
      return suma;       
    }
    
    public static int restar(int n1,int n2) {
      int resta=n1-n2;
      return resta;   
    }
     
    public static int multiplicar(int n1,int n2) {
      int multi=n1*n2;
      return multi;   
    }
      
    public static int dividir(int n1,int n2) {
      int divi=n1/n2;
      return divi;   
    }
}
