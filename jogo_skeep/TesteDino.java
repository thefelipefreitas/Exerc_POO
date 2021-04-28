package jogo_skeep;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TesteDino {

	public static void main(String[] args) {

		Dinossauro skeep = new Dinossauro();
		Scanner scan = new Scanner(System.in);
		char letra = 'X';

		while (letra != '9') {

			System.out.println("\n\n------------------- DINOSSAURO SKEEP ------------------- "
					+ "\n\n                    ESCOLHA UMA AÇÃO" + "\n(P)ular " + "\nCo(R)rer " + "\n(C)omer "
					+ "\n(B)rincar " + "\nTomar (S)ol " + "\nFicar na s(O)mbra"
					+ "\n");
			String textoMaiusculo = scan.nextLine().toUpperCase();
			letra = textoMaiusculo.charAt(0);

			switch (letra) {
			case 'P':
				skeep.pular();
				break;

			case 'R':
				skeep.correr();
				break;

			case 'C':
				skeep.comer();
				break;

			case 'B':
				skeep.brincar();
				break;

			case 'S':
				skeep.tomarSol();
				break;

			case 'O':
				skeep.ficarNaSombra();
				break;

			default:
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
				break;
			}
		}
	}
}
