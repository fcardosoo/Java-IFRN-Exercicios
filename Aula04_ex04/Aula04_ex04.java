/*
 Crie um programa para receber o comprimento de 3 pedaços 
de madeira e mostrar uma mensagem caso eles formem um triângulo.
Dica: monte uma expressão usando operadores lógicos e que 
seja verdadeira somente quando o comprimento de cada 
pedaço de madeira é menor que a soma do comprimento dos 
2 pedaços restantes (A < B + C e B < A + C e C < A + B).
 */
package aula04;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Atv04_validaTriangulos {
    public static void main(String[] args){
        int l1, l2, l3;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite os 3 lados de um triângulo: ");
        l1 = leia.nextInt();
        l2 = leia.nextInt();
        l3 = leia.nextInt();
        if(l1<l2+l3 && l2<l1+l3 && l3<l1+l2){
            System.out.println("Forma um triângulo");
        }
        System.out.println("FIM!");
    }
}
