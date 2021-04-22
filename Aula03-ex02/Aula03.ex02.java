/*
Escreva um programa que leia 3 frases digitadas pelo usuário,
que entram através do teclado, e que as imprima na tela na 
ordem inversa de entrada.
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class aula03_atv02_ex02 {
    public static void main(String[] args){
       Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira frase: ");
        String frase1 = leitor.next();
        System.out.println("Agora digige a segunda frase: ");
        String frase2 = leitor.next();
        System.out.println("Por fim, digite a terceira frase: ");
        String frase3 = leitor.next();
        System.out.printf("%s\n %s\n %s\n", frase3, frase2, frase1);
    }
    
}
