import java.util.Scanner;

public class ExCondicional11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int x1 = teclado.nextInt();

        System.out.println("Digite um número inteiro: ");
        int x2 = teclado.nextInt();

        System.out.println("Digite um número inteiro: ");
        int x3 = teclado.nextInt();

        if (x1 <= x2 && x2 <= x3) {
            System.out.println("Números em ordem crescente: " + x1 + ", " + x2 + ", " + x3);
        } 
        
        else if (x1 <= x3 && x3 <= x2) {
            System.out.println("Números em ordem crescente: " + x1 + ", " + x3 + ", " + x2);
        } 
        
        else if (x2 <= x1 && x1 <= x3) {
            System.out.println("Números em ordem crescente: " + x2 + ", " + x1 + ", " + x3);
        } 
        
        else if (x2 <= x3 && x3 <= x1) {
            System.out.println("Números em ordem crescente: " + x2 + ", " + x3 + ", " + x1);
        } 
        
        else if (x3 <= x1 && x1 <= x2) {
            System.out.println("Números em ordem crescente: " + x3 + ", " + x1 + ", " + x2);
        } 
        
        else {
            System.out.println("Números em ordem crescente: " + x3 + ", " + x2 + ", " + x1);
        }
    }
}
