/*
Crie um programa que receba o nome e a idade de duas 
pessoas que nasceram em anos diferentes e que diga o
nome da pessoa mais velha. 
 */
package aula04;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Atv06_idade {
    public static void main(String[] args){
        String nome1, nome2;
        int idade1, idade2;
        Scanner leia = new Scanner(System.in);
    
        System.out.println("Nome 1: ");
        nome1 = leia.nextLine();
        System.out.printf("Ano de nascimento do %s: ", nome1);
        idade1 = leia.nextInt();
        System.out.println("Nome 2: ");
        nome2 = leia.next();
        System.out.printf("Ano de nascimento do %s: ", nome2);
        idade2 = leia.nextInt();
        
        
        if(idade1<idade2){
            System.out.printf("O %s é mais velho!\n", nome1);
            System.out.printf("O %s é mais novo!", nome2);
        }else{
            System.out.printf("O %s é mais velho!\n", nome2);
            System.out.printf("O %s é mais novo!", nome1);
        }
    }
}
