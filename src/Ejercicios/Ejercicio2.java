package Ejercicios;

import Uitls.Escaner;

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.println(existeCaracter(Escaner.getString("Introduce una frase para comparar")));


    }

    public static boolean existeCaracter(String text){
       final String cadena = "\\|@#~€¬!»· $%&/()=";
       int cadenaNum = cadena.length();
       boolean siExiste = false;
       int i=0;;
       do{
           int j = 0;
            do {
                if (cadena.charAt(i)==text.charAt(j)){
                    siExiste = true;
                }
                j++;
            }while(!siExiste && j<text.length());
           i++;
       }while(!siExiste && i<cadenaNum);
    return siExiste;
    }


}
