import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O primeiro número deve ser menor que o segundo");
        } else {
            for (int i = numero1; i <= numero2; i++) {
                System.out.printf("Imprimindo o número %d\n", i-numero1);
            }
        }

    }
}
