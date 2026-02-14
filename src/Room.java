//tabuada do número que o usuário escolher
import java.util.Scanner;

public class Room {
    public static void main() {
        Scanner cc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = cc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println("Tabuada do " + num + " x " + i + " = " + (num * i));
        }
    }
}
