/*
 * Ejercicio 21 | Tema 5.java
 * 
Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * <= menor o igual que
 * >= mayor o igual que
 */


public class Ej21MediaNumerosIntro {
	
	public static void main (String[] args) {
		
		int numeroIntroducido;//guardara los numeros introducidos por el usuario
		int sumaimpares=0;// almacenara la suma de todos los numeros imapares introducidos
		float elemento=0;//sera el contador de indicara el numero de los numeros introducidos
		float elementoimpar=0;//sera el contador de indicara el numero de los numeros introducidos impares
		int sumapar=0;//almacenara la suma de todos los numeros pares introducidos
		
		
		do{
		System.out.println("Introduciendo números enteros : ");
		numeroIntroducido = Integer.parseInt(System.console().readLine());
	
			if (numeroIntroducido >= 0) {
					elemento++;
			if ((numeroIntroducido %2)==1) { //numero impar
					sumaimpares+= numeroIntroducido;
					elementoimpar++;
					}else{
						if (numeroIntroducido >= sumapar) 
							sumapar=numeroIntroducido;
						}
					}
				
			}	while (numeroIntroducido>=0);//solo queremos positivos y 0

				System.out.println("Ha introducido " + elemento + " números");
				System.out.println("La media de los impares es " + sumaimpares/elementoimpar);
				System.out.println("El máximo de los pares es " + sumapar);
			
	}
}


