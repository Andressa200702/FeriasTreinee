//Crie uma matriz 2x2 e mostre ela

import java.util.Arrays;

public class Math {
     public static void main(String[] args) {

         int[][] matriz = {
                 {1, 2},
                 {3, 4}
         };

         for (int i = 0; i < 2; i++) {
             for (int j = 0; j < 2; j++) {
                 System.out.print(matriz[i][j] + " ");
             }
             System.out.println();
         }
     }
}
