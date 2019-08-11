package com.gustavo.academia;

import java.util.Scanner;

import com.gustavo.persona.Persona;

public class Alumno extends Persona {

	private String matricula;

	private static Scanner ent = new Scanner(System.in);

	public Alumno() {

	}

	public Alumno(String nombres) {
		this(nombres, ent.next());
		super.setNombres(nombres);

	}

	public Alumno(String nombres, String ApellidoP) {
		this(nombres, ApellidoP, ent.next());

		super.setApelllidoP(ApellidoP);

	}

	public Alumno(String nombres, String ApellidoP, String ApellidoM) {
		this(nombres, ApellidoP, ApellidoM, ent.next());
		super.setApelllidoM(ApellidoM);
	}

	public Alumno(String nombres, String ApellidoP, String ApellidoM, String curp) {
		this(nombres, ApellidoP, ApellidoM, ApellidoM, ent.next());
		super.setCurp(curp);

	}

	public Alumno(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion) {
		this(nombres, ApellidoP, ApellidoM, ApellidoM, direccion, ent.next());
		super.setDireccion(direccion);

	}

	public Alumno(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion, String matricula) {
		// super(nombres,ApellidoP,ApellidoM,curp,direccion);
		// super.setApelllidoP(apelllidoP);

		this.matricula = matricula;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", getCurp()=" + getCurp() + ", getNombres()=" + getNombres()
				+ ", getApelllidoP()=" + getApelllidoP() + ", getApelllidoM()=" + getApelllidoM() + ", getDireccion()="
				+ getDireccion() + "]";
	}

	/*
	 * private static final String tarjetaDeBanco;
	 * 
	 * 
	 * static { tarjetaDeBanco = "NFR"; }
	 * 
	 * public static void modificarTarjeta(int num1, int num2) { { num1 = num1+num2;
	 * } }
	 * 
	 * class AlumnoLatoso{ class AlumnoLatoso2{
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * public static String getTarjetadebanco() { return tarjetaDeBanco; }
	 */

}