package hw1_14_2022;

public class Task1 {

	public static void main(String[] args) {
		Author a = new Author("Robert", "Anton Wilson");
		Book a1 = new Book("9780941404198", "Prometheus rising", 1983, a);
		a1.print();
		
		Author b = new Author ("Baruch", "Spinoza");
		Book b1 = new Book("9780915145195", "Ethics", 1677, b);
		b1.print();
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
