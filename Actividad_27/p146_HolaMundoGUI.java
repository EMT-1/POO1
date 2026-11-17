package Actividad_27;

import javax.swing.*;
import java.awt.*;

public class p146_HolaMundoGUI extends JFrame{
    public p146_HolaMundoGUI() {
        super("Hola Mundo");
        setLayout(new FlowLayout());
        JLabel lblSaludo = new JLabel("Hola Mundo.");
        lblSaludo.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(lblSaludo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new p146_HolaMundoGUI().setVisible(true);
        });
    }
}