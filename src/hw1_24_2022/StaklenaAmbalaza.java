package hw1_24_2022;

public class StaklenaAmbalaza extends Ambalaza {
	private double kaucija;
	private boolean jeKaucija;
	private double price;

	public StaklenaAmbalaza() {
		super();

	}

	public StaklenaAmbalaza(String barcode, String name, double netoMass, double brutoMass, double kaucija,
			boolean jeKaucija, double price) {
		super(barcode, name, netoMass, brutoMass);
		this.kaucija = kaucija;
		this.jeKaucija = jeKaucija;
		this.price = price;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isJeKaucija() {
		return jeKaucija;
	}

	public void setJeKaucija(boolean jeKaucija) {
		this.jeKaucija = jeKaucija;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double price() {
		return jeKaucija ? this.price * 1.2 + this.kaucija : this.price * 1.2;
	}

	@Override
	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Kaucija: " + this.jeKaucija);
		System.out.println("Cena kaucije: " + this.kaucija);
		System.out.println("Price: " + price());
		System.out.println();

	}

}
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.