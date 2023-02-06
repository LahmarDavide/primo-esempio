package esercizi3;

public class mainImpiegato {

	public static void main(String[] args) {
		
		impiegato i = new impiegato("davide", "lahmar", 400, 28, 1250.00);
		impiegato x = new impiegato("francesco", "lahmar", 300, 8, 1050.00);
		impiegato l = new impiegato("antonio", "lahmar", 800, 40, 2250.00);
		// ferie 
		System.out.println(i.ferieRestanti(10));
		//aumento paga
		System.out.println(i.aumentoPaga());
		System.out.println(l.aumentoPaga());
		//
		
		
		
	
	}
	

}
