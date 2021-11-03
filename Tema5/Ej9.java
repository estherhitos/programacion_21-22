/*
 * Ejercicio 9 | Tema 5.java
 * 
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice ( int o long ).
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 **** Dividiremos el número sucesivamente entre 10. En cada división tomaremos la parte entera y volvemos a dividir. 
 **** Este proceso se repite hasta que se obtenga un cero como cociente en la división.

 **** 1234 / 10 = 123
 **** 123 / 10 = 12
 **** 12 / 10 = 1
 **** 1 / 10 = 0
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej9 {
	
	public static void main (String[] args) {
		
		int n; 
		int cifras;
  
    
    
        System.out.print("Introduce un número entero: ");
        n= Integer.parseInt(System.console().readLine());
        
				cifras= 0;//esta variable es el contador de cifras
			
				 while(!(n==0) ){  //mientras a n le queden cifras
						n = n/10;  //le quitamos el último dígito
            cifras++;  //sumamos 1 al contador de cifras
           
        }    
           System.out.println("El número tiene " +cifras+ " cifras");
				  
		}
	


 }
