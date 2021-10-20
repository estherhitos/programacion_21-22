/*
 * ejercicio7 | tema3.java
 * 
 * Escribe un programa que calcule el total de una factura 
 * a partir de la base imponible.
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
 *  

 * @Authora: Esther Hitos Garcia
 * 
 */


public class Ej7 {
	
	public static void main (String[] args) {
		
			double iva = 1.21;//21% de iva
		//double iva = 1.10;//10% de iva
		//double iva = 1.04;//4% de iva
		System.out.println("Total de una factura a partir de la Base Imponible");
		System.out.println("Porfabor introduzca el total sin iva");
		float baseImp=Float.parseFloat(System.console().readLine());
		
		System.out.printf(" Base Imponible  %-8.2f\n ",baseImp);
    System.out.printf("IVA ➟➟➟➟➟➟➟➟➟➟  %-8.2f\n ",(baseImp* 0.21));
    System.out.println("-------------------------");
    System.out.printf(" Total ➟➟➟➟➟➟➟➟➟ %-8.2f\n",(baseImp * iva));
		
	}
}

