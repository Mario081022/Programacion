package descdiasemana;
import java.util.Scanner;
public class DescDiaSemana {
public static int N;
public static double Dinero;
public static String fecha;
    
    public static void main(String[] args) {
        Pedir();
    IF();        
  } 
    public static void  Pedir ()
    {
    // Montos
     Scanner Guardado =new Scanner(System.in);
     System.out.println("Ingresa monto");
     N = Guardado.nextInt();
     // Fecha
     System.out.println("Ingresa Fecha");
     Scanner sc = new Scanner(System.in);
      fecha = sc.nextLine();
    }
    public static void IF()
    {
 if ("martes".equals(fecha) ||"jueves".equals(fecha) )
 {
   Dinero=(N*0.15);
    System.out.println("Hoy toca descuento de " + Dinero);
   Dinero=(N-Dinero);
   System.out.println("El total de la compra es " + Dinero);
 }
    }
    }
    

