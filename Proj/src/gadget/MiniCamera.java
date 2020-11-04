package gadget;
public class MiniCamera extends Gadget {
	int rezolutie;
	int capBaterie;
	boolean redare;
	
	public MiniCamera(String nume, String descriere, String brand, String conectivitate, String material, int greutate,
			String culoare, double pret, int tensiuneAlimentare, int dimensiune, String compatibilitate,int rezolutie,int capBaterie, boolean redare) {
		super(nume, descriere, brand, conectivitate, material, greutate, culoare, pret, tensiuneAlimentare, dimensiune,
				compatibilitate);
		this.rezolutie = rezolutie;
		this.capBaterie = capBaterie;
		this.redare = redare;
	}
	public MiniCamera () {
		super();
		this.rezolutie = 0;
		this.capBaterie = 0;
		this.redare = false;
	}
	public MiniCamera(MiniCamera x) {
		super(x);
		this.rezolutie = x.rezolutie;
		this.capBaterie = x.capBaterie;
		this.redare = x.redare;
	}
	public String toString() {
		return super.toString() + " miniCamera [rezolutie=" + rezolutie + ", capBaterie=" + capBaterie + ", redare=" + redare + "]";
	}
	
}
