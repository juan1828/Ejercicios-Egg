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
public class EjerciciosGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra terminada en punto.");
        String frase=leer.nextLine();
        
        cod(frase) ;
    }
    public static void cod(String frase) {
       String frase2;
       for (int i=0; i< frase.length();i++   ) {
       frase2= frase.substring(i,i+1);
       switch (frase2) {
           case "a":
               frase2= "@";
           break;
           case "e":
	       frase2 = "#";
           break;
	   case "i":
	       frase2 = "$";
           break;
           case "o":
               frase2 = "%";
           break;
           case "u":
	       frase2 = "*";
           break;
       }
           System.out.print(frase2);
       }
        System.out.println(" ");
  }
}


