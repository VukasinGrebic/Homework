package hw1_20_2022;

public class Player extends Person {
	private int number;
	private String position;
	private boolean isCaptain;

	public Player() {
		super();
	}

	public Player(String name, String id, int yearOB, int number, boolean isCaptain, String position) {
		super(name, id, yearOB);
		this.number = number;
		this.isCaptain = isCaptain;
		this.position = position;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean isCaptain() {
		return isCaptain;
	}

	public void setIsCaptain(boolean isCaptain) {
		this.isCaptain = isCaptain;
	}

	public void print () {
		super.print();
		System.out.println(this.number + ", " + this.position);
		if (isCaptain) {
			System.out.println("Captain");
		} else {
			System.out.println("Player");
		}
		System.out.println();
	}
}

//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//broj (broj koji igrac nosi)
//poziciju koju igra (odbrambeni, napadac, … )
//kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//default-ni konstuktor
//konstuktor sa parametrima
//gettere i settere za broj, kapiten i poziciju
//metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu