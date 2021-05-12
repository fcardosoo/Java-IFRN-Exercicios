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
public class Aula12_ex05_ProgMes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 12");
        ImprimirMes(PegarMes(leitor.nextInt()));
    }
    
    public static Aula12_ex05_Mes PegarMes(int MesInt){
    Aula12_ex05_Mes MesCerto = Aula12_ex05_Mes.DEZEMBRO;
    switch(MesInt){
        case 1:
            MesCerto = Aula12_ex05_Mes.JANEIRO;
            break;
        case 2:
            MesCerto = Aula12_ex05_Mes.FEVEREIRO;
            break;
        case 3:
            MesCerto = Aula12_ex05_Mes.MARCO;
            break;
        case 4:
            MesCerto = Aula12_ex05_Mes.ABRIL;
            break;
        case 5:
            MesCerto = Aula12_ex05_Mes.MAIO;
            break;
        case 6:
            MesCerto = Aula12_ex05_Mes.JUNHO;
            break;
        case 7:
            MesCerto = Aula12_ex05_Mes.JULHO;
            break;
        case 8:
            MesCerto = Aula12_ex05_Mes.AGOSTO;
            break;
        case 9:
            MesCerto = Aula12_ex05_Mes.SETEMBRO;
            break;
        case 10:
            MesCerto = Aula12_ex05_Mes.OUTUBRO;
            break;
        case 11:
            MesCerto = Aula12_ex05_Mes.NOVEMBRO;
            break;
        case 12:
            MesCerto = Aula12_ex05_Mes.DEZEMBRO;
            break;
    }
    return MesCerto;
    }
    
    
    public static void ImprimirMes(Aula12_ex05_Mes MesCerto){
        switch(MesCerto){
            case JANEIRO:
                System.out.println("O mês informado foi JANEIRO!");
                break;
            case FEVEREIRO:
                System.out.println("O mês informado foi FEVEREIRO!");
                break;
            case MARCO:
                System.out.println("O mês informado foi MARÇO!");
                break;
            case ABRIL:
                System.out.println("O mês informado foi ABRIL!");
                break;
            case MAIO:
                System.out.println("O mês informado foi MAIO!");
                break;
            case JUNHO:
                System.out.println("O mês informado foi JUNHO!");
                break;
            case JULHO:
                System.out.println("O mês informado foi JULHO!");
                break;
            case AGOSTO:
                System.out.println("O mês informado foi AGOSTO!");
                break;
            case SETEMBRO:
                System.out.println("O mês informado foi SETEMBRO!");
                break;
            case OUTUBRO:
                System.out.println("O mês informado foi OUTUBRO!");
                break;
            case NOVEMBRO:
                System.out.println("O mês informado foi NOVEMBRO!");
                break;
            case DEZEMBRO:
                System.out.println("O mês informado foi DEZEMBRO!");
                break;
        }
    }
}