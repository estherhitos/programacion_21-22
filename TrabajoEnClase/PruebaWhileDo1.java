/*
 * PruebaWhile.java
 * 
 * Copyright 2021 esther <esther@esther-VirtualBox>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class PruebaWhileDo1 {
	public static void main(String[] args) {
		System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
		System.out.println("Para terminar, introduzca un número negativo.");
		
		int numeroIntroducido ;
		int cuentaNumeros = 0;
		int suma = 0;
		
		 do {
			numeroIntroducido = Integer.parseInt(System.console().readLine());
			cuentaNumeros++; // Incrementa en uno la variable
			suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
		
		}while (numeroIntroducido >= 0);
		System.out.println("Has introducido " + cuentaNumeros  + " números positivos.");
		System.out.println("La suma total de ellos es " + suma) ;
	}
}

