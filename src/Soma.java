//Somar as diagonais
public class Soma {
    static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        System.out.println("Soma da diagonal: " + soma);
    }
}
