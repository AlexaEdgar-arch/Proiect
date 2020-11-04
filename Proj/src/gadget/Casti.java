package gadget;

public class Casti extends Gadget{
	int incarcare, autonomie;
	String tip_casti;
	
	public Casti() {
		this.incarcare = 0;
		this.autonomie = 0;
		this.tip_casti = null;
	}
	
	public Casti(String nume, String descriere, String brand, String conectivitate, String material, int greutate,
			String culoare, double pret, int tensiuneAlimentare, int dimensiune, String compatibilitate,int incarcare, int autonomie, String tip_casti) {
		super(nume, descriere, brand, conectivitate, material, greutate, culoare, pret, tensiuneAlimentare, dimensiune,
				compatibilitate);
		this.incarcare = incarcare;
		this.autonomie = autonomie;
		this.tip_casti = tip_casti;
	}

	public Casti (Casti x) {
		super(x);
		this.incarcare = x.incarcare;
		this.autonomie = x.autonomie;
		this.tip_casti = x.tip_casti;
	}
	public String toString() {
		return super.toString() + "incarcare=" + incarcare + ", autonomie=" + autonomie + ", tip_casti=" + tip_casti;
	}
	
	
	
}
