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
public class Atv05_lerImpares {
    public static void main(String[] args) {
        int cont, num;
        cont = 1;
        Scanner ler = new Scanner(System.in);
        while(cont<=10){
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            if(num%2!=0){
                System.out.println(num);
            cont++;
            }
        }
    }
}
