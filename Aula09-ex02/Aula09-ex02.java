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
public class Aula09_ex02_Recursividade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = leitor.nextInt();
        int num = funcaoX(n);
        System.out.println(num);
    }
    public static int funcaoX(int n){
        int x = 0;
        if(n<=0){
            x = 0;
        }else{
            x = n + funcaoX(n-1);
        }
    return x;
    }
}