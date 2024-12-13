package es.ies.puerto;

import java.util.List;
import java.util.Objects;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca() {
        this.nombre = "";
        this.libros = null;
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void registrarLibro(Libro libro) {
    }

    public List<Libro> listarLibros() {
        return null;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre='" + nombre + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Biblioteca biblioteca = (Biblioteca) obj;
        return Objects.equals(nombre, biblioteca.nombre);
    }
}
