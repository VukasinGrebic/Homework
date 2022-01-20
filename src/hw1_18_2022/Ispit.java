package hw1_18_2022;

public class Ispit {

	private String name;
	private double mark;
	private String professor;

	public Ispit(String name, double mark, String professor) {
		this.name = name;
		this.mark = mark;
		this.professor = professor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return this.mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public String getProfessor() {
		return this.professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public boolean isPass () {
		return this.mark<=10 && this.mark>=6;
	}
	
	public void print () {
		System.out.println(this.name + " - " + this.professor + " - " + this.mark );
	}
}

//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)