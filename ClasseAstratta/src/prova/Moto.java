package prova;

public class Moto extends Veicolo {
	
	private boolean guidaLibera;
	
	public Moto(String numTelaio, String modello, String targa, String alimentazione, boolean guidaLibera) {  //campi sono definiti nella superclasse
		super(numTelaio, modello, targa, alimentazione);
		this.guidaLibera = guidaLibera;
	}
	
	public boolean getGuidaLibera() {
		return guidaLibera;
	}
	
	@Override
	public boolean controllaTarga() {
		throw new UnsupportedOperationException("Non ancora supportato.");
	}
	
	@Override
	public String toString() {
		return super.toString() + " Guida Libera = " + guidaLibera + '\n';
	}

}
