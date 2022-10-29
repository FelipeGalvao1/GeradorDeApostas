package controller;

import view.TelaPrincipal;

public class Numeros {

	// Instanciando a tela principal
	TelaPrincipal t = new TelaPrincipal();

	public int[] GerarNumeros(int nApostas) {
		int[] num = new int[6];

		for (int i = 0; i < nApostas; i++) {
			for (int j = 0; j < 6; j++) {
				num[j] = (int) ((Math.random() * 60) + 1);
			}
			num = VerificaDuplicados(num);
			OrdenarVetor(num);
			ExibeVetor(num);
		}
		return num;
	}

	private void ExibeVetor(int[] num) {

		for (int i = 0; i < 6; i++) {
			// System.out.print(num[i] + " ");
			t.area.append(Integer.toString(num[i]) + " ");
		}
		t.area.append("\n");
		// System.out.println("");
	}

	private int[] VerificaDuplicados(int[] num) {
		for (int y = 0; y < 6; y++) {
			for (int z = y + 1; z < 6; z++) {
				if (num[y] == num[z]) {
					int x = GerarNovoNumero(num);
					num[y] = x;
				}
			}
		}
		return num;
	}

	private int GerarNovoNumero(int num[]) {
		int n = (int) ((Math.random() * 60) + 1);
		for (int y = 0; y < 6; y++) {
			if (n == num[y]) {
				n = (int) ((Math.random() * 60) + 1);
			}
		}
		return n;
	}

	private void OrdenarVetor(int[] num) {
		int aux;
		for (int y = 0; y < 6; y++) {
			for (int z = y + 1; z < 6; z++) {
				if (num[y] > num[z]) {
					aux = num[z];
					num[z] = num[y];
					num[y] = aux;
				}
			}
		}
	}
}
