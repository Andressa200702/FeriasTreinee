// Sistema de login simples
import java.util.Scanner;

public class Syn {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Digite seu EMAIL:");
        String email= entrada.nextLine();

        System.out.println("Digite sua senha:");
        String senha = entrada.nextLine();

        for (int i=0; i < 3; i++){
            System.out.println("Confirma seu email:");
            String emailLogin=entrada.nextLine();

            System.out.println("Confirma sua senha:");
            String senhaLogin=entrada.nextLine();

            if (emailLogin.equals(email) && senhaLogin.equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                System.out.println("Dados incorretos. Tentativa " + i + " de 3");
            }
        }
    }
}
