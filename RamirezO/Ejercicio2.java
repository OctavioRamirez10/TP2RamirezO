package RamirezO;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 2");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese fecha de nacimiento (formato yyyy-MM-dd)");
        String fechaNacUsuario = scanner.nextLine();
        System.out.println("La fecha ingresada es: " + fechaNacUsuario);

        LocalDate fecha = LocalDate.parse(fechaNacUsuario);

        LocalDate fechaActual = LocalDate.now();
        System.out.println("La fecha actual es: " + fechaActual);

        Period edad = Period.between(fecha, fechaActual);

        System.out.println(
                "Han pasado " + edad.getYears() + " años, "
                        + edad.getMonths() + " meses, "
                        + edad.getDays() + "dias");

        int diasVividos = edad.getYears() * 365 + edad.getMonths() * 30 + edad.getDays();

        System.out.println("Has vivido aproximadamente " + diasVividos + " dias");

        scanner.close();

    }

}
