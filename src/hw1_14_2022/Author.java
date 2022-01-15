package hw1_14_2022;

public class Author {
	private String fName;
	private String lName;

	public Author(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getFName() {
		return this.fName;
	}
	
	public void setLName(String lName) {
		this.lName = lName;
	}

	public String getLName() {
		return this.lName;
	}

	public void print() {
		System.out.print(this.fName + " " + this.lName);
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
