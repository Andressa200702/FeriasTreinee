//Peça 5 notas e calcule a média.

import java.util.Scanner;

public class Dic {
     public static void main(String[] args) {
         Scanner cc=new Scanner(System.in);
         double soma = 0;

         for (int i=0;i<5;i++){
             System.out.println("Digite a nota: ");
             double nota=cc.nextDouble();
             soma += nota;
         }

         double media = soma / 5;
         System.out.println("A média é: " + media);
    }
}
