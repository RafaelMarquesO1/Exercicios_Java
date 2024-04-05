import java.util.Scanner;
public class ExCondicional3 {

    public static void main(String [] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número: ");
    double x1 = teclado.nextDouble();

    
    if(x1 >= 100 && x1 <= 200){
        System.out.println("\nSeu número está entre 100 e 200!");
    }
    else{
        System.out.println("\nSeu número não está entre 100 e 200!");
    }
    
    }
}