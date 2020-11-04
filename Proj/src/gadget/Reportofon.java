package gadget;
public class Reportofon extends Gadget {
	boolean tipStocare;       //interna,externa
	int sensibilitate;        // minim DB inregistrati
	int capBaterie;
	
	public Reportofon(String nume, String descriere, String brand, String conectivitate, String material, int greutate,
			String culoare, double pret, int tensiuneAlimentare, int dimensiune, String compatibilitate, boolean tipStocare,int sensibilitate, int capBaterie) {
		super(nume, descriere, brand, conectivitate, material, greutate, culoare, pret, tensiuneAlimentare, dimensiune,
				compatibilitate);
		this.tipStocare = tipStocare;
		this.sensibilitate = sensibilitate;
		this.capBaterie = capBaterie;
	}
	public Reportofon() {
		super();
		this.tipStocare = false;
		this.sensibilitate = 0;
		this.capBaterie = 0;
	}
	public Reportofon(Reportofon x) {
		super(x);
		this.tipStocare = x.tipStocare;
		this.sensibilitate = x.sensibilitate;
		this.capBaterie = x.capBaterie;
	}
	public String toString() {
		return super.toString() + " reportofon [tipStocare=" + tipStocare + ", sensibilitate=" + sensibilitate + ", capBaterie="
				+ capBaterie + "]";
	}
	
	
	
	
}

