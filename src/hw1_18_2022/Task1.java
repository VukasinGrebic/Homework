package hw1_18_2022;

public class Task1 {

	public static void main(String[] args) {
		Ispit a1 = new Ispit("Molecular Biology", 9, "John Smith");
		Ispit a2 = new Ispit("Biochemistry", 10, "John D");
		Ispit a3 = new Ispit("Statistics 101", 5, "J D");
		Ispit a4 = new Ispit("Biology", 7, "J S");

		Student b1 = new Student("262/17", "Milos Markovic", "undergrad");
		Student b2 = new Student("242/17", "Marko Stanic", "undergrad");
		b1.addIspit(a1);
		b1.addIspit(a2);
		b1.addIspit(a3);
		b1.addIspit(a4);
		b2.addIspit(a2);
		b2.addIspit(a4);
		b2.addIspit(a3);
		b1.print();
		b2.print();

	}

}

//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
