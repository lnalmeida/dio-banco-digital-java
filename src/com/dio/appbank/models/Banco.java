package com.dio.appbank.models;

import com.dio.appbank.models.abstracts.Conta;
import com.dio.appbank.models.abstracts.IBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    @Override
    public void imprimirContas() {
        List<Conta> contasImprimir = new ArrayList<>();
        System.out.println("############## CONTAS ###############");
        for(Conta c : contas) {
            c.imprimirInfosConta();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
