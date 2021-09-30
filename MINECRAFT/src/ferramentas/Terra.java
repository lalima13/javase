package ferramentas;

import blocos.Bloco;

public class Terra {

	public static void main(String[] args) {

		Bloco terra = new Bloco();
		terra.resistência = 10;
		terra.textura = "terra";
		System.out.println("Resistência: " + terra.resistência);
		System.out.println("Textura: " + terra.textura);
		terra.minerar();
		terra.construir();

		Bloco pedra = new Bloco();
		pedra.resistência = 100;
		pedra.textura = "pedra";
		System.out.println("Resistência: " + pedra.resistência);
		System.out.println("Textura: " + pedra.textura);
		pedra.minerar();
		pedra.craftar();

	}

}
