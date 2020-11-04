package gadget;
public class Gadget {
	
	String nume;
	String descriere;
	String brand;
	String conectivitate;
	String material;
	int greutate;
	String culoare;
	String functii;
	double pret;
	int tensiuneAlimentare;
	int dimensiune; // vector
	String compatibilitate;
	public Gadget() {
		nume = "ceas";
		descriere = "descriere";
		brand = "brand";
		conectivitate = "conect";
		material = "material";
		greutate = 0;
		culoare = "culoare";
		functii = "functii";
		pret = 0;
		tensiuneAlimentare = 0;
		dimensiune = 0;
		compatibilitate = "compatibilitate";
	}
	public Gadget(String nume,String descriere,String brand, 
			String conectivitate, String material,int greutate,String culoare, double pret,int tensiuneAlimentare, 
			int dimensiune,String compatibilitate) {
		this.nume = nume;
		this.descriere = descriere;
		this.brand = brand;
		this.conectivitate = conectivitate;
		this.material = material;
		this.greutate = greutate;
		this.culoare = culoare;
		this.pret = pret;
		this.tensiuneAlimentare = tensiuneAlimentare;
		this.dimensiune = dimensiune; // vector
		this.compatibilitate = compatibilitate;
	}
	public Gadget (Gadget x) {
		this.nume = x.nume;
		this.descriere = x.descriere;
		this.brand = x.brand;
		this.conectivitate = x.conectivitate;
		this.material = x.material;
		this.greutate = x.greutate;
		this.culoare = x.culoare;
		this.pret = x.pret;
		this.tensiuneAlimentare = x.tensiuneAlimentare;
		this.dimensiune = x.dimensiune; // vector
		this.compatibilitate = x.compatibilitate;
	}
	public String toString() {
		return "gadget [nume=" + nume + ", descriere=" + descriere + ", brand=" + brand + ", conectivitate="
				+ conectivitate + ", material=" + material + ", greutate=" + greutate + ", culoare=" + culoare
				+ ", functii=" + functii + ", pret=" + pret + ", tensiuneAlimentare=" + tensiuneAlimentare
				+ ", dimensiune=" + dimensiune + ", compatibilitate=" + compatibilitate + "]";
	}

}

