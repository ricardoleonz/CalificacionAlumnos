package main;

import entidades.Mensajes;
import entidades.alumnos.Alumnos;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args) {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
        simbolo.setDecimalSeparator('.');
        simbolo.setGroupingSeparator(',');

        DecimalFormat formateador = new DecimalFormat("##.##", simbolo);


        Alumnos estudiante = new Alumnos();

        String seguimiento = JOptionPane.showInputDialog(null, Mensajes.MENSAJE_NOTA_SEGUIMIENTO.getMensaje());
        String parcial = JOptionPane.showInputDialog(null, Mensajes.MENSAJE_NOTA_PARCIAL.getMensaje());
        String examen = JOptionPane.showInputDialog(null, Mensajes.MENSAJE_NOTA_EXAMEN_FINAL.getMensaje());

        estudiante.setNotaSeguimiento(Double.parseDouble(seguimiento));
        estudiante.setNotaParcial(Double.parseDouble(parcial));
        estudiante.setNotaExamenFinal(Double.parseDouble(examen));

        if (estudiante.calcularNotaFinal() >= 4 && estudiante.calcularNotaFinal() <= 5) {
            JOptionPane.showMessageDialog(null, Mensajes.MENSAJE_RESULTADO.getMensaje() + formateador.format(estudiante.calcularNotaFinal()) + Mensajes.MENSAJE_CALIFICACION_4_5.getMensaje());
        } else if (estudiante.calcularNotaFinal() >= 3 && estudiante.calcularNotaFinal() <= 3.9) {
            JOptionPane.showMessageDialog(null, Mensajes.MENSAJE_RESULTADO.getMensaje() + formateador.format(estudiante.calcularNotaFinal()) + Mensajes.MENSAJE_CALIFICACION_3_39.getMensaje());
        } else if (estudiante.calcularNotaFinal() >= 2 && estudiante.calcularNotaFinal() <= 2.9) {
            JOptionPane.showMessageDialog(null, Mensajes.MENSAJE_RESULTADO.getMensaje() + formateador.format(estudiante.calcularNotaFinal()) + Mensajes.MENSAJE_CALIFICACION_2_29.getMensaje());
        } else if (estudiante.calcularNotaFinal() >= 1 && estudiante.calcularNotaFinal() <= 1.9) {
            JOptionPane.showMessageDialog(null, Mensajes.MENSAJE_RESULTADO.getMensaje() + formateador.format(estudiante.calcularNotaFinal()) + Mensajes.MENSAJE_CALIFICACION_1_19.getMensaje());
        } else if (estudiante.calcularNotaFinal() >= 0 && estudiante.calcularNotaFinal() <= 0.9) {
            JOptionPane.showMessageDialog(null, Mensajes.MENSAJE_RESULTADO.getMensaje() + formateador.format(estudiante.calcularNotaFinal()) + Mensajes.MENSAJE_CALIFICACION_0_09.getMensaje());
        }


    }
}
