/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia3;

/**
 *
 * @author arce
 */
public class ejextra2 {
    public static void main(String[] args) {
        int A=1, B=2, C=3, D=4;
        System.out.println("Variable A= "+A);
        System.out.println("Variable B= "+B);
        System.out.println("Variable C= "+C);
        System.out.println("Variable D= "+D);
        System.out.println("Variables Cambiadas");
        int aux=A;
        A=D; B=C; C=aux; D=B;
        System.out.println("Variable A= "+A);
        System.out.println("Variable B= "+B);
        System.out.println("Variable C= "+C);
        System.out.println("Variable D= "+D);
    }
       
}
//B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B