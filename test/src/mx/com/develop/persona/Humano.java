
package mx.com.develop.persona;

public class Humano {
    int ojos;
    String genero;
    int edad;
    String colorDePiel;
    double peso;

    public Humano() {
        this.ojos = 2;
        this.genero = "f";
        this.edad = 0;
        this.colorDePiel = "";
        this.peso = 200;
        
    }

    public Humano(int ojos, String genero, int edad, String colorDePiel, double peso) {
        this.ojos = ojos;
        this.genero = genero;
        this.edad = edad;
        this.colorDePiel = colorDePiel;
        this.peso = peso;
    }
    
    
    
}
