package avioes;

import carros.Carro;

public class Aviao extends Carro {
	public double envergadura;
	public boolean tremPouso;

	/**
	 * Aterrizar
	 */
	public void aterrizar() {
		System.out.println("Avi�o pousou....");
	}

	/**
	 * Acelerar
	 */
	public void acelerar() {
		System.out.println("Avi�o decolou....");
	}
}
