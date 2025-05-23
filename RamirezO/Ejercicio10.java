package RamirezO;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 10");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        String[] nombresAlumno = new String[10];
        double[] notas = new double[10];
        String[] resultado = new String[10];

        for (int i = 0; i < nombresAlumno.length; i++) {
            System.out.println("Ingrese nombre del " + (i + 1) + "° alumno");
            nombresAlumno[i] = scanner.nextLine();
        }

        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.println("ingrese la " + (i + 1) + "° nota (entre 0 y 10)");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Error: debe ingresar una nota entre 0 y 10");
                }

            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                resultado[i] = "Suspenso";
            } else if (notas[i] < 7) {
                resultado[i] = "Bien";
            } else if (notas[i] < 9) {
                resultado[i] = "Notable";
            } else {
                resultado[i] = "Sobresaliente";
            }
        }

        for (int i = 0; i < nombresAlumno.length; i++) {
            System.out.println((i + 1) + "° Alumno: " + nombresAlumno[i] +
                    " | Nota: " + notas[i] +
                    " | Resultado: " + resultado[i]);
        }

        scanner.close();

    }

}
