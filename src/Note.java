//Sistema de Notas
//pedir 4 notas, calcular média e dizer se aprovado ou reprovado

import java.util.Scanner;

public class Note {
    public static void main() {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota: ");
            double nota = entrada.nextDouble();

            soma += nota;
        }

        double media = soma / 4;
        System.out.println("A média é: " + media);

        if (media >= 7.0) {
            System.out.println("PARABÉNS!! Foi aprovado.");
        } else if (media > 4.0 && media < 6.9) {
            System.out.println("Tem a chance de fazer recuperação.");
        } else {
            System.out.println("Reprovado!!:(");
        }
        {
        }
    }
}
