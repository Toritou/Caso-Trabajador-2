package vista;

import javax.swing.*;
import datos.DataSource;
import modelo.Trabajador;

public class FmrInterfazTrabajador extends JFrame {
    private Trabajador trabajador;
    private DataSource dataSource;

    public FmrInterfazTrabajador(DataSource dataSource) {
        this.dataSource = dataSource;
        initialize();
        loadData();
    }

    private void initialize() {
        setTitle("Interfaz Trabajador");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
    }

    private void loadData() {
        dataSource.open();
        this.trabajador = new Trabajador("Luis Toro", 12345, "AFP UNO", "Fonasa");
        dataSource.close();

        displayWorkerData();
    }

    private void displayWorkerData() {
        if (trabajador != null) {
            JLabel nameLabel = new JLabel("Nombre: " + trabajador.getNombre());
            JLabel idLabel = new JLabel("ID: " + trabajador.getId());
            JLabel afpLabel = new JLabel("AFP: " + trabajador.getAfp());
            JLabel isapreLabel = new JLabel("Isapre: " + trabajador.getIsapre());

            add(nameLabel);
            add(idLabel);
            add(afpLabel);
            add(isapreLabel);
        }
    }
}
