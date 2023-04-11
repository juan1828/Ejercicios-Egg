/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia5;

import java.util.Scanner;

/**
 *
 * @author arce
 */
public class ejextra4 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int aprob=0;
        int desaprob=0;
        System.out.println("Ingrese las notas de los alumnos.");
        for (int i=0; i<10;i++) {
            System.out.println("Alumno "+(i+1)+":");
            System.out.println("Primer trabajo práctico evaluativo:");
            nota1=leer.nextInt();
            System.out.println("Segundo trabajo práctico evaluativo");
            nota2=leer.nextInt();
            System.out.println("Primer Integrador");
            nota3=leer.nextInt();
            System.out.println("Segundo Integrador");
            nota4=leer.nextInt();
            double prom=nota1*0.10+nota2*0.15+nota3*0.25+nota4*0.5;
            if (prom>=7){
            aprob++;
            } else {
            desaprob++;
            }
        }
        System.out.println("Cantidad de alumnos aprobados: "+aprob);
        System.out.println("Cantidad de alumnos desaprobados: "+desaprob);
    }
}
