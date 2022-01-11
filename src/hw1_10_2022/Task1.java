package hw1_10_2022;

public class Task1 {

	public static void main(String[] args) {
		
		Product a = new Product ();
		a.name = "Hat";
		a.price = 3.99;
		a.mass = 159.4;
		a.print();
		
		Product b = new Product ();
		b.name = "Shoes";
		b.price = 92.99;
		b.mass = 319.8;
		b.print();

	}

}

//Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.
