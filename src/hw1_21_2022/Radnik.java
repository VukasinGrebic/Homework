package hw1_21_2022;

import java.util.ArrayList;

public abstract class Radnik {
	protected String name;
	ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

	public Radnik(String name) {
		super();
		this.name = name;
		this.sektori = new ArrayList<Sektor>();
	}

	public abstract double Salary();

	public void zaposli(Sektor sektor) {
		this.sektori.add(sektor);
	}
	
	public void print () {
		System.out.println("Name: " + this.name + " Salary: " + Salary());
	}

}

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