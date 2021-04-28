package aeroporto;

public class TesteAeroporto {

	public static void main(String[] args) {

		Pessoa person1 = new Pessoa("Maria", "Do Rosário", 34);
		person1.andar();
		System.out.println(person1.toString());

		Pessoa person2 = new Pessoa("Luis", "Molusco", 50);
		person2.andar();
		System.out.println(person2.toString());

		Passageiro passenger1 = new Passageiro("João", "De Deus", 62, 342314413, 2223432, 111023);
		passenger1.entrar();
		System.out.println(passenger1.toString());

		Passageiro passenger2 = new Passageiro("Jair", "Messias", 54, 567465445, 2653424, 930148);
		passenger2.entrar();
		System.out.println(passenger2.toString());

		Piloto pilot1 = new Piloto("Carlos", "Maia", 65, "PLA", 8809238, 540);
		pilot1.pilotar();
		System.out.println(pilot1.toString());

		Piloto pilot2 = new Piloto("William", "Bonner", 47, "PC", 9430842, 235);
		pilot2.pilotar();
		System.out.println(pilot2.toString());

		Aeronave airplane1 = new Aeronave("Boeing 737", "MAX 200", 200);
		airplane1.decolar();
		System.out.println(airplane1.toString());

		Aeronave airplane2 = new Aeronave("F-22 Raptor", "Lockheed YF-22", 1);
		airplane2.decolar();
		System.out.println(airplane2.toString());

	}
}