public class ArrayTipoVetor {
    public static void main(String [] args) {

        /* Criar um aplicativo que armazena 5 frutas (String) em um vetor */

        // Vetor com capacidade máxima de 5 elementos do tipo String
        String [] frutas = new String [8];

        frutas[0] = "Maçã";
        frutas[1] = "Pera";
        frutas[2] = "Melancia";
        frutas[3] = "Morango";
        frutas[4] = "Tomate";
        frutas[5] = "Abacate";
        frutas[6] = "Acerola";
        frutas[7] = "Pequí";

        // Mostrando a fruta 'Morango'
        System.out.println(frutas[3]);
        // Mostrando a fruta 'Pera'
        System.out.println(frutas[1]);

        // Mostrando todas as frutas
        // UTILIZE UMA ESTRUTURA DE REPETIÇÃO
        System.out.println("-------------LISTANDO COM O LAÇO FOR----------");
        for(int i = 0; i < 8; i++) {
            System.out.println(frutas[i]);

        }
    }
}