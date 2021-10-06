/*
 * Ej6|Tema2.java
 * 
 * Escribe un programa que calcule el total 
 * de una factura a partir de la base imponible (precio sin IVA). 
 * La base imponible estará almacenada en una variable.
 * 
 * 21% es un porcentaje de 100
 * Suma 100 + 21 = 121
 * Divide 121 entre 100 = 1,21
 * 
 * 4% es un porcentaje de 100
 * Suma 100 + 4= 104
 * Divide 104 entre 100 = 1,04
 * 
 * 10% es un porcentaje de 100
 * Suma 100 + 10 = 110
 * Divide 110 entre 100 = 1,10
 * 
 * Authora:Esther hitos Garcia
 */

 public class Ej6Segundo { // Clase principal
  public static void main(String[] args) {
    int IVA = 21;
    int baseImp = 100;
    int totalFac = ((baseImp*IVA/100)+baseImp);
    
    System.out.printf("El total sin IVA es: "+baseImp+".\n");
    System.out.printf("El total con IVA es: "+totalFac+".\n");
    
  }
}

