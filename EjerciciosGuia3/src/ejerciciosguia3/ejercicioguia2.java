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
public class ejercicioguia2 {
    public static void main(String[] args) {
        int tipoMotor;
        System.out.println("Ingrese un valor entre uno y cuatro.");
        Scanner leer=new Scanner(System.in);
        tipoMotor= leer.nextInt();
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua.");
            break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
            break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
            break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
            break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba.");
        
        }
    }
}
