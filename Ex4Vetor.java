import java.util.Scanner;

public class Ex4Vetor {
    public static void main(String[] args) {
        // Palavras secretas cadastradas previamente
        String[] palavrasSecretas = {"computador", "teclado", "mouse", "monitor", "impressora"};
        // Palavra em comum entre as palavras secretas
        String palavraComum = "hardware";
        // Número máximo de tentativas
        int tentativasMaximas = 3;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao jogo das palavras!");
        System.out.println("Descubra qual é a palavra comum entre as palavras secretas.");
        System.out.println("Você tem " + tentativasMaximas + " tentativas para acertar.\n");
        
        int tentativas = 0;
        boolean acertou = false;
        
        while (tentativas < tentativasMaximas && !acertou) {
            System.out.print("Digite uma palavra: ");
            String palpite = scanner.nextLine();
            
            for (String palavra : palavrasSecretas) {
                if (palpite.equalsIgnoreCase(palavra)) {
                    acertou = true;
                    break;
                }
            }
            
            tentativas++;
        }
        
        if (acertou) {
            System.out.println("Parabéns! Você acertou a palavra secreta!");
        } else {
            System.out.println("Que pena! Você não conseguiu acertar a palavra secreta.");
        }
        
        scanner.close();
    }
}
