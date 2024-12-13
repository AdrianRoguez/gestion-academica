package es.ies.puerto;

import java.util.Objects;

public class Materia {
    private String nombre;
    private String codigo;

    public Materia() {
        this.nombre = "";
        this.codigo = "";
    }

    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
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

    public String detalles() {
        return "Materia: " + nombre + " (Código: " + codigo + ")";
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre='" + nombre + '\'' + ", codigo='" + codigo + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Materia materia = (Materia) obj;
        return Objects.equals(nombre, materia.nombre) && Objects.equals(codigo, materia.codigo);
    }
}