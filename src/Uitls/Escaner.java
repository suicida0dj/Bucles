package Uitls;
import java.util.Scanner;
public class Escaner {


    public static String getString(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static int getInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
