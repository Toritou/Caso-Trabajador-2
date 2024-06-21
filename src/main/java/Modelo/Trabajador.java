package Modelo;

public class Trabajador extends Personas {

	private string afp;
	private string isapre;

	public string getAfp() {
		return this.afp;
	}

	/**
	 * 
	 * @param afp
	 */
	public void setAfp(string afp) {
		this.afp = afp;
	}

	public string getIsapre() {
		return this.isapre;
	}

	/**
	 * 
	 * @param isapre
	 */
	public void setIsapre(string isapre) {
		this.isapre = isapre;
	}

	public Trabajador() {
		// TODO - implement Trabajador.Trabajador
		throw new UnsupportedOperationException();
	}

}