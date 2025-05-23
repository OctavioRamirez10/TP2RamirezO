package RamirezO;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ejercicio5 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 5");
        System.out.println();

        LocalDateTime fechaHoraExamen = LocalDateTime.of(2025, 6, 26, 19, 20, 0);

        LocalDateTime fechaHoraActual = LocalDateTime.now();

        LocalDate fechaExamen = LocalDate.of(2025, 6, 26);

        LocalDate fechaActual = LocalDate.now();

        int contadorClases = 0;

        long dias = ChronoUnit.DAYS.between(fechaHoraActual, fechaHoraExamen);
        long horas = ChronoUnit.HOURS.between(fechaHoraActual, fechaHoraExamen) % 24;
        long minutos = ChronoUnit.MINUTES.between(fechaHoraActual, fechaHoraExamen) % 60;

        System.out.println(
                "Faltan " + dias + " dias " + horas + " horas " + " y " + minutos + " minutos " + "para el examen");

        for (LocalDate fecha = fechaActual; !fecha.isAfter(fechaExamen); fecha = fecha.plusDays(1)) {
            if (fecha.getDayOfWeek() == DayOfWeek.THURSDAY) {
                contadorClases++;
            }
        }

        System.out.println("Quedan " + contadorClases + " Clases de programacion");

    }

}
