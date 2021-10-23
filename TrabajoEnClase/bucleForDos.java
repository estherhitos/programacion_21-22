/*
 * /*
 * bucleFor.java
 * 
for (expresion1 ; expresion2 ; expresion3) {
sentencias
}
Justo al principio se ejecuta expresion1 y normalmente se usa para inicializar una
variable. El bucle se repite mientras se cumple expresion2 y en cada iteración del bucle
se ejecuta expresion3 , que suele ser el incremento o decremento de una variable. Con
un ejemplo se verá mucho más claro.
 * 
 */




public class bucleForDos {
	
	public static void main (String[] args) {
		int nVeces;
		
		System.out.print("Indique cuántas veces quiere que repita:");
		nVeces=Integer.parseInt(System.console().readLine());
		
		for (int i=1;i>=nVeces;i++)//resta de uno en uno hasta el 5
		System.out.print("hola"+1);			//en este caso la variable centinela cuenta hacia atras
																								//pero en pantalla el conteo se obtiene hacia adelante
		
		
	}
}

