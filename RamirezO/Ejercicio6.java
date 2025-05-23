package RamirezO;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 6");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la fecha de tu nacimiento (formato yyyy-MM-dd)");
        String fecha = scanner.nextLine();

        scanner.close();

        LocalDate fechaNac = LocalDate.parse(fecha);

        LocalDate fechaActual = LocalDate.now();

        LocalDate fechaCumple = LocalDate.of(fechaActual.getYear(), fechaNac.getMonth(), fechaNac.getDayOfMonth());

        if (fechaCumple.isBefore(fechaActual) || fechaCumple.isEqual(fechaActual)) {
            fechaCumple = fechaCumple.plusYears(1);
        }

        long diasFaltantes = fechaActual.until(fechaCumple, ChronoUnit.DAYS);

        System.out.println("Faltan " + diasFaltantes + " dias");

    }

}
