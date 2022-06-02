package Ciclos;

import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int numero, numant = 0, suma = 0;
        do {
            System.out.println("Ingrese el numero");
            numero = tc.nextInt();
            if (numero > numant & numero >= 0) {
                suma = suma + numero;
                numant = numero;
            } else {
                System.out.println(numero + " no es mayor que " + numant + ", digite un nuevo valor.");
            }
        } while (numero >= 0);
        System.out.println("La sumatoria de los números ingresados validos son: " + suma);
    }

}
