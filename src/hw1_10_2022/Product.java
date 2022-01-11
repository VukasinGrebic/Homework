package hw1_10_2022;

public class Product {
	String name;
	double price;
	double mass;
	
	public void print () {
		System.out.println("{{" + this.name + "}}, " + "{{" + this.price + " $ }}, " + "{{" + this.mass + " g }}");
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
