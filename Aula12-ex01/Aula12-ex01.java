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
public class Aula12_ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-- Digite seu primeiro endereço--");
        Aula12_ex01_Endereco end1 = lerEndereco(leitor);
        System.out.println("-- Digite seu segundo endereço--");
        Aula12_ex01_Endereco end2 = lerEndereco(leitor);
        System.out.println("------ Seu primeiro endereço é -----");
        imprimirEndereco(end1);
        System.out.println("------ Seu segundo endereço é -----");
        imprimirEndereco(end2);
    }
    public static Aula12_ex01_Endereco lerEndereco(Scanner leitor){
        Aula12_ex01_Endereco end = new Aula12_ex01_Endereco();
        System.out.println("Digite a rua onde você mora:");
        end.rua = leitor.nextLine();
        System.out.println("Digite o número da residência:");
        end.numero = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Digite o bairro: ");
        end.bairro = leitor.nextLine();
        System.out.println("Digite a cidade: ");
        end.cidade = leitor.nextLine();
        System.out.println("Digite o estado: ");
        end.estado = leitor.nextLine();
        System.out.println("Digite o CEP: ");
        end.cep = leitor.nextLine();
        System.out.println(" ");
        return end;
    }
    public static void imprimirEndereco(Aula12_ex01_Endereco end){
        System.out.println(end.rua + ", " + end.numero);
        System.out.println(end.bairro + ", " + end.cidade);
        System.out.println("CEP" + end.cep + ", " + end.estado);
    }
}