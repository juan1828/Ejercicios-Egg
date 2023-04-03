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
public class ejextra1 {
    public static void main(String[] args) {
        System.out.println("Escriba una cantidad en minutos.");
        Scanner leer=new Scanner(System.in);
        int min =leer.nextInt();
        int dia= min/1440;
        int x=min-(dia*1440);
        int hora=x/60;
        System.out.println("La cantidad de minutos ingresada equivale a:");
        System.out.println(dia+" Día/s y "+hora+" horas.");
       
    }
            
}
