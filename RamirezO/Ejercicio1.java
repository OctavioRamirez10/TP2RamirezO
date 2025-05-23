package RamirezO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 1");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatear = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Ingrese la primera fecha y hora (formato yyyy-MM-dd HH:mm:ss)");

        String fechaHoraUsuario1 = scanner.nextLine();

        LocalDateTime fechaHoraMod1 = LocalDateTime.parse(fechaHoraUsuario1, formatear);

        System.out.println("Ingrese la segunda fecha y hora (formato yyyy-MM-dd HH:mm:ss)");

        String fechaHoraUsuario2 = scanner.nextLine();

        LocalDateTime fechaHoraMod2 = LocalDateTime.parse(fechaHoraUsuario2, formatear);

        System.out.println("Primera fecha ingresada: " + fechaHoraMod1.format(formatear));
        System.out.println("Segunda fecha ingresada: " + fechaHoraMod2.format(formatear));

        if (fechaHoraMod1.isAfter(fechaHoraMod2)) {
            System.out.println("La primera fecha es mayor");

        } else if (fechaHoraMod2.isAfter(fechaHoraMod1)) {
            System.out.println("La segunda fecha es mayor");

        }

        scanner.close();

    }

}
