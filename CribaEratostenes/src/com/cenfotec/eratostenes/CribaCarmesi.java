package com.cenfotec.eratostenes;

public class CribaCarmesi extends EratostenesFundamental {

	private boolean[] siNoHayPrimo;
	private int dimension;
	
	public CribaCarmesi() {
		super();
	}

	@Override
	public void iniciaCriba() {
		
		dimension = super.getTope() + 1;
		
		siNoHayPrimo = new boolean[dimension];
		for (int i = 0; i < dimension; i++) 
			
			siNoHayPrimo[i] = true;
		
		siNoHayPrimo[0] = siNoHayPrimo[1] = false;
	}

	@Override
	public void cuentaCriba() {
		
		int i, j;
		for (i = 2; i < dimension; i++)
			
			if(siNoHayPrimo[i])
				
				for (j = 2 * i; j < dimension; j += i)
					
					siNoHayPrimo[j] = false;

	}

	@Override
	public int[] getNumerosPrimos() {
		
		int[] primos = new int[getCantidadPrimos()];
		
		for (int i = 0, j = 0; i < dimension; i++)
			
			if (siNoHayPrimo[i])
				
				primos[j++] = i;
			
		return primos;
	}
	
	private int getCantidadPrimos() {
		
		int cuenta = 0;
		for (int i = 0; i < dimension; i++) 
			
			if (siNoHayPrimo[i])
				
				cuenta++;
		
		return cuenta;
	}
	
	public boolean[] getSiNoHayPrimo() {
		return siNoHayPrimo;
	}

	public int getDimension() {
		return dimension;
	}

}
