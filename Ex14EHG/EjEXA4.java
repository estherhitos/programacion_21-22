/*
 * EjEXA4.java
 * 
Escribe un programa que traduzca cada uno de los números de un PIN de varios dígitos introducido
por el usuario a su correspondiente palabra
 * 
 * 
 */


public class EjEXA4 {
	
	public static void main (String[] args) {
		
		int pin;
		String resultado="";
		
		
		System.out.print("Introduzca el PIN: ");
		pin = Integer.parseInt(System.console().readLine());
		
		if (pin==0){
			resultado = "cero";
		}else{
			while (pin==0){
				int ultimaCifra =pin%10;
				pin= pin/10;
				
				String ultimacifraconletra="";
				
				switch (ultimaCifra){
				case 0:
				ultimacifraconletra="cero";
				break;
				case 1:
				ultimacifraconletra="uno";
				break;
				case 2:
				ultimacifraconletra="dos";
				break;
				case 3:
				ultimacifraconletra="tres";
				break;
				case 4:
				ultimacifraconletra="cuatro";
				break;
				case 5:
				ultimacifraconletra="cinco";
				break;
				case 6:
				ultimacifraconletra="seis";
				break;
				case 7:
				ultimacifraconletra="siete";
				break;
				case 8:
				ultimacifraconletra="ocho";
				break;
				case 9:
				ultimacifraconletra="nueve";
				break;
				}
				resultado = ultimacifraconletra+" "+resultado ;
			}
		}
		System.out.println(resultado);
	}
}

