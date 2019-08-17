package com.gustavo.academia;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.gustavo.controlscolar.Asistencia;
import com.gustavo.controlscolar.Evaluable;
import com.gustavo.persona.Persona;

public class Alumno extends Persona implements Evaluable,Asistencia {

	private String matricula;

	private static Scanner ent = new Scanner(System.in);

	public Alumno() {

	}
	
	

	@Override
	public int calificacion() {
		// Metodo de la interface Evaluable
		return 0;
	}


	@Override
	public void asistirAClase() {
		// Metodo de la interface asistencia
		
	}



	public Alumno(String nombres) {
		this(nombres, JOptionPane.showInputDialog("ApellidoP"));
		
		setNombres(nombres);

	}

	public Alumno(String nombres, String ApellidoP) {
		this(nombres, ApellidoP, JOptionPane.showInputDialog("ApellidoM"));

		setApelllidoP(ApellidoP);

	}

	public Alumno(String nombres, String ApellidoP, String ApellidoM) {
		this(nombres, ApellidoP, ApellidoM, JOptionPane.showInputDialog("Curp"));
		setApelllidoM(ApellidoM);
	}

	public Alumno(String nombres, String ApellidoP, String ApellidoM, String curp) {
		this(nombres, ApellidoP, ApellidoM, ApellidoM, JOptionPane.showInputDialog("Dirección"));
		setCurp(curp);

	}

	public Alumno(String nombres, String ApellidoP, String ApellidoM, String curp, String direccion) {
		this(nombres, ApellidoP, ApellidoM, ApellidoM, direccion, JOptionPane.showInputDialog("Matricula"));
		setDireccion(direccion);

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