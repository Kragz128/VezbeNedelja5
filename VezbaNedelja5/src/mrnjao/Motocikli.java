package mrnjao;

public class Motocikli extends Vozilo {
	private int kilometraza;
	
	public int getKilometraza() {
		return kilometraza;
	}
	
	public void setKilometraza (int kilometraza) {
		this.kilometraza = kilometraza;
	}
	
	public float cijenaRegistracije() {
		float cijena;
		cijena = ((float)this.getKubikaza() /5 - (float) this.getKilometraza() /1000) *Motocikli.getOsnovicaZaRegistraciju();
		return cijena;
	}
	public Motocikli() {
		this (null, null, 0 , 0 , 0);
	}

	public Motocikli( String marka, String model, int kubikaza, int godiste, int kilometraza) {
		super(marka, model, kubikaza, godiste);
		this.setKilometraza(kilometraza);
	}
public String toString() {
	return "Motocikl [kilometraze=" + getKilometraza() + ", marka=" +getMarka() + ", model=" + getModel() + ", kubikaze=" + getKubikaza() + ", godiste=" + getGodiste() + "] ";
}
}
