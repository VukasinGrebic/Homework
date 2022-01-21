package hw1_20_2022;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter how many players and coaches you want: ");
		int n = s.nextInt();
		Player[] players = new Player[n];
		Coach[] coaches = new Coach[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name:");
			String name = s.next();
			System.out.print("Enter id:");
			String id = s.next();
			System.out.print("Enter year of birth:");
			int yearOB = s.nextInt();
			System.out.print("Enter players number:");
			int number = s.nextInt();
			System.out.print("Is he captain? True/False");
			boolean isCaptain = s.nextBoolean();
			System.out.print("Position:");
			String position = s.next();
			players[i] = new Player(name, id, yearOB, number, isCaptain, position);

		}

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name:");
			String name = s.next();
			System.out.print("Enter id:");
			String id = s.next();
			System.out.print("Enter year of birth:");
			int yearOB = s.nextInt();
			System.out.print("Enter years of experience:");
			int yearsOE = s.nextInt();
			System.out.print("Enter type:");
			String type = s.next();
			coaches[i] = new Coach(name, id, yearOB, yearsOE, type);

		}

		for (int i = 0; i < n; i++) {
			players[i].print();
			coaches[i].print();

		}

//		Player player1 = new Player("JD", "9302930293", 1998, 8, true, "Front");
//		Player player2 = new Player("KM", "0940930402", 1996, 3, false, "Back");
//		Coach coach1 = new Coach("MM", "9302930233", 1975, 5, "Personal coach");
//		Coach coach2 = new Coach("NS", "8923892389", 1966, 15, "Strength coach");

//		player1.print();
//		player2.print();
//		coach1.print();
//		coach2.print();

	}

}

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
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. 
//Podatke za igrace i trenere unosi korisnik sa tastature.
