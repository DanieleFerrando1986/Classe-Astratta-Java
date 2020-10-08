package prova;

public class Autovettura extends Veicolo {

	private int numeroPosti;
	
	public Autovettura(String numTelaio, String modello, String targa, String alimentazione, int numeroPosti) {  //campi definiti nella superclasse "super"
		super(numTelaio, modello, targa, alimentazione);
		this.numeroPosti = numeroPosti;
	}
	
	public int getNumeroPosti() {
		return numeroPosti;
	}
	
	@Override
	public boolean controllaTarga() {
		String targa = super.getTarga();
		if(Character.isLetter(targa.charAt(0)) && Character.isLetter(targa.charAt(1)) &&
		   Character.isDigit(targa.charAt(2)) && Character.isDigit(targa.charAt(3)) &&
		   Character.isDigit(targa.charAt(4)) && Character.isLetter(targa.charAt(5)) && Character.isLetter(targa.charAt(6))) {
		   return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Numero Posti = " + numeroPosti + '\n';
	}
	
}
