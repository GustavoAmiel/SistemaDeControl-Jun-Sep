package com.gustavo.operaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gustavo.academia.Alumno;

import java.util.Arrays;

public class Operacion {

	static Scanner datos = new Scanner(System.in);
	static List<String> lista = new ArrayList<String>();
	static List<Alumno> listaAlumno = new ArrayList<Alumno>();// creamos el objeto lista

	public static void main(String args, String... gus) {
		System.out.println("Hola " + gus);
		for (String string : gus) {
			System.out.println(string);
		}
	}

	private String dato1;

	public Operacion() { // Constructor
		main("Jose", new String[] { "Karen", "Juan", "Daniel" });

	}

	public String getDato1() {
		return dato1;
	}

	public void setDato1(String dato1) {
		this.dato1 = dato1;
	}

	public static void menu() { // Metodo concreto
		int variableMenu = 0;

		do {
			System.out.println("Que es lo que desas hacer: \n " + "1)Agregar \n" + "2)Buscar " + "3)Imprimir ");
			variableMenu = datos.nextInt();
			switch (variableMenu) {
			case 1:
				System.out.println("Cuantos deseas agregar");
				int var1 = datos.nextInt();
				// agregar(var1);
				break;
			case 2:
				System.out.println("Cuantos deseas agregar");
				String var2 = datos.next();
				buscar(var2);

				break;
			case 3:
				imprimirValores();
				break;

			default:
				break;
			}
		} while (variableMenu <= 3);

	}

	public static List agregar(int var) {

		for (int i = 0; i < var; i++) {
			System.out.println("Cuantos deseas agregar");
			String nombre = datos.next();
			lista.add(nombre);

		}
		return lista;

	}

	/*
	 * public static List agregar(int var1) { //mx.com.develop.academia.Alumno
	 * alumno;
	 * 
	 * 
	 * 
	 * for (int i = 0; i < var1; i++) { Alumno alumno = new Alumno();//creamos el
	 * objeto alumno alumno.setNombres(nombres); alumno.setApelllidoP(apelllidoP);
	 * alumno.setApelllidoM(apelllidoM); listaAlumno.add(alumno);
	 * 
	 * } return listaAlumno;
	 * 
	 * 
	 * }
	 */

	public static int buscar(int var) {
		if (lista.contains(var)) {
			System.out.println("El valor si esta en la lista: " + var);
			return var;
		} else {
			System.out.println("El valor no esta en la lista");
		}
		return var;

	}

	public static String buscar(String var) {
		if (lista.contains(var)) {
			System.out.println("El valor si esta en la lista: " + var);
			return var;
		} else {
			System.out.println("El valor no esta en la lista");
		}
		return var;

	}

	public static void imprimirValores() {

		if (lista.isEmpty()) {
			System.out.println("Nuesta lista esta");

		} else {
			for (String string : lista) {
				System.out.println(string);
			}

		}
	}

	/*
	 * @Override public String toString() { return "Operacion [dato1=" + dato1 +
	 * "]"; }
	 */

}
