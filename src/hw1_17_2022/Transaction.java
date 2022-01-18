package hw1_17_2022;

public class Transaction {
	
	private String transactionID;
	private Account sender;
	private Account receiver;
	
	public String getTransaction() {
		return this.transactionID;
	}
	public void setTransaction(String transactionID) {
		this.transactionID = transactionID;
	}
	public Account getSender() {
		return this.sender;
	}
	public void setSender(Account sender) {
		this.sender = sender;
	}
	public Account getReceiver() {
		return this.receiver;
	}
	public void setReceiver(Account receiver) {
		this.receiver = receiver;
	}
	
	public Transaction (String transactionID, Account sender, Account receiver) {
		this.transactionID = transactionID;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	private double provision (int money) {
		return money<4500 ? 45:0.01; 
	}
	
	public void transaction (int money) {
		if (provision(money) == 45) {
			this.sender.changeBalance((-money - provision(money)));
			this.receiver.changeBalance(money);
		} else if (provision(money) == 0.01) {
			this.sender.changeBalance((-money-(money * 0.01)));
			this.receiver.changeBalance(money);
		}
		
	}

}


//		Kreirati klasu Transakcija koja ima:
//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
//gettere i settere
//konstruktore
//privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//ako je prenos sredstava manji od 4500, provizija je fiksna 45
//ako je prenos sredstava veci od 4500, provizija je 1% 
//S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna
//
//	Naravno u glavnom kreirati objekte i testirati funkcionalnosti 
