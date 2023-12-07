import java.io.IOException;
import java.util.Scanner;

public class Glavna {

    private static AutoPlac plac = new AutoPlac();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("|| Dobro dosli u sistem za upravljanje automobilima na auto placevima ||");
        pokreniProgram();
    }

    private static void pokreniProgram() throws IOException {
        System.out.println("Izaberite jednu od opcija za upravljanjem automobilima na placu: ");
        System.out.println("1 - Dodavanje novog automobila na plac: ");
        System.out.println("2 - Prikaz svih automobila trenutno na placu: ");
        System.out.println("3 - Prikaz svih automobila na placu jeftinijih od zadate cifre: ");
        System.out.println("4 - Prikaz svih automobila na placu sa kilometrazom manjom od zadate: ");
        System.out.println("5 - Cuvanje svih automobila u izabrani fajl: ");

        try {
            int opcija = Integer.parseInt(scan.nextLine());
            switch (opcija) {
                case 1:
                    plac.ucitajAutomobile();
                    break;
                case 2:
                    plac.sviAutomobili();
                    break;
                case 3:
                    System.out.println("Izaberite maksimalnu cenu: ");
                    int n = Integer.parseInt(scan.nextLine());
                    plac.ispisiAutomobileJeftinijeOd(n);
                    break;
                case 4:
                    System.out.println("Izaberite maksimalnu kilometrazu: ");
                    int x = Integer.parseInt(scan.nextLine());
                    plac.saManjeKm(x);
                    break;
                case 5:
                    System.out.println("Ime fajla za cuvanje: ");
                    String s = scan.nextLine();
                    plac.ispisUFajl(s);
                    break;
                default:
                    System.out.println("Nevažeća opcija");
                    break;
            }

            System.out.println("Nastaviti sa programom (Da/Ne)");
            String nastavak = scan.nextLine();
            if (nastavak.equalsIgnoreCase("Da")) {
                pokreniProgram();
            }
        } catch (NumberFormatException e) {
            System.out.println("Nevažeći unos. Molimo unesite broj.");
            pokreniProgram();
        }
    }
}