/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package picoyplaca;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class PicoYPlaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int ultimoDigitoPlaca;
        String dia;

        ultimoDigitoPlaca = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el último dígito de la placa"));
        dia = JOptionPane.showInputDialog("Ingrese el día");

        if (dia.trim().equals("S") || dia.trim().equals("D")) {
            JOptionPane.showMessageDialog(null, "No hay pico y placa");
        } else {
            if (dia.trim().equals("L") && (ultimoDigitoPlaca == 9 || ultimoDigitoPlaca == 0)) {
                JOptionPane.showMessageDialog(null, "Tiene Pico y Placa");
            }

            if (dia.trim().equals("M") && (ultimoDigitoPlaca == 1 || ultimoDigitoPlaca == 2)) {
                JOptionPane.showMessageDialog(null, "Tiene Pico y Placa");
            }
            if (dia.trim().equals("X") && (ultimoDigitoPlaca == 3 || ultimoDigitoPlaca == 4)) {
                JOptionPane.showMessageDialog(null, "Tiene Pico y Placa");
            }
            if (dia.trim().equals("J") && (ultimoDigitoPlaca == 5 || ultimoDigitoPlaca == 6)) {
                JOptionPane.showMessageDialog(null, "Tiene Pico y Placa");
            }
            if (dia.trim().equals("V") && (ultimoDigitoPlaca == 7 || ultimoDigitoPlaca == 8)) {
                JOptionPane.showMessageDialog(null, "Tiene Pico y Placa");
            }
        }
    }

}
