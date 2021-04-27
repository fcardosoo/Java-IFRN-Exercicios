/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Atv01_sorteio {
    public static void main(String[] args){
        long numero = Math.round(Math.random()*10);
        /*Math.random() retorna um valor aleatório entre
        zero e um. multiplica-se por 10 e após utiliza-se
        o método Math.round para arredondar e ter um número
        inteiro entre 1 e 10*/
        long chute;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um númer entre 1 e 10");
        chute = leitor.nextLong();
        while(numero!=chute){
            System.out.println("Digite um númer entre 1 e 10");
            chute=leitor.nextLong();
        }
        System.out.println("Você acertou!");
    }
}
