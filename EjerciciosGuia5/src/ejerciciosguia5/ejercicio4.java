/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia5;

/**
 *
 * @author arce
 */
public class ejercicio4 {
    public static void main(String[] args) {
        int [][] matriz=new int [4][4];
        int [][] matrizTransp=new int [4][4];
        //relleno la matriz normal
        for (int i=0; i<matriz.length;i++)  {
        for (int j=0; j<matriz.length;j++)  {
        int numRandom=(int)(Math.random()*10) ;
        matriz[i][j]=numRandom;
        }
        }
        //muestro la matriz normal
        System.out.println("Matriz normal.");
        for (int i=0; i<4;i++)  {
        for (int j=0; j<4;j++)  {
            System.out.print(matriz[i][j]);
        }
            System.out.println(" ");
        }
        //relleno y muestro la matriz transpuesta
        System.out.println("Matriz Transpuesta.");
        for (int i=0; i<4;i++)  {
        for (int j=0; j<4;j++)  {
            matrizTransp[j][i]=matriz[j][i];
            System.out.print(matrizTransp[j][i]);
        }
            System.out.println(" ");
        }
    }
}
