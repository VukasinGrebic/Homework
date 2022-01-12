package hw1_11_2022;

public class SmartAirConditioning {
	String marka;
	double energyCool;
	double energyHeat;
	double temperature;
	boolean mode;

	public void print() {
		System.out.println(marka + " - " + mode + " - " + temperature);
		System.out.println("Energy consumption for this month is: " + this.cost() + " RSD");
	}

	public double potrosnja() {
		if (mode) {
			return 30 * 15 * energyHeat;
		} else {
			return 30 * 15 * energyCool;
		}
	}

	public double cost() {
		if (potrosnja() <= 350) {
			return potrosnja() * 6;
		} else {
			return (350 * 6) + ((potrosnja() - 350) * 9);
		}
	}

}

//
//Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//atribut za mod (hladi/greje)
//metodu za stampu - stampa u formatu 
//marka - mod - termperatura
//metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//metodu koja racuna koliko klima novca potrosi za mesec dana
//Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//Metoda vraca ukupnu cenu za taj mesec
//
//U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
