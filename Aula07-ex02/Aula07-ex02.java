/*
Comparando strings usando o .toUpperCase para colocar
todas as letras em maiúsculo;
Usando o .toLowerCase para colocá-las todas em 
minúsculo.
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula07_ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro nome: ");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome: ");
        String nome2 = leitor.next();
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();
        if(nome1.equals(nome2)){
            System.out.println("Nomes iguais!");
        }else{
            System.out.println("Nomes diferentes!");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        
        nome1 = nome1.toLowerCase();
        nome2 = nome2.toLowerCase();
        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
