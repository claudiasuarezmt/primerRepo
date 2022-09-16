
package reto_1;

import java.util.Scanner;
import static reto_1.Reto_1.calcular_IMC;
import static reto_1.Reto_1.calcular_riesgo;
import static reto_1.Reto_1.validacion;

public class reto1 {
    
    private final Scanner sc = new Scanner(System.in);
    
    public String read(){
    return sc.nextLine();
    }
     public static String calcular_riesgo (double imc, int edad){

    String riesgo = "";
    if (imc < 22 && edad < 45)riesgo ="Bajo";
    if (imc < 22 && edad >= 45)riesgo ="Medio";
    if (imc >= 22 && edad < 45)riesgo ="Medio";
    if (imc >= 22 && edad >= 45)riesgo ="Alto";
    return riesgo;


}
      public static double calcular_IMC(double masa, double altura){
   double IMC = masa / (altura * altura);
   return IMC;
   
   }
      
      public static boolean validacion (double masa, double altura, int edad){
   if ((masa < 0 || masa > 150)||(altura < 0.1 || altura > 2.5) || (edad < 0 || edad > 110)){
   return false;
   }
   return true;
}
  public void run(){
  String [] entradas = sc.nextLine().split(" ");
    
    double masa = Double.parseDouble(entradas[0]);
    double altura = Double.parseDouble(entradas[1]);
    int edad = Integer.parseInt(entradas[2]);
    
    double imc = calcular_IMC (masa, altura);
    
    if (validacion(masa, altura, edad)){
    System.out.println(String.format("%.1f", imc)+ " "+ calcular_riesgo(imc,edad));
    }
    else {
    System.out.println("ERROR");
    }
  }    
}


