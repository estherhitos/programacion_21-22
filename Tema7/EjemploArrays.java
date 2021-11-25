/*
 * EjemploArrays.java | Tema 7
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


public class EjemploArrays {
	
	public static void main (String[] args) {
		
		int[] n; // se define n como un array de enteros
		n = new int[4]; // se reserva espacio para 4 enteros
		
		n[0]= 26;
		n[1]= -30;
		n[2]= 0;
		n[3]= 100;
		
		System.out.print("Los valores del array n son los siguientes: ");
		System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
		
		int suma = n[0] + n[3];
		System.out.println("\nEl primer elemento del array más el último suman " + suma);
		
	}
}

