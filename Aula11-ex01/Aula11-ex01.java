/*
 Criando Exceções em java
 */
package aula11;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class DivisaoPorZero {
    public static int quociente(int numerador, int denominador) throws ArithmeticException{
        return numerador/denominador;
    }
    public static void main(String[] args) {
        try{
            Scanner leia = new Scanner(System.in);
            System.out.println("Digite o numerador: ");
            int numerador = leia.nextInt();
            System.out.println("Digite o denominador: ");
            int denominador = leia.nextInt();
            double resultado = quociente(numerador, denominador);
            System.out.println("O resultado da divisão é: "+ resultado);            
        }   
        catch (ArithmeticException erro){
            System.err.println("Erro: "+ erro); /* Usando o .err. para o Java imprimir em vermelho */
            System.out.println("Zero não é um denominador válido!");
        }
        
    }
}
