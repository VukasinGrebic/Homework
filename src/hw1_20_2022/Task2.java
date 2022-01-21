package hw1_20_2022;

public class Task2 {

	public static void main(String[] args) {
		Player player1 = new Player("NK", "0920305990", 1991, 7, true, "Front");
		
		
		Card card1 = new Card("Red");
		Card card2 = new Card("Yellow");
		Card card3 = new Card("Yellow");
		Card card4 = new Card("Red");
		player1.addCard(card1);
		player1.addCard(card2);
		player1.addCard(card3);
		player1.addCard(card4);
		player1.print();

	}

}

//Kreirati klasu Karton koja ima:
//tip kartona (crveni, zuti)
//konstuktore za koje mislite da ce vam trebati
//gettere i settere za karton
//	
//Kreirati klasu Osoba koja ima:
//ime i prezime
//jmbg
//godinu rodjenja
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere 
//metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//niz kartona
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu dodaj karton, gde se dodaje karton u niz
//metodu koja vraca broj zutih kartona
//metodu koja vraca broj crvenih kartona
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
