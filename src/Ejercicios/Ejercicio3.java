package Ejercicios;

import Uitls.Escaner;

public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println(factorialResultado(Escaner.getInt("Inserta un numero")));
    }


    public static int factorial(int num) {

        if (num == 0) return 0;
        else {
            int i = 1, resultado = 1;
            do {
                resultado *= i;
                i++;
            } while (i <= num);

            return resultado;
        }
    }


    public static String factorialResultado(int num) {
        int i = 0;
        String salida = "";
        do {
            salida += "el factorial del numero " + i + " es: " + factorial(i) + "\n";
            i++;
        } while (i <= num);
        return salida;
    }
}
