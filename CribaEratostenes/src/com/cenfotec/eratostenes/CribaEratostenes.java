package com.cenfotec.eratostenes;

public class CribaEratostenes {

	public static int[] generaCriba
	(int tope, EratostenesFundamental eratostenes) {

		if (tope < 2)	return new int[0];
		else {
			
			eratostenes.recibetope(tope);
			eratostenes.iniciaCriba();
			eratostenes.cuentaCriba();
			
			return eratostenes.getNumerosPrimos();
		}
	}
}
