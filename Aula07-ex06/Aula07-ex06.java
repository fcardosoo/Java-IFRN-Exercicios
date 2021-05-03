/*
Crie um programa que lê uma String e imprima apenas os 
caracteres de índice ímpar.
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula07_ex06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String texto = leia.next();
        System.out.println("Imprimindo as letras ímpares...");
        for(int i = 0; i <= texto.length()-1; i= i+2){
            System.out.print(texto.charAt(i) + ", ");
        }        
    }
}
