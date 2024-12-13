package es.ies.puerto;

import java.util.Objects;

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante() {
        super();
        this.matricula = "";
    }

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String estudiar() {
        return "Estoy estudiando.";
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", matricula='" + matricula + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Estudiante that = (Estudiante) obj;
        return edad == that.edad && Objects.equals(nombre, that.nombre) && Objects.equals(matricula, that.matricula);
    }
}