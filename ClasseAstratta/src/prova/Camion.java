package prova;

public class Camion extends Veicolo {

	private int numeroAssi;
	
	public Camion(String numTelaio, String modello, String targa, String alimentazione, int numeroAssi) {  //campi sono definiti nella superclasse
		super(numTelaio, modello, targa, alimentazione);
		this.numeroAssi = numeroAssi;
	}
	
	public int getNumeroAssi() {
		return numeroAssi;
	}
	
	@Override
	public boolean controllaTarga() {
		String targa = super.getTarga();
		if(Character.isLetter(targa.charAt(0)) && Character.isLetter(targa.charAt(1)) &&
		   Character.isDigit(targa.charAt(2)) && Character.isDigit(targa.charAt(3)) &&
		   Character.isDigit(targa.charAt(4)) && Character.isDigit(targa.charAt(5)) && 
		   Character.isDigit(targa.charAt(6)) && Character.isDigit(targa.charAt(7))) {
		   return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Numero Assi = " + numeroAssi + '\n';
	}
}
