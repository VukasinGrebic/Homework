package hw1_24_2022;

public abstract class Ambalaza {
	protected String barcode;
	protected String name;
	protected double netoMass;
	protected double brutoMass;

	public Ambalaza() {

	}

	public Ambalaza(String barcode, String name, double netoMass, double brutoMass) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.netoMass = netoMass;
		this.brutoMass = brutoMass;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetoMass() {
		return netoMass;
	}

	public void setNetoMass(double netoMass) {
		this.netoMass = netoMass;
	}

	public double getBrutoMass() {
		return brutoMass;
	}

	public void setBrutoMass(double brutoMass) {
		this.brutoMass = brutoMass;
	}

	public double packageWeight() {
		return this.brutoMass - this.netoMass;
	}

	public abstract double price();

	public abstract void print();

}

//Kreirati abstraktnu klasu Ambalaza koja ima:
//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//abstraktnu metodu koja vraca cenu artikla
//abstraktnu metodu stampaj
//
