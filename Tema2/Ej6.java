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


public class Ej6 {
	
	public static void main (String[] args) {
    
    
    double BaImp = 600.00f; 
    
    
    System.out.printf(" Base Imponible  %-8.2f\n ",BaImp);
    System.out.printf("IVA ➟➟➟➟➟➟➟➟➟➟  %-8.2f\n ",(BaImp* 0.21));
    System.out.println("-------------------------");
    System.out.printf(" Total ➟➟➟➟➟➟➟➟➟ %-8.2f\n",(BaImp * 1.21));
	}
}

