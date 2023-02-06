package esercizi3;

public class mainCostruttore {

	public static void main(String[] args) {
		
		costruttore contatore1 = new costruttore();
		costruttore contatore2 = new costruttore();
		costruttore contatore3 = new costruttore();
		
		System.out.println(contatore1.getContatore());
		System.out.println(contatore1.incrementaContatore());
		System.out.println(contatore1.decrementoContatore());
		System.out.println(contatore1.resetContatore());
		
	}

}
