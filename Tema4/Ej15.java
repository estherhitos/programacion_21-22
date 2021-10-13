/*
 * Ej15 | Tema 4
 * 
 * Escribe un programa que pinte una pirámide rellena con 
 * uncarácter introducido por 
 * teclado que podrá ser una letra, 
 * un número o un símbolo como *, +, -, $, &,etc. 
 * El programa debe permitir al usuario mediante
 * un menú elegir si el vértice de la 
 * pirámide está apuntando hacia arriba, 
 * hacia abajo, hacia la izquierda o hacia la derecha.
 * 
 * @Authora: Esther Hitos Garcia
 */


public class Ej15 {
	
	public static void main (String[] args) {
	System.out.println("Este programa pinta una pirámide.");
	System.out.print("Introduzca un carácter de relleno: ");
	String a = System.console().readLine();
	
	System.out.println("1.dibujar caracteres hacia izquierda.");
	System.out.println("2.dibujar caracteres hacia abajo.");
	System.out.println("3.dibujar caracteres hacia derecha.");
	System.out.println("4.dibujar caracteres hacia arriba.");
	int dibujo = Integer.parseInt(System.console().readLine());
	
	
		switch(dibujo){
			
				case 1 :
				System.out.println("   "+a);
				System.out.println("  "+a+a);
				System.out.println(" "+a+a+a);
				System.out.println("  "+a+a);
				System.out.println("   "+a);
				break;
				
				case 2 :
				System.out.println(" "+a+a+a+a+a);
				System.out.println("  "+a+a+a);
				System.out.println("   "+a);
				break;
				
				case 3 :
				System.out.println(" "+a);
				System.out.println(" "+a+a);
				System.out.println(" "+a+a+a);
				System.out.println(" "+a+a);
				System.out.println(" "+a);
				break;
				
				case 4 :
				System.out.println("   "+a);
				System.out.println("  "+a+a+a);
				System.out.println(" "+a+a+a+a+a);
				break;
				}
			
	}
}

