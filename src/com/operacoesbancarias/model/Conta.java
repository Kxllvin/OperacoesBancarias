package com.operacoesbancarias.model;

import com.operacoesbancarias.exception.SaldoInsuficienteException;


public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        
        saldo -= valor;
    }

}
