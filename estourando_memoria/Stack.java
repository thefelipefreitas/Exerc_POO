package estourando_memoria;

public class Stack {

	public static void recursiva(String txt) {

		if (txt == " ") {
			return;
		} else {
			recursiva(txt);
		}
	}

	public static void main(String[] args) {
	
		recursiva(".");
		
	}
}