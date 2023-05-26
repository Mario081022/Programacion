import java.util.Scanner;

public class FunMayorDeEdad {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingresa tu edad");
         int edad = entrada.nextInt();
         
       String result = verificarEdad(edad);
            System.out.println(result);   
    }
    public static String verificarEdad(int edad) {
        if (edad>=18) {
            
            return "eres mayor de edad";
        }
        else{
            
            return "eres menor de edad";
        }
    }
}
