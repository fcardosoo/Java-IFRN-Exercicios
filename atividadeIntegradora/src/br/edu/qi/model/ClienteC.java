package br.edu.qi.model;

public class ClienteC extends Cliente{

    public ClienteC(){
        limite = 1000.00;
    }

    public double saldoDevedor() {
        saldoDevedor = totalCompras - pagamentosEfetuados;
        mostrarInformacoes();
        return saldoDevedor;
    }

    @Override
    public double comprar(double valorCompra) {
        if (valorCompra + saldoDevedor > limite) {
            System.out.println("Sua compra excede o limite disponível!");
        } else {
            totalCompras += valorCompra;
            System.out.println("Compra de R$" + valorCompra + " realizada com sucesso!");
            saldoDevedor();
        }

        return totalCompras;
    }

    @Override
    public double pagar(double valorPagamento) {
        pagamentosEfetuados += valorPagamento;
        System.out.println("Pagamento de R$"+valorPagamento + " efetuado com sucesso");
        saldoDevedor();
        return valorPagamento;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Seu saldo devedor é de R$" + saldoDevedor);
    }
}
