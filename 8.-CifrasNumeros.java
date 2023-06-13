package cifrasnumeros;
import java.util.Scanner;
public class CifrasNumeros {
static int N=0;
    public static void main(String[] args) {
        Pedir();
    Numeros();
    
    }
    public static void Pedir(){
        //Pedir
  
        Scanner Guardado =new Scanner(System.in);
            System.out.println("Numero:");
                   N = Guardado.nextInt();
    }
    public static void Numeros(){
           // Los if
        if (N<10 && N>=1)
             {
            System.out.println("una cifra");  
             }
            if (N<100 && N>=10)
            {
            System.out.println("dos cifras");  
            }
             if (N<1000 && N>=100)
            {
            System.out.println("tres cifras");  
            }
             if (N<10000 && N>=1000)
            {
            System.out.println("cuatro cifras");  
             }
              if (N<100000 && N>=10000)
            {
            System.out.println("cinco cifras");  
             }
            if (N>=100000)
            {
            System.out.println("Muchas cifras");  
             }
            if (N<0)
            {
            System.out.println("No hay negativos en bang sing se");  
             }
}
    }
    

