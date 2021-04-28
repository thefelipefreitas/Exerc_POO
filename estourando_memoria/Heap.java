package estourando_memoria;

public class Heap {

	public static void somaStrings(String txt) {

		for (int i = 0; i < 1000000000; i++) {
			txt += txt;
		}
	}

	public static void main(String[] args) {
		
		somaStrings(" ");
	
	}
}
