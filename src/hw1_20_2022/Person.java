package hw1_20_2022;

public class Person {
	protected String name;
	protected String id;
	protected int yearOB;

	public Person() {

	}

	public Person(String name, String id, int yearOB) {
		this.name = name;
		this.id = id;
		this.yearOB = yearOB;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getYearOB() {
		return this.yearOB;
	}

	public void setYearOB(int yearOB) {
		this.yearOB = yearOB;
	}

	public void print() {
		System.out.println(this.name + ", " + this.id + ", " + this.yearOB);
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
