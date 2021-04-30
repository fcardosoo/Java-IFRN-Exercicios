/*
 comparando Strings com o EQUALS
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula07_ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome: ");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome");
        String nome2 = leitor.next();
        
        if(nome1.equals(nome2)){
            System.out.println("Nomes iguais");
        } else{
            System.out.println("Nomes diferentes");
        }
    }
}