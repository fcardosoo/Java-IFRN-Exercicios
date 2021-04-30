/*
Realize a leitura de duas matrizes de inteiros,
a primeira chamada de A de dimensões 3 x 4 e a 
segunda chamada de B de dimensões 3 x 2. Construa 
uma matriz C de dimensões 3 x 6, sendo essa a 
junção das duas outras matrizes. Para isso, você 
deve copiar os elementos das matrizes A e B para 
a matriz C.
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula06_ex08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int A[][] = new int [3][4];
        int B[][] = new int [3][2];
        int C[][] = new int [3][6];
        
        System.out.println("~~~~~~~ Lendo Matriz A ~~~~~~~");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.printf("Lendo Matriz na posição %d x %d: ", i, j);
                A[i][j] = leia.nextInt();
            }
        }
        System.out.println("~~~~~~~ Lendo Matriz B ~~~~~~~");
        for(int k=0; k<3; k++){
            for(int l=0; l<2; l++){
                System.out.printf("Lendo Matriz na posição %d x %d: ", k, l);
                B[k][l] = leia.nextInt();
            }
        }
        System.out.println("~~~~~~~ Matriz A ~~~~~~~");
        for(int q=0; q<3; q++){
            for(int r=0; r<4; r++){
                System.out.print("   " + A[q][r]);
            }
            System.out.println("\n");
        }
        System.out.println("~~~~~~~ Matriz B ~~~~~~~");
        for(int s=0; s<3; s++){
            for(int t=0; t<2; t++){
                System.out.print("   " + B[s][t]);
            }
            System.out.println("\n");
        }
        for(int m=0; m<3; m++){
            for(int n=0; n<4; n++){
                C[m][n] = A[m][n];
            }
        }
        for(int o=0; o<3; o++){
            for(int p=4; p<6; p++){
                C[o][p] = B[o][p-4];
            }
        }
        System.out.println("~~~~~~~ Matriz C ~~~~~~~");
        for(int u=0; u<3; u++){
            for(int v=0; v<6; v++){
                System.out.print("   " + C[u][v]);
            }
            System.out.println("\n");
        }
    }
}