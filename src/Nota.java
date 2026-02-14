//Some todos os elementos do Array
import java.util.Arrays;

public class Nota {
    public static void main (String[] args){
        int [] notas = new int[5];
        notas[0] = 6;
        notas[1] = 9;
        notas[2] = 3;
        notas[3] = 1;
        notas[4] = 8;

        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        System.out.println("A soma dos elementos é: " + soma);
    }
}
