package Actividad_27;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class p147_AreaTrianguloGUI extends JFrame implements ActionListener {

    private JTextField txtBase, txtAltura;
    private JLabel lblResultado;
    private JButton btnCalcular, btnSalir;

    public p147_AreaTrianguloGUI() {
        txtBase = new JTextField();
        txtAltura = new JTextField();
        lblResultado = new JLabel("—");
        btnCalcular = new JButton("Calcular");
        btnSalir = new JButton("Salir");

        setLayout(new BorderLayout(10, 10));

        JPanel campos = new JPanel(new GridLayout(3, 2, 8, 8));
        campos.add(new JLabel("Base:"));   campos.add(txtBase);
        campos.add(new JLabel("Altura:")); campos.add(txtAltura);
        campos.add(new JLabel("Área:"));   campos.add(lblResultado);

        JPanel botones = new JPanel(new FlowLayout());
        botones.add(btnCalcular);
        botones.add(btnSalir);

        add(campos, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);

        setTitle("Área de un triángulo");
        setSize(320, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            dispose();
        } else if (e.getSource() == btnCalcular) {
            calcular();
        }
    }

    private void calcular() {
        try {
            double base   = Double.parseDouble(txtBase.getText().trim());
            double altura = Double.parseDouble(txtAltura.getText().trim());
            double area   = getArea(base, altura);
            lblResultado.setText(String.format("%.2f", area));
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this,
                "Escribe base y altura numéricas, finitas y positivas.",
                "Datos inválidos", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double getArea(double base, double altura) {
        if (base <= 0 || altura <= 0 || !Double.isFinite(base) || !Double.isFinite(altura)) {
            throw new IllegalArgumentException();
        }
        return (base * altura) / 2.0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new p147_AreaTrianguloGUI().setVisible(true));
    }
}