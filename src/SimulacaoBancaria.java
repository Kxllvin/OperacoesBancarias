import com.operacoesbancarias.model.Conta;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) { 
        Conta conta = new Conta(0);
        Scanner scanner = new Scanner(System.in);

        while (true) { 
        
        int opcao = scanner.nextInt();

        switch (opcao) {
          case 1:
            double depo = scanner.nextDouble();
            conta.depositar(depo);
            System.out.println("Saldo Atual: " + conta.getSaldo());
              break;

          case 2:
            double saq = scanner.nextDouble();
            if (saq > conta.getSaldo()){
              System.out.println("Saldo Insuficiente.");
            } else {
              conta.sacar(saq);
              System.out.println("Saldo Atual: " + conta.getSaldo());
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