package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FmrInterfazTrabajador extends JFrame implements ActionListener {


    private JPanel jpInterfaz;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnEditar;
    private JButton btnSalir;
    private JButton btnLeer;

    public FmrInterfazTrabajador(){
        setTitle("Interfaz del Trabajador");
        setContentPane(jpInterfaz);
        setSize(800, 600);
        setVisible(true);
        setLocationRelativeTo(null);


        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}