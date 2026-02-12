//Peça a idade e informe se é:
//menor de idade;
//maior de idade;
//se é idoso;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade= cc.nextInt();

        if (idade < 18){
            System.out.println("É de menor!");
        } else if (idade >= 60) {
            System.out.println("É idoso!");
        } else {
            System.out.println("É de maior!");
        }
    }
}
