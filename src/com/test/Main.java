package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		int numero;
	
		System.out.println("Ingrese un numero entero: ");
		numero = entrada.nextInt();
		
		IFactorialFactory fabFactorial = new FactorialFactoryImpl();
		
		IFactorial calculador = fabFactorial.create();
		
		System.out.println(calculador.calcular(numero));
				
		entrada.close();
	}

}
