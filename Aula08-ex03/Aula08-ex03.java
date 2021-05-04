/*
Função para cálculo do quadrado;
*/
package aula08;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula08_ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = leitor.nextDouble();
        System.out.println("O quadrado desse número é: " + quadrado(num));
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        System.out.println("Digite um segundo número: ");
        double num2 = leitor.nextDouble();
        System.out.println("O quadrado do segundo número digitado é: " + quadrado(num2));
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
    }
public static double quadrado(double numero){
    return numero*numero;
}
}
