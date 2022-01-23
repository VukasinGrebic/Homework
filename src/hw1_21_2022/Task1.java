package hw1_21_2022;

public class Task1 {

	public static void main(String[] args) {
		Magacioner magacioner = new Magacioner("Marko Nikolic");
		Menadzer menadzer = new Menadzer("Milos Markovic");
		Sektor a = new Sektor("Technical support", 50000);
		Sektor a1 = new Sektor("HR", 80000);
		Sektor a2 = new Sektor("QA", 60000);
		magacioner.zaposli(a);
		magacioner.zaposli(a2);
		menadzer.zaposli(a1);
		menadzer.zaposli(a2);
		magacioner.print();
		menadzer.print();

	}

}

//Kreirati klasu Sektor koja ima:
//naziv sektora
//platu koja je za taj sektor
//
//Kreirati abstraktnu klasu Radnik koja ima:
//ime i prezime
//niz sektora u kojima radi
//abstraktnu metodu koja vraca platu radnika
//metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//suma plata svih sektor / broj sektora * 0.5
//override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog
