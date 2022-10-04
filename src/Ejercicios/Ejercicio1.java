package Ejercicios;

public class Ejercicio1 {

    public static void main(String[] args) {

        primeros100Primos();

    }

    public static void primeros100Primos(){

        for (int i = 2 ; i <=100 ; i++){
            if (esPrimo(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean esPrimo(int num){

        boolean primo = true;
        int i = 2;

        do{
            if (num%i==0){
                primo=false;
            }
            i++;
        } while(primo && i!=num);
        return primo;
    }
}
