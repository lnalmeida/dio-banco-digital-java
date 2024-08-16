package com.dio.appbank.models.abstracts;

import com.dio.appbank.enums.TipoConta;
import com.dio.appbank.models.Cliente;
import lombok.Getter;

import java.util.Random;


public abstract class Conta implements IConta {
    
    private final int CONTA_PADRAO = 1;

    @Getter
    protected TipoConta tipoConta;
    protected Cliente cliente;
    @Getter
    protected  int agencia;
    @Getter
    protected final String numeroConta;
    @Getter
    protected double saldo;

    public Conta(Cliente cliente) {
        this.agencia = CONTA_PADRAO;
        this.numeroConta = gerarNumeroConta();
        this.saldo = 0;
        this.cliente = cliente;
    }

    protected static String gerarNumeroConta() {
        Random random = new Random();
        int novoNumeroConta = 10000 + random.nextInt(90000);
        return String.valueOf(novoNumeroConta);
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo > 0) {
            System.out.printf("Operação:  SAQUE - Valor: R$%.2f\n", valor);
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        System.out.printf("Operação:  DEPÓSITO - Valor: R$%.2f\n", valor);
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        System.out.printf("Operação:  TRANSFERÊNCIA\nOrigem: %s - %s\nDestino: %s - %s\nValor: R$%.2f\n", this.tipoConta, this.numeroConta, contaDestino.tipoConta, contaDestino.numeroConta, valor);
        this.saldo -= valor;
        contaDestino.saldo +=valor;
    }

    protected void imprimirInfosConta() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Conta: %s", numeroConta));
        System.out.println(String.format("Saldo: R$%.2f", saldo));
    }
}
