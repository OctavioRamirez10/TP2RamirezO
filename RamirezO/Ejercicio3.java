package RamirezO;

import java.time.Duration;
import java.time.LocalTime;

public class Ejercicio3 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 3");
        System.out.println();

        LocalTime horaInicio = LocalTime.of(07, 0, 0);
        LocalTime horaFinal = LocalTime.of(15, 0, 0);

        Duration duracion = Duration.between(horaInicio, horaFinal);

        System.out.println("La jornada dura " + duracion.toMinutes() + " minutos");
    }

}
