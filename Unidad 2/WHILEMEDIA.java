package whilemedia;

import java.util.Scanner;

public class WHILEMEDIA {

    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int num, suma, elementos;
       float media;
       
        System.out.println("introduce un numero: ");
        num = entrada.nextInt();
        
        suma=0;
        elementos=0;
        
        while(num>=0){
            suma+= num;
            elementos++;
            
            System.out.println("introduzca otro numero: ");
            num=entrada.nextInt();
            if (elementos == 1){
                System.out.println("No se puede hacer el promedio");
            }else{
                media= (float)suma/elementos;
                System.out.println("La media es de: " + media);
            }
        }
    }
    
}
