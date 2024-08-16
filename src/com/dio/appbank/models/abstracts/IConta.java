package com.dio.appbank.models.abstracts;

public interface IConta {
    void sacar (double valor);
    void depositar(double valor);
    void transferir(double valor, Conta constaDestino);
    void imprimirExtrato();
}
