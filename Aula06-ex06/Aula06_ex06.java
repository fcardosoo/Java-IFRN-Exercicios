/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula06_ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
        for (int i=0; i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
