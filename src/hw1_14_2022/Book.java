package hw1_14_2022;

public class Book {
	private String iSBN;
	private String name;
	private int yearOR;
	private Author author;

	public Book(String iSBN, String name, int yearOR, Author author) {
		this.author = author;
		this.iSBN = iSBN;
		this.name = name;
		this.yearOR = yearOR;
		this.author = author;
	}

	public void setISBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public String getISBN() {
		return this.iSBN;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setYearOR(int yearOR) {
		this.yearOR = yearOR;
	}

	public int getYearOR() {
		return this.yearOR;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void print() {
		System.out.println(this.iSBN);
		System.out.println(this.name + " - " + this.yearOR);
		System.out.print("Author: ");
		this.author.print();
		System.out.println();
		System.out.println();
	}

}

//Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//(ime autora) (prezime autora)
//
//Kreirati klasu Knjiga koji ima:
//-ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//(ISBN)
//(naziv) - (godina izdanja)
//autor: (ime autora) (prezime autora) 
//
//	U glavnom programu napraviti vise autora sa vise knjiga.