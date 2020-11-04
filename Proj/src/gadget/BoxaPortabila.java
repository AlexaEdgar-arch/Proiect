package gadget;
public class BoxaPortabila extends Gadget{

	double MarimeDifuzor;
	int Autonomie;
	int CapacitateAcumulator;
	public BoxaPortabila (BoxaPortabila x) { 
        super(x);
        this.MarimeDifuzor = x.MarimeDifuzor;
    	this.Autonomie = x.Autonomie;
    	this.CapacitateAcumulator = x.CapacitateAcumulator; 
    }
	public BoxaPortabila(String nume, String descriere, String brand, String conectivitate, String material,
			int greutate, String culoare, double pret, int tensiuneAlimentare, int dimensiune, String compatibilitate,double MarimeDifuzor, int Autonomie, int CapacitateAcumulator) {
		super(nume, descriere, brand, conectivitate, material, greutate, culoare, pret, tensiuneAlimentare, dimensiune,
				compatibilitate);
		this.MarimeDifuzor = MarimeDifuzor;
    	this.Autonomie = Autonomie;
    	this.CapacitateAcumulator = CapacitateAcumulator; 
	}
	public String toString() {
		return super.toString() + "BoxaPortabila [MarimeDifuzor=" + MarimeDifuzor + ", Autonomie=" + Autonomie + ", CapacitateAcumulator="
				+ CapacitateAcumulator + "]";
	}

	
	
}
