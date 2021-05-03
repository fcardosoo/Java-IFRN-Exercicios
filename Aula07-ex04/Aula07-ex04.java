/*
Usando o .toCharArray para converter uma palavra em 
um ARRAY de caracteres;
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula07_ex04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String nome1 = leitor.next();
        char[] caracteres = nome1.toCharArray();
        System.out.println("Inverso: ");
        for(int i= caracteres.length -1; i>=0; i--){
            System.out.print(caracteres[i]);
        }
        System.out.println("\n");
    }
}
