package ej01_encuesta;

public class Encuesta {

	private String pregunta;
	private int votosA, votosB, total;
	private double porcentajeA, porcentajeB;

	public Encuesta(String pregunta) {
		this.pregunta = pregunta;
		this.votosA = 0;
		this.votosB = 0;
		this.total = 0;
		this.porcentajeA = 0;
		this.porcentajeB = 0;
	}
	
	public void increaseVotas(boolean isA) {
		if(isA) this.votosA++; 
		else this.votosB++;
		this.total++;
		this.porcentajeA = this.total > 0 ? this.votosA * 100.0 / this.total : 0;
		this.porcentajeB = this.total > 0 ? this.votosB * 100.0 / this.total : 0;
	}

	public void increaseA() {
		increaseVotas(true);
	}

	public void increaseB() {
		increaseVotas(false);
	}

	public String getPregunta() {
		return this.pregunta;
	}

	public int getVotosA() {
		return this.votosA;
	}

	public int getVotosB() {
		return this.votosB;
	}

	public int getTotal() {
		return this.total;
	}

	public double getPorcentajeA() {
		return this.porcentajeA;
	}

	public double getPorcentajeB() {
		return this.porcentajeB;
	}

}
