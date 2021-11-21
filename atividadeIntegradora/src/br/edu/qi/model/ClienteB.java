package br.edu.qi.model;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Date;

public class ClienteB extends Cliente{
    private double desconto;
    private String dataCadastro;

    public ClienteB(){
        this.desconto = 0.05;
        limite = 5000.00;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void aumentarLimite() {
        String[] arrayDataCadastro = dataCadastro.split("/");
        int anoCadastro = Integer.parseInt(arrayDataCadastro[1]);
        int mesCadastro = Integer.parseInt(arrayDataCadastro[0]);

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int mesAtual = localDate.getMonthValue();
        int anoAtual = localDate.getYear();

        int anoAtualM = YearMonth.now().getYear();

        if (anoAtual > anoCadastro) {
            if (mesAtual > mesCadastro) {
                limite = (1 + (anoAtual - anoCadastro) * 0.1) * 5000;
                mostrarLimite();
            }
        }
    }

    public double saldoDevedor() {
        saldoDevedor = totalCompras - pagamentosEfetuados;
        return saldoDevedor;
    }

    @Override //Sobreescrita de método
    public void mostrarLimite(){
        System.out.println("Seu limite TOTAL é de R$" + limite + " e você ainda tem disponível R$" +
                (limite - saldoDevedor));
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
        saldoDevedor();
        mostrarInformacoes();
        return totalCompras;
    }

    @Override
    public double pagar(double valorPagamento) {
        pagamentosEfetuados += valorPagamento;
        bonusPagamento = pagamentosEfetuados;
        System.out.println("Pagamento de R$"+valorPagamento + " efetuado com sucesso");
        saldoDevedor();
        mostrarInformacoes();
        return valorPagamento;
    }

    @Override
    public void mostrarInformacoes() {
        if(bonusPagamento>=2000.00){
            System.out.println("Você acaba de receber um bônus de 5% " +
                    "nas 2 próximas compras");
            bonusPagamento = 0;
        }
        System.out.println("Seu saldo devedor é de R$" + saldoDevedor);
    }
}
