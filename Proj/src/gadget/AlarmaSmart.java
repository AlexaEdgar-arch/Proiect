package gadget;
public class AlarmaSmart extends Gadget {
	int DistantaTransmisie;
	double Frecventa;
	double ConsumInLucru;
	public AlarmaSmart (AlarmaSmart x) {
        super(x);
        this.DistantaTransmisie = x.DistantaTransmisie;
        this.Frecventa= x.Frecventa;
        this.ConsumInLucru = x.ConsumInLucru;
    }
	public AlarmaSmart(String nume, String descriere, String brand, String conectivitate, String material, int greutate,
			String culoare, double pret, int tensiuneAlimentare, int dimensiune, String compatibilitate,int DistantaTransmisie, double Frecventa, double ConsumInLucru) {
		super(nume, descriere, brand, conectivitate, material, greutate, culoare, pret, tensiuneAlimentare, dimensiune,
				compatibilitate);
		this.DistantaTransmisie = DistantaTransmisie;
		this.Frecventa = Frecventa;
		this.ConsumInLucru = ConsumInLucru;
	}
	public AlarmaSmart() {
		super();
		DistantaTransmisie = 0;
		Frecventa = 0.0;
		ConsumInLucru = 0.0;
	}
	public String toString() {
		return super.toString() + "AlarmaSmart [DistantaTransmisie=" + DistantaTransmisie + ", Frecventa=" + Frecventa + ", ConsumInLucru="
				+ ConsumInLucru + "]";
	}

	
	
}
