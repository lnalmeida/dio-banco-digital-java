package com.dio.appbank.models;

import com.dio.appbank.enums.TipoConta;
import com.dio.appbank.models.abstracts.Conta;

public class ContaPoupanca extends Conta {

     public ContaPoupanca(Cliente cliente, TipoConta tipoConta) {
         super(cliente);
         this.tipoConta = tipoConta;
     }

    public void imprimirExtrato() {
        System.out.println("############### EXTRATO CONTA POUPANÇA Nº " + this.numeroConta + " ###############");
        super.imprimirInfosConta();
    }
}
