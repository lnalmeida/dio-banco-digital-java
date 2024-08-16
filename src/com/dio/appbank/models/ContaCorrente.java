package com.dio.appbank.models;

import com.dio.appbank.enums.TipoConta;
import com.dio.appbank.models.abstracts.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, TipoConta tipoConta) {
        super(cliente);
        this.tipoConta = tipoConta;
    }

    public void imprimirExtrato() {
        System.out.println("############### EXTRATO CONTA CORRENTE Nº " + this.numeroConta + " ###############");
        super.imprimirInfosConta();
    }
}
