package hw1_13_2022;

public class FacebookPost {
	private String author;
	private String postedWall;
	private String text;
	private int likes;
	private int shares;

	public FacebookPost(String author, String postedWall, String text) {
		this.author = author;
		this.postedWall = postedWall;
		this.text = text;

	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setPostedWall(String postedWall) {
		this.postedWall = postedWall;
	}

	public String getPostedWall() {
		return this.postedWall;
	}

	public void setText(String Text) {
		this.text = Text;
	}

	public String getText() {
		return this.text;
	}

	public int getLikes() {
		return this.likes;
	}

	public int getShares() {
		return this.shares;
	}

	public void like() {
		this.likes = this.likes + 1;
	}

	public void dislike() {
		if (this.likes > 0) {
			this.likes = this.likes - 1;
		}

	}

	public void share() {
		this.shares = this.shares + 1;
	}

	public void print() {
		System.out.println(this.author + " >>> " + this.postedWall);
		System.out.println(this.text);
		System.out.println("Likes " + this.likes + " | " + "Shares " + this.shares);
		System.out.println();
	}
}

//Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	  Od gettera i settera:
//	korisnik moze da procita bilo koji atribut 
//	ali ne moze da menja broj lajkova i broj deljenja (nemamo settere za ove atribute)
//	 Konstruktore:
//		konstruktori koji su potrebni i logicni
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//	Primer stampanja:
//	Milan Jovanovic >>> Pera Peric
//	Ovo je tekst objave
//	Likes 3 | Shares 1
