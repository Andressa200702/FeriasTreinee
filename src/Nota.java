import java.util.Arrays;
import java.util.Scanner;

public class Nota {
    public static void main (String[] args){
        Scanner bb= new Scanner(System.in);
        int [] notas = new int[5];
        notas[0] = 6;
        notas[1] = 9;
        notas[2] = 3;
        notas[3] = 1;
        notas[4] = 8;

        System.out.println(Arrays.toString(notas));

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
