/*
 * Ejercicio 17 | Tema 5.java
 * 
Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej17 {
	
	public static void main (String[] args) {
		
		int n=0;
		int suma=0;
		
		do {
      System.out.print("Porfabor introdce un número entero positivo: ");
      n = Integer.parseInt(System.console().readLine());
      
      if(n<0){
				System.out.println("El número introducido no es positivo");
				}
				
				}while(n<0);
				for ( int i = n; i< n + 100; i++){
					suma = suma+i;
				}
				System.out.println("La suma de 100 con el numero "+n+" es: "+suma);
		}
	}


