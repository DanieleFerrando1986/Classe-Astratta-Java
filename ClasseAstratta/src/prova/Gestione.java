package prova;

import java.io.*;

public class Gestione {

	public static void main(String[] args) {
		
		Autovettura a [] = new Autovettura [100];
		Camion c [] = new Camion [100];
		int i = 1, j = 1, scelta = 0;
		
		do {
			System.out.println("\n1) inserisci un' autovettura");
			System.out.println("\n2) visualizza le autovetture");
			System.out.println("\n3) inserisci un camion");
			System.out.println("\n4) visualizza i camion");
			System.out.println("\n5) esci");
			scelta = Input.readInt();
			
			if(scelta == 1)
			{

				try {
					String nt = Input.readString("\nnumero telaio: ");
					String mod = Input.readString("\nmodello: ");
					String t = Input.readString("\ntarga: ");
					String al = Input.readString("\nalimentazione: ");
					int np = Input.readInt("\nnumero posti: ");
					
					a [i] = new Autovettura(nt, mod, t, al, np);
					
					
					PrintWriter inapp = new PrintWriter(new FileWriter("autovettura.txt", true));
					inapp.append("-numero telaio: " + nt + "  -modello: " + mod + "  -targa: " + t + "  -alimentazione: " + al + "  -numero posti: " + np + "\n");
					inapp.close(); //richiama il metodo close() facendo la chiusura di uno stream sia di input che di output
						
				}
				
				catch (IOException e) {
				}

				i++;	
			}
			
			//visualizza i dati dei libri
			if(scelta == 2)
			{
				
			 try {
				FileReader f1 = new FileReader("autovettura.txt");
				BufferedReader fIN = new BufferedReader(f1);		
				String linea = fIN.readLine();
				System.out.println(linea);
				while (linea != null) {
					linea = fIN.readLine();
					System.out.println(linea);				
									  }	
			 }
			 
			 catch (IOException e) {System.out.println("errore nella lettura del file");}	
			}
			
			if(scelta == 3)
			{

				try {
					String nt = Input.readString("\nnumero telaio: ");
					String mod = Input.readString("\nmodello: ");
					String t = Input.readString("\ntarga: ");
					String al = Input.readString("\nalimentazione: ");
					int na = Input.readInt("\nnumero assi: ");
					
					c [j] = new Camion(nt, mod, t, al, na);
					
					
					PrintWriter inapp = new PrintWriter(new FileWriter("camion.txt", true));
					inapp.append("-numero telaio: " + nt + "  -modello: " + mod + "  -targa: " + t + "  -alimentazione: " + al + "  -numero assi: " + na + "\n");
					inapp.close(); //richiama il metodo close() facendo la chiusura di uno stream sia di input che di output
						
				}
				
				catch (IOException e) {
				}

				j++;	
			}
			
			//visualizza i dati dei libri
			if(scelta == 4)
			{
				
			 try {
				FileReader f1 = new FileReader("camion.txt");
				BufferedReader fIN = new BufferedReader(f1);		
				String linea = fIN.readLine();
				System.out.println(linea);
				while (linea != null) {
					linea = fIN.readLine();
					System.out.println(linea);				
									  }	
			 }
			 
			 catch(IOException e) {System.out.println("errore nella lettura del file");}	
			}
			
		} while(scelta != 5);

	}

}
