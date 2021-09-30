package blocos;

public class Enxada extends Bloco {

	public boolean conquista;
	public boolean blocoterra;

	public void arar() {
		System.out.println("Arrando Terra");
		conquista = true;
		System.out.println("Você arou! uma nova conquista foi desbloqueada.");
	}

}
