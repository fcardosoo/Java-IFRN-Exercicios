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
public class Atv03_sorteioDoWhile {
    public static void main(String[] args) {
        long numero = Math.round(Math.random()*10);
        long chute;
        Scanner leia = new Scanner(System.in);
        do{
        System.out.println("Digite um número enre 1 e 10");
        chute = leia.nextLong();
        }while(numero != chute);
        System.out.println("Você acertou!");
    }
}