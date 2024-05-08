import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) { 
        double saldo = 0; 
        Scanner scanner = new Scanner(System.in);
        while (true) { 
        
        int opcao = scanner.nextInt();

        switch (opcao) {
          case 1:
            double depo = scanner.nextDouble();
            saldo += depo;
            System.out.println("Saldo Atual: " + saldo);
              break;
          case 2:
            double saq = scanner.nextDouble();
            if (saq > saldo){
              System.out.println("Saldo Insuficiente.");
            } else {
              saldo -= saq;
              System.out.println("Saldo Atual: " + saldo);
            }
            break;
          case 3:
            System.out.println("Saldo Atual: " + saldo);
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