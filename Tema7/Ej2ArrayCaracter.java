/*
 * Ej2ArrayCaracter.java | Tema 7
 * 
Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados?
 * 
 * 
 */


public class Ej2ArrayCaracter {
	
	public static void main (String[] args) {
		
			char[] simbolo; 
			simbolo = new char[10];
		
			simbolo[0]='a';
			simbolo[1]='b';
			simbolo[4]='@';
			simbolo[6]=' ';
			simbolo[7]='+';
			simbolo[8]='#';


			for (int i = 0; i < 10; i++) {
				System.out.println("simbolo[" + i + "]: " + simbolo[i]);
				}
// Se puede observar que los valores del array se inicializan automáticamente
// al simbolo vacío
	}
}

