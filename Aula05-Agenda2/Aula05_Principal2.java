/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_Agenda;

/**
 *
 * @author Fabiano
 */
public class Principal2 {
    public static void main(String[] args) {
        Agenda2 agenda3 = new Agenda2();
        Agenda2 agenda4 = new Agenda2();
        
        agenda3.anote(12,10, "Dia das Crianças");
        agenda4.anote(7, 15, "Dia da Independência");
        
        agenda3.mostraAnotacao();
        agenda4.mostraAnotacao();
        
        /* agenda4.dia = 7;
        agenda4.mes = 15; 
        agenda4.anotacao = "Dia das crianças"; */
        agenda4.mostraAnotacao();
    }
}
