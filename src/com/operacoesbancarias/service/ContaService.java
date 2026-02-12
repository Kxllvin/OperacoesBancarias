package com.operacoesbancarias.service;

import java.math.BigDecimal;
import com.operacoesbancarias.model.Conta;

public class ContaService {

    private Conta conta;

    public ContaService(Conta conta) {
        this.conta = conta;
    }

    public void depositar (BigDecimal valor){
        conta.depositar(valor);
    }

    public void sacar(BigDecimal valor){
        conta.sacar(valor);
    }

    public BigDecimal consultarSaldo(){
        return conta.getSaldo();
    }
}
