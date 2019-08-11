package com.gustavo.academia;

import com.gustavo.persona.Persona;

public class Profesor extends Persona{
	
	private String nEmpleado;
	
	
	
	public Profesor(String nombres, String ApellidoP) {
		this(nombres, ApellidoP, "");
		//ApellidoP =ent.nextLine();
		super.setNombres(ApellidoP);

	}

	public Profesor(String nombres, String ApellidoP, String ApellidoM) {
		this(nombres,ApellidoP, ApellidoM, "");
		super.setNombres(ApellidoM);
	}

	public Profesor(String nombres, String ApellidoP, String ApellidoM, String curp) {
		this(nombres,ApellidoP, ApellidoM, ApellidoM,"");
		super.setNombres(curp);

	}
	public Profesor(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion) {
		this(nombres,ApellidoP, ApellidoM, ApellidoM, direccion,"");
		super.setNombres(direccion);

	}
	public Profesor(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion, String nEmpleado) {
		//super(nombres,ApellidoP,ApellidoM,curp,direccion);
		this.nEmpleado = nEmpleado;

	}
	



	public Profesor() {
		super();
	}
	

	/**
	 * @return the nEmpleado
	 */
	public String getnEmpleado() {
		return nEmpleado;
	}

	/**
	 * @param nEmpleado the nEmpleado to set
	 */
	public void setnEmpleado(String nEmpleado) {
		this.nEmpleado = nEmpleado;
	}


	
	

}
