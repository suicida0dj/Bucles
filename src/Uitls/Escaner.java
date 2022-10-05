package Uitls;

import java.util.Scanner;

public class Escaner {


    public static String getString(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static char getChar(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine().charAt(0);
    }

    public static int getInt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (!sc.hasNextInt()) {
            System.out.println("Error. Tienes que introducir un numero");
            sc.next();
        }
        return sc.nextInt();
    }

    public static float getFloat(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (!sc.hasNextFloat()) {
            System.out.println("Error. Tienes que introducir un numero decimal");
            sc.next();
        }
        return sc.nextFloat();
    }
}

