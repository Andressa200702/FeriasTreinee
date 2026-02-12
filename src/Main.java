//Sistema de verificação de nota

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner cc = new Scanner(System.in);
            double num1, num2, media;

            for (int i = 0; i <= 3; i++) {

                System.out.println("Digite a primeira nota:");
                num1 = cc.nextDouble();

                System.out.println("Digite a segunda nota:");
                num2 = cc.nextDouble();

                media = (num1 + num2) / 2;

                System.out.printf("A média das nota é: %.1f\n", media);

                if (media >= 7.0) {
                    System.out.println("Parabéns!!Passou");
                } else if (media > 4.0 && media < 6.9) {
                    System.out.println("Vai fazer recuperação.");
                } else {
                    System.out.println("Reprovado!");
                }
            }
        }
    }