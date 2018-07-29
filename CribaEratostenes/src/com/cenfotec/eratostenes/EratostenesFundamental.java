package com.cenfotec.eratostenes;

public abstract class EratostenesFundamental {

	private int tope;
	
	public EratostenesFundamental() {
		this.tope = 0;
	}
	
	public void recibetope(final int tope) {
		this.tope = tope;
	}
	
	public int getTope() {
		return tope;
	}

	
	public abstract void iniciaCriba();
	
	/* hook method */
	public void cuentaCriba() {
		
	}
	
	public abstract int[] getNumerosPrimos();

	
	
}
