import java.util.Scanner;

public class Ejm {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        int[] frecuencia = new int[6];

        Scanner sc = new Scanner(System.in);

        int total = numeros.length;
        for (int i = 0; i < total; i++) {
            System.out.print("Ingrese un entero entre 1 y 6: ");
            numeros[i] = sc.nextInt();

            while (numeros[i] < 1 || numeros[i] > 6) {
                System.out.println("Numero incorrecto, digite uno valido: ");
                numeros[i] = sc.nextInt();
            }

        }

        int lastFrec = frecuencia.length;
        int k = 0;

        for (int i = 0; i < lastFrec; i++) {
            int ocurrencia = 0;
            k = i + 1;
            for (int j = 0; j < total; j++) {
                if (k == numeros[j]) {
                    ocurrencia++;
                }
            }
            frecuencia[i] = ocurrencia;
        }

        for (int i = 0; i < lastFrec; i++) {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j < frecuencia[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

