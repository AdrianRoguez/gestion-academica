package es.ies.puerto;

import java.util.Objects;

public class Examen {
    private String fecha;
    private Materia materia;

    public Examen() {
        this.fecha = "";
        this.materia = null;
    }

    public Examen(String fecha, Materia materia) {
        this.fecha = fecha;
        this.materia = materia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String programar() {
        return "Examen programado para " + fecha;
    }

    @Override
    public String toString() {
        return "Examen{" + "fecha='" + fecha + '\'' + ", materia=" + materia + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Examen examen = (Examen) obj;
        return Objects.equals(fecha, examen.fecha) && Objects.equals(materia, examen.materia);
    }
}
