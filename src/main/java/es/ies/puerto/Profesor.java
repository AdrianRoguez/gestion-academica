package es.ies.puerto;

import java.util.Objects;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor() {
        super();
        this.especialidad = "";
    }

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String enseñar() {
        return "Estoy enseñando " + especialidad + ".";
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", especialidad='" + especialidad + '\''
                + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Profesor profesor = (Profesor) obj;
        return edad == profesor.edad && Objects.equals(nombre, profesor.nombre)
                && Objects.equals(especialidad, profesor.especialidad);
    }
}