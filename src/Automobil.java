public abstract class Automobil {
	
	private String proizvodjac;
	private String model;
	private int godiste;
	private int cena;
	private int broj_vrata;
	private int kubikaza;
	private int snaga_motora;
	private int masa;
	private String boja;
	private int km;
	
	public Automobil(String proizvodjac, String model, int godiste, int cena, int broj_vrata, int kubikaza,
			int snaga_motora, int masa, String boja, int km) {
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.godiste = godiste;
		this.cena = cena;
		this.broj_vrata = broj_vrata;
		this.kubikaza = kubikaza;
		this.snaga_motora = snaga_motora;
		this.masa = masa;
		this.boja = boja;
		this.km = km;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}
	public String getModel() {
		return model;
	}
	public int getGodiste() {
		return godiste;
	}
	public int getCena() {
		return cena;
	}
	public int getBroj_vrata() {
		return broj_vrata;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public int getSnaga_motora() {
		return snaga_motora;
	}
	public int getMasa() {
		return masa;
	}
	public String getBoja() {
		return boja;
	}
	public int getKm() {
		return km;
	}
	
	@Override
	public String toString() {
		return "Proizvodjac: " + proizvodjac + ", Model: " + model + ", Godiste: " + godiste + ", Cena: " + cena
				+ ", Broj vrata: " + broj_vrata + ", Kubikaza: " + kubikaza + ", Snaga motora: " + snaga_motora + ", Masa: "
				+ masa + ", Boja: " + boja + ", Kilometraza: " + km;
	}
	
	
	
}
