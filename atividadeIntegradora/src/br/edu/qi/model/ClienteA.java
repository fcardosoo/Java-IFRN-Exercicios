package br.edu.qi.model;

public class ClienteA extends Cliente{
    private double desconto;

    public ClienteA(){
        this.desconto = 0.1;
        limite = 10000.00;
    }

    public void aumentarLimite(){
        if(totalCompras >= 5000.0){
            limite = 10000.00 + (((int)totalCompras/5000)*500);
        }
        System.out.println("Seu limite TOTAL é de R$" + limite + " e você ainda tem disponível R$" +
                (limite - saldoDevedor));
    }

    public double saldoDevedor(){
        saldoDevedor = totalCompras-pagamentosEfetuados;
        return saldoDevedor;
    }

    @Override
    public double comprar(double valorCompra) {
        if (valorCompra + totalCompras > limite) {
            System.out.println("Sua compra excede o limite disponível!");
        } else {
            totalCompras += valorCompra;
            System.out.println("Compra de R$" + valorCompra + " realizada com sucesso!");
            if (totalCompras >= 5000.00) {
                aumentarLimite();
            }
        }
        mostrarInformacoes();
        return totalCompras;
    }

    @Override
    public double pagar(double valorPagamento){
        pagamentosEfetuados += valorPagamento;
        bonusPagamento = pagamentosEfetuados;
        System.out.println("Pagamento de R$"+valorPagamento + " efetuado com sucesso");
        saldoDevedor();
        mostrarInformacoes();
        return valorPagamento;
    }

    @Override
    public void mostrarInformacoes(){
        if(bonusPagamento>=2000.00){
            System.out.println("Você acaba de receber um bônus de 10% " +
                    "nas 2 próximas compras");
            bonusPagamento = 0;
        }
        System.out.println("Seu saldo devedor é de R$" + saldoDevedor);
    }
}
