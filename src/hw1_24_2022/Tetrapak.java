package hw1_24_2022;

public class Tetrapak extends Ambalaza {
	private boolean isRecyclable;
	private double price;

	public Tetrapak() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tetrapak(String barcode, String name, double netoMass, double brutoMass, boolean recyclable, double price) {
		super(barcode, name, netoMass, brutoMass);
		this.isRecyclable = recyclable;
		this.price = price;
	}

	public boolean isRecyclable() {
		return isRecyclable;
	}

	public void setRecyclable(boolean isRecyclable) {
		this.isRecyclable = isRecyclable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public double price() {
		return this.isRecyclable ? packageWeight() * 1.5 + this.price : this.price;

	}

	@Override
	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + price());
		System.out.println("Recyclable: " + isRecyclable);
		System.out.println();

	}

}

//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.