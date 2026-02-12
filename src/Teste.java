//Fazer uma calculadora

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1=entrada.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2= entrada.nextDouble();

        System.out.println("Escolha uma das opções:");
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");

        int opção=entrada.nextInt();

        switch (opção) {
            case 1:
                System.out.println("A soma é: " + (num1 + num2));
                break;

            case 2:
                System.out.println("A subtração é: " + (num1 - num2));
                break;

            case 3:
                System.out.println("A multiplicação é: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("A divisão é: " + (num1 / num2));
                } else {
                    System.out.println("Não foi possível dividir");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
