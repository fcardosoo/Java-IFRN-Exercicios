/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

import java.util.Scanner;

public class Aula08_avaliacao {
    public static void main(String args[]){
        Scanner leitor=new Scanner(System.in);
        double numero=0;
        while(digita(numero)){
            System.out.println("Digite um numero");
            numero=leitor.nextDouble();
        }
        System.out.println("Saindo :p");
    }

    public static boolean digita(double n){
        if(n==-1){
            return false;
        }
        return true;
    }
}