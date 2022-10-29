package view;
import javax.swing.JOptionPane;

import controller.Numeros;

public class Main {
	public static void main(String[] args) {
		Numeros n = new Numeros();
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de apostas que você deseja"));
		n.GerarNumeros(i);
	}

}
