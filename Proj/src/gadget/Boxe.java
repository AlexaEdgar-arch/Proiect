package gadget;

public class Boxe extends Gadget{
	int impedanta, putere_rms, sensibilitate;
	
	public Boxe () {
		super();
		this.impedanta = 0;
		this.putere_rms = 0;
		this.sensibilitate = 0;
	}
	
	public Boxe(String nume, String descriere, String brand, String conectivitate, String material, int greutate,
			String culoare, double pret, int tensiuneAlimentare, int dimensiune, String compatibilitate,int impedanta, int putere_rms, int sensibilitate) {
		super(nume, descriere, brand, conectivitate, material, greutate, culoare, pret, tensiuneAlimentare, dimensiune,
				compatibilitate);
		this.impedanta = impedanta;
		this.putere_rms = putere_rms;
		this.sensibilitate = sensibilitate;
	}

	public Boxe (Boxe x) {
		super(x);
		this.impedanta = x.impedanta;
		this.putere_rms = x.putere_rms;
		this.sensibilitate = x.sensibilitate;
	}

	public String toString() {
		return super.toString() + "impedanta=" + impedanta + ", putere_rms=" + putere_rms + ", sensibilitate=" + sensibilitate;
	}
	

}
