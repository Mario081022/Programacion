package pkg2.pkg3menu;
import caseswitch.CaseSwitch;
import java.util.Scanner;
import javaapplication4.JavaApplication4;
import switchcajero.SwitchCajero;
public class Main {
//VARIABLES PARA EL SELECTOR DE PROGRAMAS
    public static Scanner entrada = new Scanner(System.in);
    public static int Op;
    public static void main(String[] args) {
        //Ejecucion del menu
Menu();
    }
    //Ejecucion de los programas externos
public static void Pro1 (){
CaseSwitch obj = new CaseSwitch ();    
    obj.Compra();
    obj.ProcesoCase();
}   
public static void Pro2 (){
JavaApplication4 obj2 = new JavaApplication4();    
    obj2.Calificaciones();
    
   
}   
public static void Pro3(){
SwitchCajero obj3 = new SwitchCajero();    
obj3.Bucle();

}
////Menu para ejecutar programas///////////////////
public static void Menu()
{
//Variable Bucle C
    int c=1;
//MENU   
while(c==1){
  System.out.println("¿Que Programa deseas usar?");   
    System.out.println(" Para el Descuento coloca 1"); 
        System.out.println(" Para el Calificador coloca 2");
              System.out.println(" Para el Banco coloca 3");
                System.out.println(" Para salir colocar 4");
 
Op=entrada.nextInt();
//Proceso de OP

switch (Op){
    case 1:
{
    Pro1();
    break;
}
    case 2:
{
    Pro2();
     break;
}
    case 3:
{
    Pro3();
     break;
}
    case 4:
{
  c++;
        System.out.println(" Vuelva pronto");
         break;
}
}}    

    
}
}
