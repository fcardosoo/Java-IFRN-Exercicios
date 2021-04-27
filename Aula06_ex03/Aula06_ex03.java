/*
Calcule o espaço ocupado na memória por vetores 
do tamanho do vetor mostrado na Figura 1, para
os tipos de dados char, short, long, float e
double.
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author Fabiano
 */
public class Aula06_ex03 {
    public static void main(String[] args) {
        System.out.println("~-~- ANALISANDO O ESPAÇO DE MEMÓRIA -~-~");
        char tipo = 'Z';
        while(tipo != 'X'){
            Scanner ler = new Scanner(System.in);
            System.out.println("Escolha:\n S: Short | I: Integer | L: Long |"
                + " C: Char\n F: Float | D: Double | V: Void | X: Sair");
            tipo = ler.nextLine().charAt(0);
            
            switch(tipo){
                case 'B':
                    System.out.println("VOID para 10 posições ocupa <<< 0 bytes >>>");
                    break;
                case 'C':
                    System.out.println("CHAR para 10 posições ocupa <<< 20 bytes >>>");
                    break;
                case 'D':
                    System.out.println("DOUBLE para 10 posições ocupa <<< 80 bytes >>>");
                    break;
                case 'F':
                    System.out.println("FLOAT para 10 posições ocupa <<< 40 bytes >>>");
                    break;
                case 'I':
                    System.out.println("INTEGER para 10 posições ocupa <<< 40 bytes >>>");
                    break;
                case 'L':
                    System.out.println("LONG para 10 posições ocupa <<< 80 bytes >>>");
                    break;
                case 'S':
                    System.out.println("SHORT para 10 posições ocupa <<< 20 bytes >>>");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("Escolha:\n S: Short | I: Integer | L: Long |"
                + " C: Char\n F: Float | D: Double | V: Void | X: Sair");
            tipo = ler.nextLine().charAt(0);    
        }
    }
}
