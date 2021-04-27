/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Atv07_intervalo {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor, digite um número: ");
        double valor = leitor.nextDouble();
        if(valor>=10 && valor<=20){
            System.out.println("Valor digitado enre 10 e 20");
        }else{
            System.out.println("Valor fora do intervalo");
        }
    }
}
