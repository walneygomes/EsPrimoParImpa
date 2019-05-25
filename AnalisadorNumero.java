package Observer;

import java.util.ArrayList;

public class AnalisadorNumero {
	Integer valor;
	ArrayList<Integer> tabela = new ArrayList<Integer>();

	public void numero(int valor) {
		this.valor = valor;

	}

	public boolean esPrimo() {
		tabela.clear();

		return false;
	}

	public boolean esPar() {
		tabela.clear();

		gerarTabelaPares();
		for (Integer i : tabela) {
			if (i.equals(valor)) {
				return true;
			} else if (i.intValue() > valor.intValue()) {
				return false;
			} else {
				this.gerarTabelaPares();
			}

		}
		return false;

	}

	public boolean esImpa() {
		

		if (!esPar()) {
			return true;
		}
		return false;
	}

	public boolean ePrimo() {
		gerarTabelaPares();
		for (Integer i : tabela) {
			if (i.equals(valor)) {
				return true;
			} else if (i.intValue() > valor.intValue()) {
				return false;
			} else {
				this.gerarTabelaPares();
			}

		}
		return false;
	}

	private void gerarTabelaPares() {
		int inicio = 0;
		int fim = 100;

		for (int i = inicio; i < fim; i++) {
			tabela.add(i * 2);
		}
		inicio = fim;
		fim += inicio;
	}

	private void gerarTabelaPrimos() {
		int inicio = 0;
		int fim = 100;

		for (int i = inicio; i < fim; i++) {
			if (i % 2 != 0) {
				tabela.add(i * 2);
			}
		}
		inicio = fim;
		fim += inicio;

	}

}
