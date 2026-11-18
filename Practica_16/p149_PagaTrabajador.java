package Practica_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p149_PagaTrabajador extends JFrame {

    private JTextField txtHoras, txtPaga, txtTasa;
    private JTextField txtBruta, txtImpuesto, txtNeta;

    public p149_PagaTrabajador() {
        setTitle("Calcular Paga de Trabajador");
        setSize(380, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Panel con GridLayout de 7 filas x 2 columnas
        JPanel panel = new JPanel(new GridLayout(7, 2, 8, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Fila 0
        panel.add(new JLabel("Horas Trabajadas:", SwingConstants.RIGHT));
        txtHoras = new JTextField();
        panel.add(txtHoras);

        // Fila 1
        panel.add(new JLabel("Paga por Hora:", SwingConstants.RIGHT));
        txtPaga = new JTextField();
        panel.add(txtPaga);

        // Fila 2
        panel.add(new JLabel("Tasa de Impuestos (%):", SwingConstants.RIGHT));
        txtTasa = new JTextField();
        panel.add(txtTasa);

        // Fila 3 - Paga Bruta (solo lectura)
        panel.add(new JLabel("Paga Bruta:", SwingConstants.RIGHT));
        txtBruta = new JTextField();
        txtBruta.setEditable(false);
        panel.add(txtBruta);

        // Fila 4 - Impuesto (solo lectura)
        panel.add(new JLabel("Impuesto:", SwingConstants.RIGHT));
        txtImpuesto = new JTextField();
        txtImpuesto.setEditable(false);
        panel.add(txtImpuesto);

        // Fila 5 - Paga Neta (solo lectura)
        panel.add(new JLabel("Paga Neta:", SwingConstants.RIGHT));
        txtNeta = new JTextField();
        txtNeta.setEditable(false);
        panel.add(txtNeta);

        // Fila 6 - Botones
        JButton btnCalcular = new JButton("Calcular");
        JButton btnSalir = new JButton("Salir");
        panel.add(btnCalcular);
        panel.add(btnSalir);

        add(panel);

        // Acción del botón Calcular
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        // Acción del botón Salir
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void calcular() {
        try {
            double horas = Double.parseDouble(txtHoras.getText());
            double pagaHora = Double.parseDouble(txtPaga.getText());
            double tasa = Double.parseDouble(txtTasa.getText());

            double pagaBruta = horas * pagaHora;
            double impuesto = pagaBruta * (tasa / 100.0);
            double pagaNeta = pagaBruta - impuesto;

            txtBruta.setText(String.format("%.2f", pagaBruta));
            txtImpuesto.setText(String.format("%.2f", impuesto));
            txtNeta.setText(String.format("%.2f", pagaNeta));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese valores numéricos válidos",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new p149_PagaTrabajador().setVisible(true);
            }
        });
    }
}