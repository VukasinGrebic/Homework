package hw1_10_2022;

public class SmartAirConditioning {
	String brand;
	int temperature;
	String mode;
	
	public void print () {
		System.out.println(brand + " - " + temperature + " C " + mode);
	}

}

//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//atribut za mod (hladi/greje)
//metodu za stampu - stampa u formatu 
//
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metodu za stampu
