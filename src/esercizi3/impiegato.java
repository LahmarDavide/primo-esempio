package esercizi3;

public class impiegato {

	String nome;
	String cognome;
	int anzianeta;
	int ferie;
	double stipendio;
	public static int personale;

	public impiegato() {

	}

	public impiegato(String nome, String cognome, int anzianeta, int ferie, double stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		this.anzianeta = anzianeta;
		this.ferie = ferie;
		this.stipendio = stipendio;
		personale++;

	}

	public int ferieRestanti(int ferie) {

		if (this.ferie - ferie <= 0) {
			System.out.println("hai richiesto un eccesso di ferie");
		} else if (this.ferie - ferie == 0) {
			System.out.println("hai terminato le ferie");
		}
		return this.ferie - ferie;
	}

	public void  diffAnzianeta (impiegato i) {
		if(this.anzianeta < i.anzianeta) {
			System.out.println(i + "lavora da piu tempo");
			}else if (this.anzianeta > i.anzianeta) {
				System.out.println(this.anzianeta + "lavora da piu tempo");
				}else {
					System.out.println("lavorano dallo stesso giorno");
				}
	}
	
		public double aumentoPaga(){
			if(this.anzianeta >= 365*2) {
			return this.stipendio + this.stipendio * 10 /100;
			}else if (this.anzianeta >= 365*5) {
			return this.stipendio + this.stipendio * 15 / 100;
			}
			return this.stipendio;
	}
	
		public void guadagnoMaggiore (impiegato i1, impiegato i2) {
			if ((this.stipendio > i1.stipendio)&&(this.stipendio > i2.stipendio)) {
				System.out.println(this.nome + " "+ this.cognome +  " guadagna di piu");
			}else if ((i1.stipendio > this.stipendio)&& (i1.stipendio > i2.stipendio)) {
				System.out.println(i1.nome + " "+ i1.cognome + "guadagna di piu");
				}else {
					System.out.println(i2.nome + " "+ i2.cognome + "guadagna di piu");
				}
		}
		
		// getter and setter

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public int getAnzianeta() {
			return anzianeta;
		}

		public void setAnzianeta(int anzianeta) {
			this.anzianeta = anzianeta;
		}

		public int getFerie() {
			return ferie;
		}

		public void setFerie(int ferie) {
			this.ferie = ferie;
		}

		public double getStipendio() {
			return stipendio;
		}

		public void setStipendio(double stipendio) {
			this.stipendio = stipendio;
		}

		public static int getPersonale() {
			return personale;
		}

		public static void setPersonale(int personale) {
			impiegato.personale = personale;
		}
		
		public int getDipendeti () {
			return personale;
		}
		
		@Override
		public String toString() {
			return nome + " " + cognome + " " + anzianeta + " " + ferie + " " + stipendio + " "; 
		}
		
		
	

}
