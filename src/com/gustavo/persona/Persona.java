package com.gustavo.persona;

public abstract class Persona extends Humano {
	private String curp;
	private String nombres;
	private String apelllidoP;
	private String apelllidoM;
	private String direccion;

	public Persona(String nombres, String apelllidoP, String apelllidoM, String curp, String direccion) {
		super();
		this.curp = curp;
		this.nombres = nombres;
		this.apelllidoP = apelllidoP;
		this.apelllidoM = apelllidoM;
		this.direccion = direccion;
	}

	public Persona() {

	}
	public abstract String getCurp();
	public abstract void setCurp(String curp);
	public abstract String getNombres();
	public abstract void setNombres(String nombres);
	public abstract String getApelllidoP();
	public abstract void setApelllidoP(String apelllidoP);
	public abstract String getApelllidoM();
	public abstract void setApelllidoM(String apelllidoM);
	public abstract String getDireccion();
	public abstract void setDireccion(String direccion);
	
	
	
	

	/**
	 * @return the curp
	 */
	/*
	 * public String getCurp() { return curp; }
	 * 
	 *//**
		 * @param curp the curp to set
		 */
	/*
	 * public void setCurp(String curp) { this.curp = curp; }
	 * 
	 *//**
		 * @return the nombres
		 */
	/*
	 * public String getNombres() { return nombres; }
	 * 
	 *//**
		 * @param nombres the nombres to set
		 */
	/*
	 * public void setNombres(String nombres) { this.nombres = nombres; }
	 * 
	 *//**
		 * @return the apelllidoP
		 */
	/*
	 * public String getApelllidoP() { return apelllidoP; }
	 * 
	 *//**
		 * @param apelllidoP the apelllidoP to set
		 */
	/*
	 * public void setApelllidoP(String apelllidoP) { this.apelllidoP = apelllidoP;
	 * }
	 * 
	 *//**
		 * @return the apelllidoM
		 */
	/*
	 * public String getApelllidoM() { return apelllidoM; }
	 * 
	 *//**
		 * @param apelllidoM the apelllidoM to set
		 */
	/*
	 * public void setApelllidoM(String apelllidoM) { this.apelllidoM = apelllidoM;
	 * }
	 * 
	 *//**
		 * @return the direccion
		 */

	

	/*
	 * public String getDireccion() { return direccion; }
	 * 
	 *//**
		 * @param direccion the direccion to set
		 *//*
			 * public void setDireccion(String direccion) { this.direccion = direccion; }
			 */

	@Override
	public String toString() {
		return "Persona [curp=" + curp + ", nombres=" + nombres + ", apelllidoP=" + apelllidoP + ", apelllidoM="
				+ apelllidoM + ", direccion=" + direccion + "]";
	}

}
