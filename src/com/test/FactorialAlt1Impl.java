package com.test;

public class FactorialAlt1Impl implements IFactorial{

	@Override
	public long calcular(int numero) {
		// TODO Auto-generated method stub
		int i;
		long acum = 1;
		
		for (i = 1; i <= numero; i++) {
			acum = acum * i;			
		}
		
		return acum;
	}
	
	public String descripcion() {
		return "lalala";
	}
	
}
