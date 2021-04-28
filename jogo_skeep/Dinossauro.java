package jogo_skeep;

public class Dinossauro {

	private int energia = 100;
	private int velocidade = 100;
	private int temperatura = 100;
	private int humor = 100;

	public void pular() {
		temperatura++;
		energia -= 2;
		humor += 2;
		System.out.println("\nSkeep pulou!" + "\nEnergia-- " + "\nHumor++ " + "\nTemperatura+");
		System.out.println(toString());
	}

	public void correr() {
		temperatura += 2;
		energia -= 4;
		humor += 2;
		System.out.println("\nSkeep correu!" + "\nEnergia---- " + "\nHumor++ " + "\nTemperatura++");
		System.out.println(toString());
	}

	public void comer() {
		energia += 4;
		humor += 2;
		System.out.println("\nSkeep comeu!" + "\nEnergia++++ " + "\nHumor++ ");
		System.out.println(toString());
	}

	public void brincar() {
		temperatura += 2;
		energia -= 4;
		humor += 3;
		System.out.println("\nSkeep brincou!" + "\nEnergia---- " + "\nHumor+++ "+ "\nTemperatura++");
		System.out.println(toString());
	}

	public void tomarSol() {
		temperatura += 4;
		velocidade += 2;
		energia -= 2;
		humor += 4;
		System.out.println("\nSkeep tomou sol!" + "\nTemperatura++++"+ "\nEnergia-- " + "\nHumor ++++ " + "\nVelocidade++ ");
		System.out.println(toString());
	}

	public void ficarNaSombra() {
		temperatura -= 4;
		energia += 3;
		humor -= 3;
		System.out.println("\nSkeep ficou na sombra!" + "\nTemperatura----" + "\nEnergia+++ " + "\nHumor--- ");
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "\nAtributos do Skeep::: Energia = " + energia + "\n                      Velocidade = " + velocidade
				+ "\n                      Temperatura = " + temperatura + "\n                      Humor = " + humor;
	}

}
