package datos;

public interface DataSource {
	void open();
	void read();
	void close();
}
