/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class aula03_entradaDeDados_02 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Olá, " + nome + ", digite agora sua idade:");
        int idade = leitor.nextInt();
        System.out.println(idade + " anos, muito bem!");
        System.out.println("Digite agora sua altura:");
        float altura = leitor.nextFloat();
        System.out.println("Ok, entendi! você tem " + altura + "m de altura.");
    }
}
