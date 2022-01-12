package hw1_11_2022;

public class Product {
	String name;
	double price;
	double mass;

	public void print() {
		System.out.println("Name: " + name + ", Price: " + price + " RSD, Mass: " + mass + "g " + "Postage:" + this.postage() + " RSD ");
		System.out.println();
	}

	public void upPrice(double up) {
		this.price = this.price + up;
	}

	public double discountPrice(double discount) {
		return this.price * (100 - discount) / 100;
	}

	public double postage() {

		if (mass <= 100) {
			return 200;
		} else if (mass <= 500) {
			return 400;
		} else {
			return 1000;
		}
	}

}

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. 
//Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, 
//a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
//Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
