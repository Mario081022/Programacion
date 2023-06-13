package determinaretapas;
import java.util.Scanner;
public class DeterminarEtapas {
    public static void main(String[] args) {
 //Delaracion de variables
        int edad;
        Scanner norma =new Scanner(System.in);
        //entrada de datos
        System.out.println("Edad a calcular");
        edad=norma.nextInt();
        System.out.println(Col (edad));
        //Salida
    }
    public static String Col (int masuco)
    {
        //Salida de datos
        if (masuco<=0){
        return "No existe edades menores a 0";        
        }else if(masuco<=5){
        return "Infante";
        } if(masuco<=18){
         return "Niño";
        }else if (masuco>=18){
         return "Adulto";
        }
        
        return "default";
    }
}
    


