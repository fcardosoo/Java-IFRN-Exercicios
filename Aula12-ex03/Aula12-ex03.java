package aula12;

import java.util.Scanner;

public class Aula12_ex03 {
    public static int i=0;
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aula12_ex03_Pessoa aluno = new Aula12_ex03_Pessoa();
        System.out.println("Digite o nome: ");
        aluno.nome = leitor.nextLine();
        System.out.println("Digite a idade: ");
        aluno.idade = leitor.nextInt();
        System.out.println("Digite o peso:");
        aluno.peso = leitor.nextFloat();
        System.out.println("Digite o sexo [1] Para Masculino ou [2] Para Feminino");
        i = leitor.nextInt();
        imprimir(aluno);
    }
    
    public static Aula12_ex03_Sexo TipoSexo(int sexo){
        Aula12_ex03_Sexo s = Aula12_ex03_Sexo.MASCULINO;
        switch(sexo){
            case 1:
                s = Aula12_ex03_Sexo.MASCULINO;
                break;
            case 2:
                s = Aula12_ex03_Sexo.FEMININO;
                break;
        }
    return s;
    }
    
    public static String imprimeSexo (Aula12_ex03_Sexo a){
        String sexo = "";
        switch(a){
            case MASCULINO:
                sexo = "Masculino";
                break;
            default:
                sexo = "Feminino";
                break;
        }
    return sexo;
    }
    
    public static void imprimir(Aula12_ex03_Pessoa a){
        System.out.println("Dados do usuario "+a.nome);
        System.out.print("Nome: "+a.nome);
        System.out.println();
        System.out.print("Idade: "+a.idade);
        System.out.println();
        System.out.println("Peso: "+a.peso);
        System.out.println();
        System.out.println("Sexo: "+imprimeSexo(TipoSexo(i)));
    }
}
