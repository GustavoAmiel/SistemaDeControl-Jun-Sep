package com.gustavo.academia;

import com.gustavo.persona.Persona;

public final class Profesor extends Persona{

	private String nEmpleado;

	public Profesor(String nombres, String ApellidoP) {
		this(nombres, ApellidoP, "");
		// ApellidoP =ent.nextLine();
		setNombres(ApellidoP);

	}

	public Profesor(String nombres, String ApellidoP, String ApellidoM) {
		this(nombres, ApellidoP, ApellidoM, "");
		setNombres(ApellidoM);
	}

	public Profesor(String nombres, String ApellidoP, String ApellidoM, String curp) {
		this(nombres, ApellidoP, ApellidoM, ApellidoM, "");
		setNombres(curp);

	}

	public Profesor(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion) {
		this(nombres, ApellidoP, ApellidoM, ApellidoM, direccion, "");
		setNombres(direccion);

	}

	public Profesor(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion,
			String nEmpleado) {
		// super(nombres,ApellidoP,ApellidoM,curp,direccion);
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

	@Override
	public String getCurp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCurp(String curp) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getNombres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNombres(String nombres) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getApelllidoP() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setApelllidoP(String apelllidoP) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getApelllidoM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setApelllidoM(String apelllidoM) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDireccion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDireccion(String direccion) {
		// TODO Auto-generated method stub

	}

}
