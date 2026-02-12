package com.operacoesbancarias.app;

import com.operacoesbancarias.exception.SaldoInsuficienteException;
import com.operacoesbancarias.model.Conta;
import java.math.BigDecimal;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) { 
        Conta conta = new Conta(BigDecimal.ZERO);
        Scanner scanner = new Scanner(System.in);

        while (true) { 
        
        int opcao = scanner.nextInt();

        switch (opcao) {
          case 1:
            BigDecimal depo = scanner.nextBigDecimal();
            conta.depositar(depo);
            System.out.println("Saldo Atual: " + conta.getSaldo());
              break;

          case 2:
            BigDecimal saq = scanner.nextBigDecimal();

            try {
                conta.sacar(saq);
                System.out.println("Saldo Atual: " + conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
            break;

          case 3:
            System.out.println("Saldo Atual: " + conta.getSaldo());
            break;

            default:
              System.out.println("Programa Encerrado.");
              scanner.close();
              return; // Encerra o método main e, portanto, o programa.
            }

            if (opcao != 1 && opcao != 2 && opcao != 3) {
                break; // Encerra o loop se a opção não for 1, 2 ou 3
            }
      }
  }  

}