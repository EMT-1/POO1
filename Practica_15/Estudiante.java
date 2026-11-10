import java.io.Serializable;

public class Estudiante implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private int edad;
    private double promedio;
    private String sexo;

    public Estudiante(String nombre, int edad, double promedio, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getSexo() {
        return sexo;
    }
}
