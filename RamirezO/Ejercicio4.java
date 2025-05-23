package RamirezO;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio4 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 4");
        System.out.println();

        LocalDate fecha = LocalDate.of(2003, 8, 29);

        DayOfWeek dia = fecha.getDayOfWeek();

        System.out.println("El dia es " + dia);

    }

}
