package RamirezO;

import java.util.Scanner;

public class Ejercicio7 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 7");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        int numeroUsuario = scanner.nextInt();

        int filas = 5;

        for (int i = 0; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numeroUsuario);
            }
            System.out.println();

        }

        scanner.close();

    }

}
