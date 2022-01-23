package hw1_21_2022;

public class Magacioner extends Radnik {

	public Magacioner(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	private double avgSalary () {
		double summ = 0;
		double counter = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			summ = summ + this.sektori.get(i).getSalary();
			counter = counter + 1;
		}
		return summ/counter*0.5;
	}

	@Override
	public double Salary() {
		double counter = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			counter = counter + 1;
		}
		return avgSalary() * counter;
	}
	

}

//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//suma plata svih sektor / broj sektora * 0.5
//override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog