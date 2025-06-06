package ups.edu.ec.poo.Ej1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

        Asignatura matematicas = new Asignatura("Matematicas");
        Asignatura lengua = new Asignatura("Lengua");
        Asignatura fisica = new Asignatura("Fisica");

        Estudiante juan = new Estudiante("Juan", "Perez", 1234567890, new ArrayList<>());
        juan.agregarCalificacion(matematicas, 8.5);
        juan.agregarCalificacion(fisica, 7.0);

        Estudiante maria = new Estudiante("Maria", "Lopez", 987654321, new ArrayList<>());
        maria.agregarCalificacion(lengua, 9.2);

        Estudiante[] estudiantes = { juan, maria };

        for (Estudiante estudiante : estudiantes) {
            System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
            System.out.println("Cédula: " + estudiante.getCedula());
            for (Calificacion calificacion : estudiante.getCalificaciones()) {
                System.out.println("  " + calificacion.getAsignatura().getNombre() + ": " + calificacion.getNota());
            }
            System.out.println();
        }
    }
}
