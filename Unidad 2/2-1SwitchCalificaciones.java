package pkg2.pkg1.pkgswitch.calificaciones;
import java.io.*;
import java.util.Scanner;
public class SwitchCalificaciones {

    public static void main(String[] args) {
        //DEFINIR VARIABLES
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        //DATOS ENTRADA
            System.out.println("Introdusca la calificacion: ");
            calificacion = entrada.nextInt();
            
            //PROCESO (OPERACION MATEMATICA)
            
            //DATOS SALIDA
            switch(calificacion){
                case 0:
                    System.out.println("MUY MAL");
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("INSUFICIENTE");
                    break;
                case 6:
                    System.out.println("SUFICIENTE");
                    break;
                case 7:
                case 8:
                    System.out.println("BIEN");
                    break;
                case 9:
                    System.out.println("NOTABLE");
                    break;
                case 10:
                    System.out.println("SOBRESALIENTE");
                    break;
                default:
                    System.out.println("ERROR DE CALIFICACION");
                    break;
            }
      
          


    }
    
}
