/*
 * Ejercicio 20 | Tema 5.java
 * 
Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * <= menor o igual que
 * >= mayor o igual que
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej20 {
	
	public static void main (String[] args) {
		
		String caracter;
		int altura =1;
		int espaciosInternos = 0;
		
		System.out.print("Introduzca la altura de la pirámide:");
		int alturaIntroducida =Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduzca el carácter de relleno:");
		caracter =System.console().readLine();
		
		int huecos=alturaIntroducida-1;
			System.out.println();
		while (altura<alturaIntroducida){
		// inserta espacios delante y altura
			for (int i=1;i<=huecos;i++){
				System.out.print(" ");
			}
			// pinta la línea
			System.out.print(caracter);
			for (int i=1;i<espaciosInternos ;i++){
				System.out.print(" ");
			}
			if (altura>1){
				System.out.print(caracter);
				}
			System.out.println();
			altura++;
			huecos--;
			espaciosInternos += 2;
			}//termina el While
			
			//pinto la base de la piramide
			for (int i =1; i < altura*2; i++) {
				System.out.print(caracter);
			}
	}
}

