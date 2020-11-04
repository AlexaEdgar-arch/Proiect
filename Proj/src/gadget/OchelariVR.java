package gadget;
public class OchelariVR extends Gadget{

	String Rezolutie;
	Float DimensiuneImagine;
	int CampDeVizualizare;
	int LungimeCablu; 
	public OchelariVR (OchelariVR x) {
        super(x);
        this.Rezolutie = x.Rezolutie;
    	this.DimensiuneImagine = x.DimensiuneImagine;
    	this.CampDeVizualizare = x.CampDeVizualizare;
    	this.LungimeCablu = x.LungimeCablu;
    }
	
	public OchelariVR(String nume, String descriere, String brand, String conectivitate, String material, int greutate,
			String culoare, double pret, int tensiuneAlimentare, int dimensiune, String compatibilitate,String Rezolutie, Float DimensiuneImagine, int CampDeVizualizare, int LungimeCablu) {
		super(nume, descriere, brand, conectivitate, material, greutate, culoare, pret, tensiuneAlimentare, dimensiune,
				compatibilitate);
		this.Rezolutie = Rezolutie;
    	this.DimensiuneImagine = DimensiuneImagine;
    	this.CampDeVizualizare = CampDeVizualizare;
    	this.LungimeCablu = LungimeCablu; 
	}
	
	public OchelariVR() {
		Rezolutie = "rezolutie";
		DimensiuneImagine = 0F;
		CampDeVizualizare = 0;
		LungimeCablu = 0;
	}

	public String toString() {
		return super.toString() + "OchelariVR [Rezolutie=" + Rezolutie + ", DimensiuneImagine=" + DimensiuneImagine
				+ ", CampDeVizualizare=" + CampDeVizualizare + ", LungimeCablu=" + LungimeCablu + "]";
	}
	
	
}
