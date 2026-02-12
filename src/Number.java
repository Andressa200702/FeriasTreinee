import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int n1,n2;

        System.out.println("Insira o primeiro número:");
        n1=cs.nextInt();

        System.out.println("Insira o segundo número:");
        n2=cs.nextInt();

        if (n1 > n2){
            System.out.println("O primeiro número é maior.");
        } else if (n1==n2) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("O segundo número é maior.");
        }
    }
}
