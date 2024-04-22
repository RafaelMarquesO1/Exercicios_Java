import java.util.Scanner;

public class Ex5Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário inserir os 3 números da sorte
        System.out.println("Insira 3 números da sorte (entre 0 e 38):");
        int[] numeros = new int[3];

        // Preenche o vetor com os números fornecidos pelo usuário
        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcula a soma dos números que são divisíveis por 4
        int somaDivisiveisPor4 = 0;
        for (int numero : numeros) {
            if (numero % 4 == 0) {
                somaDivisiveisPor4 += numero;
            }
        }

        // Divide a soma encontrada por 3
        double resultado = somaDivisiveisPor4 / 3.0;

        // Determina o prêmio com base no resultado
        if (resultado > 25) {
            System.out.println("Parabéns! Você ganhou o prêmio máximo.");
        } else if (resultado >= 20 && resultado <= 25) {
            System.out.println("Parabéns! Você ganhou um prêmio comum.");
        } else {
            System.out.println("Você não receberá nenhum prêmio.");
        }

        scanner.close();
    }
}
