package ups.edu.ec.poo.Ej2;

import java.awt.*;
import java.awt.event.*;

public class Ejercicio2 extends Frame {
    TextField cedulaField, nombreField, apellidoField;

    public Ejercicio2() {
        setTitle("Ejercicio 2");
        setSize(400, 250);
        setLayout(new BorderLayout());

        Panel panelSuperior = new Panel(new FlowLayout());
        panelSuperior.add(new Button("Agregar"));
        panelSuperior.add(new Button("Modificar"));
        panelSuperior.add(new Button("Eliminar"));
        add(panelSuperior, BorderLayout.NORTH);

        Panel panelCentral = new Panel(new GridLayout(4, 2));

        panelCentral.add(new Label("Cédula:"));
        cedulaField = new TextField();
        panelCentral.add(cedulaField);

        panelCentral.add(new Label("Nombre:"));
        nombreField = new TextField();
        panelCentral.add(nombreField);

        panelCentral.add(new Label("Apellido:"));
        apellidoField = new TextField();
        panelCentral.add(apellidoField);

        Button guardarBtn = new Button("Guardar");
        guardarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cedula = cedulaField.getText();
                String nombre = nombreField.getText();
                String apellido = apellidoField.getText();

                System.out.println("Guardado:");
                System.out.println("Cédula: " + cedula);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
            }
        });

        Button cancelar = new Button("Cancelar");

        panelCentral.add(guardarBtn);
        panelCentral.add(cancelar);

        add(panelCentral, BorderLayout.CENTER);

        Panel panelInferior = new Panel();
        add(panelInferior, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}