package Ejercicios;

import Uitls.Escaner;

public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println(factorialSuma(Escaner.getInt("Introduce un numero")));
    }

    public static int factorialSuma(int num){

        int i = 0, j, factorial = 1,resultado=0;
        do {
            resultado += Ejercicio3.factorial(i);
            i++;
        }while(i<=num);

        return resultado;
    }

}
