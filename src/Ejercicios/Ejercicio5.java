package Ejercicios;

import java.awt.font.FontRenderContext;

public class Ejercicio5 {

    public static void main(String[] args) {

        cadenaTexto();
    }

    public static void cadenaTexto() {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int h = 0; h < 10; h++) {
                        for (int l = 0; l < 10; l++) {
                            if (i == 0 && j == 0 && k == 0 && h == 0 && l == 0) {
                                System.out.println("XXXXX");
                            }else if(i == 3 && j == 3 && k == 3 && h == 3 && l == 3){
                                System.out.println("E-E-E-E-E");
                            }else if(i == 3 && j == 3 && k == 3 && h == 3){
                                System.out.println("E-E-E-E-"+l);
                            }else if(i == 3 && j == 3 && k == 3){
                                System.out.println("E-E-E-"+h+"-"+l);
                            }else if(i == 3 && j == 3){
                                System.out.println("E-E-"+k+"-"+h+"-"+l);
                            }else if(i == 3){
                                System.out.println("E-"+j+"-"+k+"-"+h+"-"+l);
                            }else if( h == 3 && l == 3){
                                System.out.println(i + "-" + j + "-" + k + "-E-E");
                            }else if(i == 3 && j == 3 && k == 3 && h == 3){
                                System.out.println("E-E-E-E-"+l);
                            }else if(i == 3 && j == 3 && k == 3){
                                System.out.println("E-E-E-"+h+"-"+l);
                            }else if(i == 3 && j == 3){
                                System.out.println("E-E-"+k+"-"+h+"-"+l);
                            }else if(i == 3){
                                System.out.println("E-"+j+"-"+k+"-"+h+"-"+l);
                            }else if(l == 3){
                                System.out.println(i + "-" + j + "-" + k + "-" + h + "-E");
                            }else if(h == 3){
                                System.out.println(i + "-" + j + "-" + k + "-E-" + l);
                            }else if(k == 3){
                                System.out.println(i + "-" + j + "-E-" + h + "-" + l);
                            }else if(j == 3){
                                System.out.println(i + "-E-" + k + "-" + h + "-" + l);

                            }else {
                                System.out.println(i + "-" + j + "-" + k + "-" + h + "-" + l);
                            }
                        }
                    }
                }
            }
        }

    }
}
