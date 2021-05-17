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
public class Agenda2 {
    private int dia;
    private int mes;
    private String anotacao;
    
    public void anote(int dia, int mes, String anotacao){
        this.dia = dia;
        this.mes = mes;
        this.anotacao = anotacao;
        validaData();
    }
        
    private void validaData(){
        if((dia<1 || dia>31)||(mes<1 || mes>12)){
            dia = 0;
            mes = 0;
            anotacao = "anotação não inserida devido a adata inválida";
        }
    }
    public void mostraAnotacao(){
        System.out.println(dia + "/"+ mes+":"+anotacao);
    }
}
