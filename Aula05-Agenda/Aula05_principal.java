/*
Método main acessando diretamente a classe Agenda
e modificando os parâmetros da agenda2;
Corrigir usando os princípios do encapsulamento no Principal2
 */
package aula05_Agenda;

/**
 *
 * @author Fabiano
 */
public class Principal {
    public static void main(String[] args) {
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
        agenda1.anote(12,10, "Dia das Crianças");
        agenda2.anote(7, 15, "Dia da Independência");
        
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
        
        
        agenda2.dia = 7;
        agenda2.mes = 15;
        agenda2.anotacao = "Dia das crianças";
        agenda2.mostraAnotacao();
    }
}
