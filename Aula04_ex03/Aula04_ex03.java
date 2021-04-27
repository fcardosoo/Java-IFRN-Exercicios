/*
Crie um programa em Java que receba 5 números e imprima 
a mensagem “Múltiplo de 2” caso a soma dos números digitados 
seja múltiplo de 2. Dica: para saber se um número 
é multiplo de 2, basta verificar se o resto da 
divisão (operador %) do número por 2 é igual 
a zero.
 */
package aula04;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Atv03_divisivel {
    public static void main(String[] args){
        int n1, n2, n3, n4, n5, soma;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite cinco números: ");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();
        n4 = leitor.nextInt();
        n5 = leitor.nextInt();
        soma = n1+n2+n3+n4+n5;
        if(soma%2==0){
            System.out.printf("A soma é %d\n",soma);
            System.out.println("Múltiplo de 2");
        }
        System.out.println("FIM!");
    }
}
