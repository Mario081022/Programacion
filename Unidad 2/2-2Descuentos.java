package pkg2.pkg2.descuentos;
import java.util.Scanner;
public class Descuentos {

    public static void main(String[] args) {
    //Definicion de Variables.
       double PV =1000;
       Scanner entrada = new Scanner(System.in);
       int descuento=0;
       double preciofinal;
       String codPromocion;
       
       //Entrada de Datos
       System.out.println("Su total de compra es: $"+ PV + "\n");
       System.out.println("Tines un codigo de descuento Escribelo:");
       codPromocion = entrada.next();
        codPromocion = codPromocion.toUpperCase();
        
        //Proceso.
        
        //Salida de Datos
        
        switch(codPromocion){
            case  "PlatiOctubre":
              descuento= 20;
              break;
            case  "SilverOctubre":  
              descuento= 50;
              break;
            case "BronceOctubre":
              descuento = 35;
              break;
            case "OroOctubre":
               descuento =75;
               break;
            default:
               System.out.println("Has introsucido un codigo no valido:"); 
        }
        preciofinal = PV -descuento;
    
    }
    
}
