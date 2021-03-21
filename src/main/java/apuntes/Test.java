/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuntes;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Cris
 */
public class Test {

    public static void main(String[] args) {

        // Construimos la ventana
        //JFrame ventanaPrincipal = new JFrame("Aplicación");
        JFrame ventanaPrincipal = new JFrame("Cristina Jiménez");

        //Crear los paneles por separado
        MiPanel north = new MiPanel(Color.PINK);
        MiPanel south = new MiPanel(Color.PINK);
        MiPanel center = new MiPanel(Color.YELLOW);
        MiPanel west = new MiPanel(Color.BLUE);
        MiPanel east = new MiPanel(Color.GREEN);

        // Establecemos posición y tamaño
        //ventanaPrincipal.setBounds(250, 250, 800, 600);
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        // Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        // Acción por defecto al pulsar el botón de cierre 	 
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //CODIGO DEL EJERCICIO
        //-Hay veces que el color no funciona(después lo vuelves a ejecutar y 
        //vuelve a funcionar), preguntar si es normal el lunes.
        // La ventana no se puede redimensionar
        ventanaPrincipal.setResizable(false);

        // Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        // Añadimos los paneles en cada posición del BorderLayout
        // Añadir panel amarillo en la posición superior (NORTH)
        ventanaPrincipal.add(north, BorderLayout.NORTH);
        //ventanaPrincipal.add(new MiPanel(Color.yellow), BorderLayout.NORTH);

        // Añadir panel rojo en la posición inferior (SOUTH)
        ventanaPrincipal.add(south, BorderLayout.SOUTH);
        //ventanaPrincipal.add(new MiPanel(Color.red), BorderLayout.SOUTH);

        // Añadir panel gris en la posición central (CENTER)
        ventanaPrincipal.add(center, BorderLayout.CENTER);
        //ventanaPrincipal.add(new MiPanel(Color.gray), BorderLayout.CENTER);

        // Añadir panel verde en la posición izquierda (WEST)
        ventanaPrincipal.add(west, BorderLayout.WEST);
        //ventanaPrincipal.add(new MiPanel(Color.green), BorderLayout.WEST);

        // Añadir panel cián en la posición derecha (EAST)
        ventanaPrincipal.add(east, BorderLayout.EAST);
        //ventanaPrincipal.add(new MiPanel(Color.cyan), BorderLayout.EAST);

        //Cambiar el color del texto
        north.getEtiqueta().setText("Holi");
        south.getEtiqueta().setText("Adiós");
        center.getEtiqueta().setText("Soy el cuadrado del centro");
        west.getEtiqueta().setText("Soy el cuadrado del izquierda");
        east.getEtiqueta().setText("Soy el cuadrado de la derecha");
    }

}
