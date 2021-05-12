/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula12_ex04_ProgEnum {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o dia da semana(1 a 7), onde 1 representa o Domingo");
        imprimirDia(pegarDia(leitor.nextInt()));
    }

public static Aula12_ex04_DiaSemana pegarDia(int diaSemanaInt){
    Aula12_ex04_DiaSemana diaSemana = Aula12_ex04_DiaSemana.SABADO;
    switch (diaSemanaInt){
        case 1:
            diaSemana = Aula12_ex04_DiaSemana.DOMINGO;
            break;
        case 2:
            diaSemana = Aula12_ex04_DiaSemana.SEGUNDA_FEIRA;
            break;
        case 3:
            diaSemana = Aula12_ex04_DiaSemana.TERCA_FEIRA;
            break;
        case 4:
            diaSemana = Aula12_ex04_DiaSemana.QUARTA_FEIRA;
            break;
        case 5:
            diaSemana = Aula12_ex04_DiaSemana.QUINTA_FEIRA;
            break;
        case 6:
            diaSemana = Aula12_ex04_DiaSemana.SEXTA_FEIRA;
            break;
    }
    return diaSemana;
}

public static void imprimirDia(Aula12_ex04_DiaSemana diaSemana){
    switch(diaSemana){
        case DOMINGO:
            System.out.println("Domingo");
            break;
        case SEGUNDA_FEIRA:
            System.out.println("Segunda");
            break;
        case TERCA_FEIRA:
            System.out.println("Terça");
            break;
        case QUARTA_FEIRA:
            System.out.println("Quarta");
            break;
        case QUINTA_FEIRA:
            System.out.println("Quinta");
            break;
        case SEXTA_FEIRA:
            System.out.println("Sexta");
            break;
        case SABADO:
            System.out.println("Sabado");
            break;
    }
}
}