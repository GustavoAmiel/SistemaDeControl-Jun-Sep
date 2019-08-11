package com.gustavo.persona;

public class Humano {
	// Propiedades
	private int pies;
	private int manos;
	private int cerebro;
	private int ojos;

	// constructores

	public Humano() {
		this.pies = 2;
		this.manos = 2;
		this.cerebro = 1;
		this.ojos = 2;
	}

	public Humano(int pies, int manos, int cerebro, int ojos) {
		this.pies = pies;
		this.manos = manos;
		this.cerebro = cerebro;
		this.ojos = ojos;
	}

	// Método para mostrar datos en general del humano
	public String datosHumano() {
		return "El humano tiene: " + pies + " pies" + ", " + manos + " manos" + ", " + cerebro + " cerebro" + " y "
				+ ojos + " ojos";
	}

	// Sets and Gets

	public int getPies() {
		return pies;
	}

	public void setPies(int pies) {
		this.pies = pies;
	}

	public int getManos() {
		return manos;
	}

	public void setManos(int manos) {
		this.manos = manos;
	}

	public int getCerebro() {
		return cerebro;
	}

	public void setCerebro(int cerebro) {
		this.cerebro = cerebro;
	}

	public int getOjos() {
		return ojos;
	}

	public void setOjos(int ojos) {
		this.ojos = ojos;
	}

}