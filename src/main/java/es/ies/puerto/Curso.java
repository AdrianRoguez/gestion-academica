package es.ies.puerto;

import java.util.List;
import java.util.Objects;

public class Curso {
    private String nombre;
    private String codigo;
    private List<Estudiante> estudiantes;

    public Curso() {
        this.nombre = "";
        this.codigo = "";
        this.estudiantes = null;
    }

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
    }

    public List<Estudiante> listarEstudiantes() {
        return null;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre='" + nombre + '\'' + ", codigo='" + codigo + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Curso curso = (Curso) obj;
        return Objects.equals(nombre, curso.nombre) && Objects.equals(codigo, curso.codigo);
    }
}
