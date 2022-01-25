package hw1_24_2022;

public class SuperKartica {
	private String id;
	private String owner;
	private double popust;

	public SuperKartica() {

	}

	public SuperKartica(String id, String owner, double popust) {
		super();
		this.id = id;
		this.owner = owner;
		this.popust = popust;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}

	public void print() {
		System.out.println(this.id + ", " + this.owner);
		System.out.println();
	}

}

//
//Kreirati klasu SuperKartica koja ima:
//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere 
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)
