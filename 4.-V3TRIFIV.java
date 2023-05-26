package v3trifiv;
import java.util.Scanner;
public class V3TRIFIV {
    
    public static void main(String[] args){
            
    //DECLARACION DE VARIABLES
    Scanner entrada =new Scanner(System.in);
    
    int numero;
    
    //ENTRADA DE DATOS
    System.out.println("ingresa un numero: ");
    numero = entrada.nextInt();
    //SALIDA DE DATOS
    System.out.println(retornarMultiplo1(numero));
    
    }
    public static String retornarMultiplo1(int num){
        
    //DECLARACION DE VARIABLES
    
    int mult3;
    int mult5;
    //PROCESAMIENTO DE DATOS
    mult3=num %3;
    mult5=num %5;
    //SALIDA DE DATOS
    if(mult3 ==0 && mult5== 0){
        return "TRIFIV";
    }else if (mult3==0){
        return "Tri";
    }else if (mult5==0){
        return "fiv";
    }
      
    return "Ningun caso";
                
    }
    
        
    }
