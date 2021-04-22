/*
Escreva um programa que lê o nome de um aluno, o nome de uma 
disciplina e as notas de 4 provas realizadas nela. Calcule 
e apresente na tela a média aritimética alcançada por essas notas. Imprima essa informação através de uma mensagem que informe também o nome do aluno e da disciplina cursada.
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class aula03_atv02_ex03 {
    public static void main(String[] args){
        Scanner novoscan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = novoscan.next();
        System.out.println("Digite o nome da disciplina: ");
        String disciplina = novoscan.next();
        System.out.println("Nota 1: ");
        float n1 = novoscan.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = novoscan.nextFloat();
        System.out.println("Nota 3: ");
        float n3 = novoscan.nextFloat();
        System.out.println("Nota 4: ");
        float n4 = novoscan.nextFloat();
        float media = (n1+n2+n3+n4)/4;
        System.out.printf("O aluno %s, na discuplina %s ficou com media %f.", nome, disciplina, media);
    }
    
}
