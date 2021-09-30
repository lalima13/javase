package seguros;

import contas.Conta;

public class SeguroPessoalFisica extends Conta {

	public static void main(String[] args) {
			SeguroPessoalFisica cc3 = new SeguroPessoalFisica();
			cc3.setCliente("Robson Vaamonde");
			cc3.setSaldo(9000);
			System.out.println("Cliente: " + cc3.getCliente());
			cc3.exibirSaldo();
			System.out.println("--------------------");
			

	}

}
