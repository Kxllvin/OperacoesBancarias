import java.util.Scanner;

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class VerificadorElegibilidadeConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        int idade = scanner.nextInt(); 
        
        if (idade <= 17)
          System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
            if (idade >= 18)
              System.out.println("Voce esta elegivel para criar uma conta bancaria.");       

// Fechamos o objeto Scanner para liberar os recursos:
        scanner.close(); 
    }
}