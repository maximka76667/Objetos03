package ej01_encuesta;

public class Main {

	public static void main(String[] args) {

		Encuesta enc = new Encuesta("Pregunta");

		System.out.println(enc.getPorcentajeA());
		System.out.println(enc.getPorcentajeB());

		enc.increaseA();
		System.out.println(enc.getTotal());
		System.out.println(enc.getPorcentajeA());
		System.out.println(enc.getPorcentajeB());

		enc.increaseB();
		System.out.println(enc.getTotal());
		System.out.println(enc.getPorcentajeA());
		System.out.println(enc.getPorcentajeB());

		enc.increaseA();
		System.out.println(enc.getTotal());
		System.out.println(enc.getPorcentajeA());
		System.out.println(enc.getPorcentajeB());

		enc.increaseA();
		System.out.println(enc.getTotal());
		System.out.println(enc.getPorcentajeA());
		System.out.println(enc.getPorcentajeB());

		enc.increaseB();
		System.out.println(enc.getTotal());
		System.out.println(enc.getPorcentajeA());
		System.out.println(enc.getPorcentajeB());
	}

}
