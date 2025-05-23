package RamirezO;

import java.util.Scanner;

public class Ejercicio8 {
    public static double kmCarreteraNormal(int litros) {
        double resultado = (litros * 100.0) / 8.0;
        return resultado;
    }

    public static double kmCarreteraDes(int litros) {
        double resultado = (litros * 100) / 9.2;
        return resultado;
    }

    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 8");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese litros de combustibles en el deposito");

        int litros = scanner.nextInt();

        double kmC = kmCarreteraNormal(litros);

        double kmD = kmCarreteraDes(litros);

        System.out.println("Con " + litros + " litros podes recorrer " + kmC + " kilometros en carreteras normales");
        System.out.println("Con " + litros + " litros podes recorrer " + kmD + " kilometros en carreteras desiguales");

        scanner.close();

    }

}
