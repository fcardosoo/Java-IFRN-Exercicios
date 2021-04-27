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
public class Atv02_sorteio {
    public static void main(String[] args){
        long numero = Math.round(Math.random()*10);
        Scanner leitor = new Scanner(System.in);
        long chute = -1;
        while(numero != chute){
            System.out.println("Digite um número entre 1 e 10");
            chute = leitor.nextLong();
        }
        System.out.println("Você acertou!");
    }
    
}
