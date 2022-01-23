package hw1_21_2022;

public class Menadzer extends Radnik {

	public Menadzer(String name) {
		super(name);
	}

	@Override
	public double Salary() {
		double summ = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			summ = summ + this.sektori.get(i).getSalary();
		}
		return summ;

	}

}

//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//suma plata svih sektor / broj sektora * 0.5
//override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog