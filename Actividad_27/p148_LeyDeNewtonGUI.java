package Actividad_27;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class p148_LeyDeNewtonGUI extends JFrame implements ActionListener {

    private JRadioButton rbtFuerza, rbtMasa, rbtAceleracion;
    private JTextField txtFuerza, txtMasa, txtAceleracion;
    private JButton btnCalcular, btnSalir;
    private ButtonGroup grupo;

    public p148_LeyDeNewtonGUI() {
        
        rbtFuerza      = new JRadioButton("Fuerza", true);
        rbtMasa        = new JRadioButton("Masa");
        rbtAceleracion = new JRadioButton("Aceleración");

        txtFuerza      = new JTextField();
        txtMasa        = new JTextField();
        txtAceleracion = new JTextField();

        btnCalcular = new JButton("Calcular");
        btnSalir    = new JButton("Salir");

        grupo = new ButtonGroup();
        JPanel opciones = new JPanel(new FlowLayout());
        for (JRadioButton radio : new JRadioButton[]{rbtFuerza, rbtMasa, rbtAceleracion}) {
            grupo.add(radio);
            opciones.add(radio);
            radio.addActionListener(this);
        }

        JPanel campos = new JPanel(new GridLayout(3, 2, 8, 8));
        campos.add(new JLabel("Fuerza (N):"));       campos.add(txtFuerza);
        campos.add(new JLabel("Masa (kg):"));        campos.add(txtMasa);
        campos.add(new JLabel("Aceleración (m/s²):")); campos.add(txtAceleracion);

        JPanel botones = new JPanel(new FlowLayout());
        botones.add(btnCalcular);
        botones.add(btnSalir);

        setLayout(new BorderLayout(10, 10));
        add(opciones, BorderLayout.NORTH);
        add(campos,   BorderLayout.CENTER);
        add(botones,  BorderLayout.SOUTH);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);

        actualizarCampos();

        setTitle("Fuerza, Masa y Aceleración (F = m·a)");
        setSize(380, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void actualizarCampos() {
        txtFuerza.setEditable(!rbtFuerza.isSelected());
        txtMasa.setEditable(!rbtMasa.isSelected());
        txtAceleracion.setEditable(!rbtAceleracion.isSelected());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            dispose();
        } else if (e.getSource() == btnCalcular) {
            calcular();
        } else {
            actualizarCampos();
        }
    }

    private void calcular() {
        try {
            if (rbtFuerza.isSelected()) {
                double m = Double.parseDouble(txtMasa.getText().trim());
                double a = Double.parseDouble(txtAceleracion.getText().trim());
                double f = operar(0, m, a);           // F = m · a
                txtFuerza.setText(String.format("%.2f", f));

            } else if (rbtMasa.isSelected()) {
                double f = Double.parseDouble(txtFuerza.getText().trim());
                double a = Double.parseDouble(txtAceleracion.getText().trim());
                double m = operar(1, f, a);           // m = F / a
                txtMasa.setText(String.format("%.2f", m));

            } else if (rbtAceleracion.isSelected()) {
                double f = Double.parseDouble(txtFuerza.getText().trim());
                double m = Double.parseDouble(txtMasa.getText().trim());
                double a = operar(2, f, m);           // a = F / m
                txtAceleracion.setText(String.format("%.2f", a));
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this,
                "Escribe valores numéricos, finitos y positivos.",
                "Datos inválidos", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * operar(0, m, a) -> F = m · a
     * operar(1, f, a) -> m = f / a
     * operar(2, f, m) -> a = f / m
     */
    private double operar(int opcion, double x, double y) {
        if (!Double.isFinite(x) || !Double.isFinite(y) || x <= 0 || y <= 0) {
            throw new IllegalArgumentException();
        }
        switch (opcion) {
            case 0: return x * y;     // Fuerza
            case 1: return x / y;     // Masa
            case 2: return x / y;     // Aceleración
            default: throw new IllegalArgumentException("Opción inválida");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new p148_LeyDeNewtonGUI().setVisible(true));
    }
}