package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataSource implements DataSource {
    private String filePath;
    private BufferedReader reader;

    public FileDataSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void open() {
        try {
            reader = new BufferedReader(new FileReader(filePath));
        } catch (IOException e) {
            System.err.println("Error al abrir el archivo: " + e.getMessage());
        }
    }

    @Override
    public void read() {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    @Override
    public void close() {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            System.err.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}
