package mx.com.develop.operaciones;

import java.util.Scanner;
import mx.com.develop.academia.Alumno;

public class Operaciones {

    static String[] arreglo = new String[4];

    public static void menu() {
        Scanner ent = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Dame una opc");
            opc = ent.nextInt();
            switch (opc) {
                case 1:
                    agregar();
                    break;
                case 2:
                    borrar();
                    break;
                case 3:
                    consultar();
                    break;
                case 4:
                    solicitar();
                    break;
                default:
                    System.out.println("Opc invalido");
            }
        } while (opc != 5);
    }

    public static void agregar() {
        Alumno alumno = new Alumno("Gustavo", "Gonzalez", "Avila", "tu corazon #no me quiere ", "1234");
        arreglo[0] = alumno.nombres;
        arreglo[1] = alumno.apelllidoP;
        arreglo[2] = alumno.apelllidoM;
        arreglo[3] = alumno.matricula;
    }
    public static void borrar() {

    }

    public static void consultar() {
        for (String x : arreglo) {
            System.out.println(x);
        }
    }

    public static void solicitar() {

    }

}
