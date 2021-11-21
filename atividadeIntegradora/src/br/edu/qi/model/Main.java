package br.edu.qi.model;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ClienteA pedro = new ClienteA();
        ClienteB joao = new ClienteB();
        ClienteC ana = new ClienteC();

        ana.comprar(200.0);
        ana.comprar(900.0);
        ana.pagar(200.0);
        ana.comprar(850.0);

        joao.setDataCadastro("10/2020");
        joao.comprar(1500.0);
        joao.comprar(4000.0);
        joao.comprar(2000.0);
        joao.aumentarLimite();
        joao.pagar(3000);

        pedro.comprar(9000.0);
        pedro.comprar(3000.00);
        pedro.comprar(3500.00);
        pedro.mostrarLimite();
        pedro.pagar(1500.0);
        pedro.pagar(2500.0);
    }
}
