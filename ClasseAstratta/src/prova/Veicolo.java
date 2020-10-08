package prova;

public abstract class Veicolo {

	private String numTelaio;
	private String modello;
	private String targa;
	private String alimentazione;
	
	
	public Veicolo(String numTelaio, String modello, String targa, String alimentazione) {	//costrutto
		this.numTelaio = numTelaio;
		this.modello = modello;
		this.targa = targa;
		this.alimentazione = alimentazione;
	}
	
	public String getNumTelaio() {
		return numTelaio;
	}
	
	public String getModello() {
		return modello;
	}
	
	public String getTarga() {
		return targa;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}
	
	public boolean setNumTelaio(String nuovoNumTelaio) {
		this.numTelaio = nuovoNumTelaio;
		return true;
	}
	
	public boolean setModello(String nuovoModello) {
		this.modello = nuovoModello;
		return true;
	}
	
	public boolean setTarga(String nuovaTarga) {
		this.targa = nuovaTarga;
		return true;
	}
	
	public boolean setAlimentazione(String nuovaAlimentazione) {
		this.alimentazione = nuovaAlimentazione;
		return true;
	}
	
	public abstract boolean controllaTarga();
	
	@Override
	public String toString() {
		return "Telaio = " + numTelaio + ", Modello = " + modello + ", Targa = " + targa + ", Alimentazione = " + alimentazione + ",";
	}
	
}
