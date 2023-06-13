package temperaturas;
import java.util.Scanner;
public class Temperaturas {
public static double Temperaturas;
    
    public static void main(String[] args) {
        Temperatura();
  IF();
    }
    public static void Temperatura()
      {
      // Climas
     System.out.println("Clima");
     Scanner sc = new Scanner(System.in);
      Temperaturas = sc.nextInt();      
      }
    public static void IF()
    {
                if (Temperaturas <=0 && Temperaturas <=10 )
        {
             System.out.println("Clima Frio Extremo");
        }
                if (Temperaturas >=11 && Temperaturas <=15 )
        {
             System.out.println("Clima Frio");
        }   
                if (Temperaturas >=16 && Temperaturas <=25 )
        {
             System.out.println("Clima templado");
        }
                if (Temperaturas >=26 && Temperaturas <=30 )
        {
             System.out.println("Calor");
        }
                if (Temperaturas >31 )
        {
             System.out.println("Calor INSOPORTABLE");
        }                
    }
    }
    

