package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int numero;
	
		System.out.println("Ingrese un numero entero: ");
		numero = entrada.nextInt();
		
		IFactorial calculador = new FactorialAlt2Impl();
				
		System.out.println(calculador.calcular(numero));
				
		FactorialAlt1Impl calculadorFactorialCasteado = (FactorialAlt1Impl) calculador;
		
		System.out.println(calculadorFactorialCasteado.descripcion());
		
		entrada.close();
	}

}
