package mx.com.develop.academia;

public class Alumno {
    
    public String nombres;
    public String apelllidoP;
    public String apelllidoM;
    public String direccion;
    public String matricula;

    public Alumno(String nombres, String apelllidoP, String apelllidoM, String direccion, String matricula) {
        this.nombres = nombres;
        this.apelllidoP = apelllidoP;
        this.apelllidoM = apelllidoM;
        this.direccion = direccion;
        this.matricula = matricula;
    }

    public Alumno() {
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", apelllidoP=" + apelllidoP + ", apelllidoM=" + apelllidoM + ", direccion=" + direccion + ", matricula=" + matricula + '}';
    }
    
    
    
}
