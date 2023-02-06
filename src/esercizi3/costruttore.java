package esercizi3;

public class costruttore {
	
	 public static int contatore;
	 
	 public  costruttore() {
		 contatore++;
	 }
	 
	 public static int incrementaContatore() {
		 return ++contatore;
		  }
	 
	 public static int decrementoContatore() {
		 return --contatore;
	 }

	 public static int resetContatore() {
		 return contatore=0;
	 }
	 public static int getContatore() {
		 return contatore;
	 }
}
