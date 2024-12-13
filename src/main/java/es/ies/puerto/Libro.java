package es.ies.puerto;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;

    public Libro() {
        this.titulo = "";
        this.autor = "";
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String detalles() {
        return "Libro: " + titulo + " de " + autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Libro libro = (Libro) obj;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }
}
