package modelo;

public class Trabajador extends Persona {
	private String afp;
	private String isapre;

	public Trabajador(String nombre, int id, String afp, String isapre) {
		super(nombre, id);
		this.afp = afp;
		this.isapre = isapre;
	}

	public String getAfp() {
		return afp;
	}


	public String getIsapre() {
		return isapre;
	}

}
