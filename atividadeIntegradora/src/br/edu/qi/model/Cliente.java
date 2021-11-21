package br.edu.qi.model;

public abstract class Cliente {
    protected double limite;
    protected double saldoDevedor;
    protected double pagamentosEfetuados;
    protected double bonusPagamento;
    protected double totalCompras;

    public boolean verificarLimite(double valorCompra){
        return true;
    }

    public void mostrarLimite(){
        System.out.println("Limite: "+limite);
    }

    public void mostrarSaldoDevedor(){
        System.out.println("");
    }

    public abstract double comprar(double valorCompra);
    public abstract double pagar(double valorPagamento);
    public abstract void mostrarInformacoes();
}
