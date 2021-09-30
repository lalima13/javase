package ferramentas;

import blocos.Bloco;

public class Terra {

	public static void main(String[] args) {

		Bloco terra = new Bloco();
		terra.resist�ncia = 10;
		terra.textura = "terra";
		System.out.println("Resist�ncia: " + terra.resist�ncia);
		System.out.println("Textura: " + terra.textura);
		terra.minerar();
		terra.construir();

		Bloco pedra = new Bloco();
		pedra.resist�ncia = 100;
		pedra.textura = "pedra";
		System.out.println("Resist�ncia: " + pedra.resist�ncia);
		System.out.println("Textura: " + pedra.textura);
		pedra.minerar();
		pedra.craftar();

	}

}
