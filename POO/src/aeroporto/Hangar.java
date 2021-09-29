package aeroporto;

import avioes.Aviao;

public class Hangar {
	public static void main(String[] args) {
		Aviao boing777 = new Aviao();
		boing777.ano = 2016;
		boing777.cor = "branco";
		boing777.envergadura = 64.8;
		System.out.println("Aviao: Boing 777");
		System.out.println("Ano: " + boing777.ano);
		System.out.println("Cor: " + boing777.cor);
		System.out.println("Envergadura: " + boing777.envergadura);
		boing777.ligar();
		boing777.acelerar();
		boing777.tremPouso = false;
		boing777.aterrizar();
		if (boing777.tremPouso = false) {
			boing777.aterrizar();
		} else {
			System.out.println("ARREMETER");
		}
		Aviao airbusa320 = new Aviao();
		airbusa320.ano = 2012;
		airbusa320.cor = "prata";
		airbusa320.envergadura = 64.8;
		System.out.println("Aviao: Airbus A320");
		System.out.println("Ano: " + airbusa320.ano);
		System.out.println("Cor: " + airbusa320.cor);
		System.out.println("Envergadura: " + airbusa320.envergadura);
		airbusa320.ligar();
		airbusa320.acelerar();
		airbusa320.aterrizar();

	}

}
