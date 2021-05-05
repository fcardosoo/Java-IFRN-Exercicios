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
public class Aula12_ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-- Digite o primeiro filme --");
        Aula12_ex02_Filme filme1 = lerFilme(leitor);
        System.out.println("-- Digite o segundo filme -- ");
        Aula12_ex02_Filme filme2 = lerFilme(leitor);
        System.out.println("-- Digite o terceiro filme --");
        Aula12_ex02_Filme filme3 = lerFilme(leitor);
        
        System.out.println("----- Seu primeiro filme ----- ");
        imprimeFilme(filme1);
        System.out.println("----- Seu segundo filme -----");
        imprimeFilme(filme2);
        System.out.println("----- Seu terceiro filme -----");
        imprimeFilme(filme3);
    }
    
    public static Aula12_ex02_Filme lerFilme(Scanner leitor){
        Aula12_ex02_Filme filme = new Aula12_ex02_Filme();
        System.out.print("Digite o nome do Filme: ");
        filme.nome = leitor.next();
        System.out.print("Digite o nome do autor: ");
        filme.autor = leitor.next();
        System.out.print("Digite o ano: ");
        filme.ano = leitor.nextInt();
        System.out.print("Digite o preço R$: ");
        filme.preco = leitor.nextFloat();
        return filme;
    }
    
    public static void imprimeFilme(Aula12_ex02_Filme filme){
        System.out.println("Título: " + filme.nome+ "\n"+
                "Autor: " + filme.autor + "\n" + "Ano: " + 
                + filme.ano + "\n" + "Preço: R$" + 
                filme.preco);
    }
}
