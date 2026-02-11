package com.operacoesbancarias.model;

import com.operacoesbancarias.exception.SaldoInsuficienteException;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        validarValor(valor);
        saldo += valor;
    }

    public void sacar(double valor){
        validarValor(valor);
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        
        saldo -= valor;
    }

    private void validarValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }
    }

}
