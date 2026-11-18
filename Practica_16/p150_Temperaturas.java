package Practica_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p150_Temperaturas extends JFrame {

    private JTextField txtFahrenheit, txtCentigrados;
    private JRadioButton rbCentigrados, rbFahrenheit;
    private ButtonGroup grupo;

    public p150_Temperaturas() {
        setTitle("Convertir Temperaturas");
        setSize(420, 240);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Fila 0 - Fahrenheit
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Fahrenheit:", SwingConstants.RIGHT), gbc);
        gbc.gridx = 1;
        txtFahrenheit = new JTextField(15);
        panel.add(txtFahrenheit, gbc);

        // Fila 1 - Centígrados
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Centígrados:", SwingConstants.RIGHT), gbc);
        gbc.gridx = 1;
        txtCentigrados = new JTextField(15);
        panel.add(txtCentigrados, gbc);

        // Fila 2 - Botones de radio
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 1;
        rbCentigrados = new JRadioButton("Calcular Centígrados", true);
        panel.add(rbCentigrados, gbc);
        gbc.gridx = 1;
        rbFahrenheit = new JRadioButton("Calcular Fahrenheit");
        panel.add(rbFahrenheit, gbc);

        grupo = new ButtonGroup();
        grupo.add(rbCentigrados);
        grupo.add(rbFahrenheit);

        // Fila 3 - Botones
        JButton btnCalcular = new JButton("Calcular");
        JButton btnSalir = new JButton("Salir");
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 1;
        panel.add(btnCalcular, gbc);
        gbc.gridx = 1;
        panel.add(btnSalir, gbc);

        add(panel);

        // Acción Calcular
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        // Acción Salir
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void calcular() {
        try {
            if (rbCentigrados.isSelected()) {
                // Fahrenheit -> Centígrados
                double f = Double.parseDouble(txtFahrenheit.getText());
                double c = (f - 32) * 5.0 / 9.0;
                txtCentigrados.setText(String.format("%.2f", c));
            } else {
                // Centígrados -> Fahrenheit
                double c = Double.parseDouble(txtCentigrados.getText());
                double f = (c * 9.0 / 5.0) + 32;
                txtFahrenheit.setText(String.format("%.2f", f));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese un valor numérico válido",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new p150_Temperaturas().setVisible(true);
            }
        });
    }
}