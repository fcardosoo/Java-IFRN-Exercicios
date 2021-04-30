/*
Faça um programa que leia uma matriz MxN, onde M 
e N são informados pelo usuário, e que imprima o
maior valor encontrado na matriz.
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula06_ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n, m;
        int maior = 0;
        System.out.println("Informe o número de linhas da matriz: ");
        n = leitor.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        m = leitor.nextInt();
        int matriz[][] = new int [n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                System.out.printf("Insira um valor na posiçao %d x %d: ", i, j);
                matriz[i][j] = leitor.nextInt();
            }
        }
    for(int k=0; k<n;k++){
        for(int l=0; l<m; l++){
            if(matriz[k][l]>maior){
                maior = matriz[k][l];
            }
        }
    }
        System.out.printf("O maior valor cadastrado foi %d \n", maior);
    }
}
