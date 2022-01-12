package hw1_11_2022;

public class Task3 {

	public static void main(String[] args) {
		FacebookPost a = new FacebookPost ();
		a.author = "John D.";
		a.postedWall = "S. Smith";
		a.text = "Whatss upp?";
		a.likes = 1;
		a.shares = 0;
		
		a.like();
		a.dislike();
		a.dislike();
		a.dislike();
		a.share();
		a.share();
		a.print();
		
		FacebookPost b = new FacebookPost ();
		b.author = "D. D.";
		b.postedWall = "S. S.";
		b.text = "Can you see it?";
		b.likes = 15;
		b.shares = 19;
		
		b.like();
		b.like();
		b.like();
		b.dislike();
		b.share();
		b.share();
		b.print();

	}

}

//Kreirati klasu FacebookPost koja ima:
//Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//Primer stampanja:
//Milan Jovanovic >>> Pera Peric
//Ovo je tekst objave
//Likes 3 | Shares 1
