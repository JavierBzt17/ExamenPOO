package ups.edu.ec.poo.Ej1;

import java.util.ArrayList;
import java.util.List;
public class Estudiante {
    private String nombre;
    private String apellido;
    private int cedula;
    private List<Calificacion> calificaciones;

    public Estudiante(String nombre, String apellido, int cedula, List<Calificacion> calificaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void agregarCalificacion(Asignatura asignatura, double nota) {
        Calificacion calificacion = new Calificacion(asignatura, nota);
        calificaciones.add(calificacion);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula=" + cedula +
                ", calificaciones=" + calificaciones +
                '}';
    }
}