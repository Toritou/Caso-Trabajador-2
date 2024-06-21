package launcher;

import vista.FmrInterfazTrabajador;
import datos.FileDataSource;

public class Main {
    public static void main(String[] args) {
        FileDataSource dataSource = new FileDataSource("C:\\Users\\luist\\IdeaProjects\\Caso_trabajador2\\trabajador.txt");
        new FmrInterfazTrabajador(dataSource);
    }
}
