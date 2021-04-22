*
Crie um programa para calcular e imprimir a área de um retângulo
de lados 20 e 30.
 */
package aula03;

/**
 *
 * @author Fabiano
 */
public class aula03_ex03 {
    public static int lado;
    public static int altura;
    public static void main(String args[]){
        lado = 20;
        altura = 30;
        int area = lado*altura;
        System.out.printf("A área do retângulo de %d x %d é de %d.\n", lado, altura, area);
    }
    
}
