package hw1_10_2022;



public class Task2 {

	public static void main(String[] args) {
	
		
		SmartAirConditioning a = new SmartAirConditioning ();
		a.brand = "Samsung";
		a.temperature = 16;
		a.mode = "Cool";
		a.print();
		
		SmartAirConditioning b = new SmartAirConditioning ();
		b.brand = "Vox";
		b.temperature = 29;
		b.mode = "Heat";
		b.print();
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
