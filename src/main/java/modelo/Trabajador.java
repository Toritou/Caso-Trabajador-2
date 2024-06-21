package modelo;

public class Trabajador extends Persona {
	private String afp;
	private String isapre;

	public Trabajador(String afp, String isapre) {
		super();
		this.afp = afp;
		this.isapre = isapre;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getIsapre() {
		return isapre;
	}

	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

}