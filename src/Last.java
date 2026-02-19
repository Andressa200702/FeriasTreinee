//Crie um array com 5 números
//Mostre o maior número do array.
public class Last {
     public static void main(String[] args) {
         int numeros [] = new int[5];
         numeros= new int[]{7,23,31,13,5};

         int maior = numeros[0];

         for (int i = 1; i < numeros.length; i++) {
             if (numeros[i] > maior) {
                 maior = numeros[i];
             }
         }

         System.out.println("Maior número: " + maior);

    }
}
