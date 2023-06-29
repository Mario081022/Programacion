package doacumulador;

import java.util.Scanner;

public class DOACUMULADOR {

   public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int num,suma;
        suma=0;
        do{
            System.out.println("introduzca el numero: ");
            num = entrada.nextInt();
            suma= suma + num;
        }while(num!=0);
        
        System.out.println("La suma de todos es: "+ suma);
        
               
    }
    
}
