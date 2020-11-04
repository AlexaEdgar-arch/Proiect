package gadget;
public class PrizaInteligenta extends Gadget{
	double FrecventaSemnal;
	String TensiuneAlimentare;
	String TemperaturaDeOperare;
	public PrizaInteligenta (PrizaInteligenta x) {
        super(x);
        this.FrecventaSemnal = x.FrecventaSemnal;
        this.TensiuneAlimentare= x.TensiuneAlimentare;
        this.TemperaturaDeOperare = x.TemperaturaDeOperare;
    }
	public PrizaInteligenta(String nume, String descriere, String brand, String conectivitate, String material,
			int greutate, String culoare, double pret, int tensiuneAlimentare, int dimensiune, String compatibilitate,double FrecventaSemnal,String TensiuneAlimentare,String TemperaturaDeOperare) {
		super(nume, descriere, brand, conectivitate, material, greutate, culoare, pret, tensiuneAlimentare, dimensiune,
				compatibilitate);
		this.FrecventaSemnal = FrecventaSemnal;
    	this.TemperaturaDeOperare = TemperaturaDeOperare;
    	this.TensiuneAlimentare = TensiuneAlimentare;
	}
	public PrizaInteligenta() {
		super();
		FrecventaSemnal = 0.0;
		TensiuneAlimentare = null;
		TemperaturaDeOperare = null;
	}
	public String toString() {
				return super.toString() + "PrizaInteligenta [FrecventaSemnal=" + FrecventaSemnal + ", TensiuneAlimentare=" + TensiuneAlimentare
				+ ", TemperaturaDeOperare=" + TemperaturaDeOperare + "]";
	}
	
	
}
