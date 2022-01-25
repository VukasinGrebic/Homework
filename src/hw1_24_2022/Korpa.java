package hw1_24_2022;

import java.util.ArrayList;

public class Korpa {
	ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}

	public Korpa() {
		this.ambalaze = new ArrayList<Ambalaza>();
	}

	public void dodajAmabalazu(Ambalaza ambalaza) {
		this.ambalaze.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < ambalaze.size(); i++) {
			if (ambalaze.get(i).getBarcode() == barkod) {
				this.ambalaze.remove(i);
			}
		}
	}

	private double cene(double popust) {
		double racun = 0;
		for (int i = 0; i < ambalaze.size(); i++) {
			racun += ambalaze.get(i).price();
		}
		return racun - popust;
	}

	public double ukupnaCena(SuperKartica superkartica) {
		return cene(superkartica.getPopust());
	}

	public void printAll(SuperKartica superkartica) {
		for (int i = 0; i < ambalaze.size(); i++) {
			ambalaze.get(i).print();
		}
		System.out.println("Ukupna cena je: " + ukupnaCena(superkartica));
		System.out.println();
	}

}

//Kreirati klasu Korpa koja ima:
//niz ambalaza
//metodu dodaj ambalazu
//metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
