/*
Usando o .charAt para capturar as letras;
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula07_ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String nome1 = leitor.next();
        System.out.println("Inverso...");
        for(int i= nome1.length()-1; i>=0; i--){
            System.out.print(nome1.charAt(i) + " ");
        }
    }
}

