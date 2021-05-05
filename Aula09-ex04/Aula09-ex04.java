/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula09_ex04{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número a ser dobrado várias vezes: ");
        int numero = leitor.nextInt();
        System.out.println("Digite um número limite para a operação: ");
        int limite = leitor.nextInt();
        System.out.println(dobrarNumeroAteLimite(numero, limite));
    }
    
    public static int dobrarNumeroAteLimite(int numero, int limite){
        for(int aux = numero*2; aux <limite; aux = numero*2){
            numero = aux;
        }
    return numero;
    }
}
