import java.util.Scanner;

public class Ex3Vetor {
    public static void main(String [] args) {
        int [] numero = new int [20];
        Scanner teclado = new Scanner(System.in);


        for(int i = 0; i < numero.length; i++){
            System.out.println("Digite o numero desejado:");
            numero[i] = teclado.nextInt();

        }

        for(int i = 0; i < numero.length; i++) {
            System.out.println(i + 1 + "° Número: " + numero[i]);

        }

        System.out.println("------Numeros-------");
        for (int i = 1; i <= 20; i++)

            if(i % 2 == 0){
                double ap = numero[i] * 2;
                System.out.println(ap);
            }
            else if(i != 0){
                double pa = numero[i];
                System.out.println(pa);
            }
    }
}
