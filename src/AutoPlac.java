import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class AutoPlac {
		
	
	public AutoPlac() {
	}
	
	
	Automobil[] automobili;
	 
	public void ucitajAutomobile() {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite maksimalan broj automobila na placu: ");
		int maks = unos.nextInt();
		unos.nextLine();
		automobili = new Automobil[maks];
		int i = 0;
		String nastavak = "Da";
		
		while (i < maks &&  nastavak.equalsIgnoreCase("Da")) {
			System.out.println("Proizvodjac: ");
			String proizvodjac = unos.next();
			System.out.println("Model: ");
			String model = unos.next();
			System.out.println("Godiste: ");
			int godiste = unos.nextInt();
			unos.nextLine();
			System.out.println("Cena: ");
			int cena = unos.nextInt();
			unos.nextLine();
			System.out.println("Broj vrata: ");
			int broj_vrata = unos.nextInt();
			unos.nextLine();
			System.out.println("Kubikaza: ");
			int kubikaza = unos.nextInt();
			unos.nextLine();
			System.out.println("Snaga motora (kW): ");
			int snaga_motora = unos.nextInt();
			unos.nextLine();
			System.out.println("Masa: ");
			int masa = unos.nextInt();
			unos.nextLine();
			System.out.println("Boja: ");
			String boja = unos.next();
			System.out.println("Kilometraza: ");
			int km = unos.nextInt();
			unos.nextLine();
			System.out.println("Vrsta automobila (Limuzina/Dzip/Karavan): ");
			String vrsta = unos.next();
			switch (vrsta) {
				case "Limuzina":
					automobili[i] = new Limuzina(proizvodjac, model, godiste, cena, broj_vrata, kubikaza, snaga_motora, masa, boja, km);
					break;
				case "Dzip":
					automobili[i] = new Dzip(proizvodjac, model, godiste, cena, broj_vrata, kubikaza, snaga_motora, masa, boja, km);
					break;
				case "Karavan":
					automobili[i] = new Karavan(proizvodjac, model, godiste, cena, broj_vrata, kubikaza, snaga_motora, masa, boja, km);
					break;
				default: 
					System.out.println("Izabrana je nepostojeca vrsta");
					continue;
			}
			i++;
			System.out.println("Nastaviti unos? (Da/Ne)");
			nastavak = unos.next();
			if (i > maks) {
				break;
			}
		}		
	}
	
	public void sviAutomobili() {
		if (automobili != null) {
			for (int i = 0; i < automobili.length; i++) {
				System.out.println(automobili[i].getProizvodjac());
				System.out.println(automobili[i].getModel());
				System.out.println(automobili[i].getGodiste());
				System.out.println(automobili[i].getCena());
			}
		}
	}
		
	public void ispisiAutomobileJeftinijeOd(int n) {
		if (automobili != null) {
			for (int i = 0; i < automobili.length; i++) {
				if (automobili[i] != null)
					if (automobili[i].getCena() < 5000) {
						System.out.println(automobili[i]);
					}
			}
		}
		else {
			System.out.println("Nema automobila na placu!");
		}
	}
	
	public void ispisUFajl(String fajl) throws IOException{
		if (automobili != null) {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fajl));
			for (int i = 0; i < automobili.length; i++) {
				if (automobili[i] != null)
					bw.write(automobili[i].toString());
			}	
			bw.close();
		}
	}
	
	public void saManjeKm(int n) {
		if (automobili != null) {
			for (int i = 0; i < automobili.length; i++) {
				if (automobili[i].getKm() < n) {
					System.out.println(automobili[i]);
				}
			}
		}
	}
}
