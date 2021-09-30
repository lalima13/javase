package ferramentas;

import blocos.Enxada;

public class Ferramenta {

	public static void main(String[] args) {
		Enxada enxada = new Enxada();
		enxada.resistência = 10;
		enxada.textura = "terra";
		enxada.blocoterra = true;
		System.out.println("Resistência: " + enxada.resistência);
		System.out.println("Textura: " + enxada.textura);

		if (enxada.blocoterra == true) {
			enxada.arar();
		} else {
			enxada.minerar();

		}

	}
}
