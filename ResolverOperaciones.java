package com.mycompany.precendetesoperadores6;
import java.text.DecimalFormat;
import java.util.Scanner;
public class ResolverOperaciones {
    static double a=0,b=0,c=0,d=0,f=0,g=0,h=0,j=0,e=0,m=0,n=0,q=0,r=0,s=0,x=0,y=0,p=0;
    public static void main(String[] args) {
    PEDIR();
           calculaoperaciones();         
    }
    public static void PEDIR(){
                // Entrada de datos
  
           Scanner Guardado =new Scanner(System.in);
            System.out.println("Dame Numeros:");
            System.out.println("A:"); 
                a = Guardado.nextInt();
            System.out.println("B:");  
                b = Guardado.nextInt();
            System.out.println("C:"); 
                c = Guardado.nextInt();
            System.out.println("D:");
                d = Guardado.nextInt();
            System.out.println("E:"); 
                e = Guardado.nextInt();
           System.out.println("F:");  
                f = Guardado.nextInt();
            System.out.println("G:");  
                g = Guardado.nextInt();
            System.out.println("H:");
                h = Guardado.nextInt();
            System.out.println("J:"); 
                j = Guardado.nextInt();
            System.out.println("X:"); 
                x = Guardado.nextInt();
            System.out.println("Y:"); 
                y = Guardado.nextInt();
            System.out.println("M:"); 
                m = Guardado.nextInt();    
            System.out.println("N:"); 
                n = Guardado.nextInt();  
            System.out.println("S:"); 
                s = Guardado.nextInt(); 
            System.out.println("P:"); 
                p = Guardado.nextInt(); 
            System.out.println("Q:"); 
                q = Guardado.nextInt(); 
            System.out.println("R:"); 
                r = Guardado.nextInt(); 
    }
    public static void calculaoperaciones(){
DecimalFormat df = new DecimalFormat (".00");
 //*********  IncisoA 
double calcularA;
calcularA=((3/2)+(4/3));
System.out.println("a)"+ df.format(calcularA));

//********** IncisoB
double calcularB;
calcularB= ((1/(x-5)) - ((3*x*y)/4));
System.out.println("b)"+ df.format(calcularB));

//********** IncisoC
double calcularC;
calcularC= ((1/2)+7);
System.out.println("c)"+ calcularC);

//********** IncisoD
double calcularD;
calcularD=((1/2)+7);
System.out.println("d)"+ df.format(calcularD));

//********** IncisoE
double calcularE;
calcularE= (((Math.pow(a,2)) / (b-c))+ (d-e) / (f-((g*h) / j)));
System.out.println("e)"+ df.format(calcularE));
//********** IncisoF
double calcularF; 
calcularF= ((m/n)+p);
System.out.println("f)"+ df.format(calcularF));
//********** IncisoG
double calcularG; 
calcularG= (m+(n/(p-q)));
System.out.println("g)"+ df.format(calcularG));

//********** IncisoH
double calcularH; 
calcularH = (((Math.pow(a,2))/(Math.pow(b,2)))+ ((Math.pow(c,2))/(Math.pow(d,2))));
System.out.println("H)"+ df.format(calcularH));

//********** Incisoi
double calcularI; 
calcularI = ((m+(n/p))/(q-(r/s)));
System.out.println("i)"+ df.format(calcularI));

//********** IncisoJ
double calcularJ; 
calcularJ = (((3*a)+b)/((c-(d+(5*e)))/(f+(g/(2*h)))));
System.out.println("j)"+ df.format(calcularJ));

//********** IncisoK
double calcularK; 
calcularK = (((Math.pow(a,2))+(2*a*b)+(Math.pow(b,2)))/((1/(Math.pow(x,2)))+2));
System.out.println("k)"+ df.format(calcularK));


}
}
    
