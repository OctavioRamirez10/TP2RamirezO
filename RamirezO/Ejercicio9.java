package RamirezO;

import java.util.Scanner;

public class Ejercicio9 {
    public static void ejecutar() {
        System.out.println("Ingresaste al ejercicio 9");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int billetes20000 = 0;
        int billetes10000 = 0;
        int billetes1000 = 0;
        int billetes500 = 0;
        int billetes200 = 0;
        int billetes100 = 0;
        int billetes50 = 0;
        int billetes20 = 0;
        int billetes10 = 0;

        System.out.println("Ingresar monto de dinero");

        int monto = scanner.nextInt();

        scanner.close();

        while (monto >= 20000) {
            monto = monto - 20000;
            billetes20000++;
        }

        while (monto >= 10000) {
            monto = monto - 10000;
            billetes10000++;
        }
        while (monto >= 1000) {
            monto = monto - 1000;
            billetes1000++;
        }
        while (monto >= 500) {
            monto = monto - 500;
            billetes500++;
        }
        while (monto >= 200) {
            monto = monto - 200;
            billetes200++;
        }
        while (monto >= 100) {
            monto = monto - 100;
            billetes100++;
        }
        while (monto >= 50) {
            monto = monto - 50;
            billetes50++;
        }
        while (monto >= 20) {
            monto = monto - 20;
            billetes20++;
        }
        while (monto >= 10) {
            monto = monto - 10;
            billetes10++;
        }
        System.out.println("Billetes de $20000: " + billetes20000);
        System.out.println("Billetes de $10000: " + billetes10000);
        System.out.println("Billetes de $1000: " + billetes1000);
        System.out.println("Billetes de $500: " + billetes500);
        System.out.println("Billetes de $200: " + billetes200);
        System.out.println("Billetes de $100: " + billetes100);
        System.out.println("Billetes de $50: " + billetes50);
        System.out.println("Billetes de $20: " + billetes20);
        System.out.println("Billetes de $10: " + billetes10);

    }

}
