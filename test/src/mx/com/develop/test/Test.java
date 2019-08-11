package mx.com.develop.test;

import java.util.Scanner;
import mx.com.develop.operaciones.Operaciones;

public class Test {

    public static void main(String[] gus) {
        Scanner ent = new Scanner(System.in);
        System.out.println("1) agregar" + "\n"
                + "2) borrar" + "\n"
                + "3) consultar" + "\n"
                + "4) solicitar" + "\n");
        int opc = ent.nextInt();
        
        Humano obj1 = new Humano();

        Operaciones.menu();

    }

}
