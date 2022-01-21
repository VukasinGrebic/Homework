package hw1_20_2022;

public class Coach extends Person {
	private int yearsOE;
	private String type;

	public Coach() {
		super();

	}

	public Coach(String name, String id, int yearOB, int yearsOE, String type) {
		super(name, id, yearOB);
		this.yearsOE = yearsOE;
		this.type = type;
	}

	public int getYearsOE() {
		return yearsOE;
	}

	public void setYearsOE(int yearsOE) {
		this.yearsOE = yearsOE;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void print() {
		super.print();
		System.out.println(this.yearsOE + ", " + this.type);
		System.out.println();
	}

}

//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//godine iskustva
//tip trenera (kondicioni, za igru, pomocni, personalni)
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
