/*
Utilizando o .indexOf
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula07_ex07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String nome1 = leitor.next();
        char ponto = '.';
        System.out.println("A posição do ponto '.' no texto é "
        + nome1.indexOf(ponto));
        /* caso não haja ponto no texto será retornado -1 */
    }
}
