package hw1_18_2022;

import java.util.ArrayList;

public class Student {
	private String indexID;
	private String name;
	private String studyType;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	public Student(String indexID, String name, String studyType) {
		this.indexID = indexID;
		this.name = name;
		this.studyType = studyType;
		this.ispiti = new ArrayList<Ispit>();
	}

	public String getIndexID() {
		return this.indexID;
	}

	public void setIndexID(String indexID) {
		this.indexID = indexID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getStudyType() {
		return this.studyType;
	}
	
	public void setStudyType (String studyType) {
		this.studyType = studyType;
	}

	public ArrayList<Ispit> getIspiti() {
		return this.ispiti;
	}
	
	public void addIspit (Ispit ispit) {
		this.ispiti.add(ispit);
	}
	
	private double average () {
		double summ = 0;
		int counter = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (this.ispiti.get(i).isPass()) {
				summ = summ + this.ispiti.get(i).getMark();
				counter = counter + 1;
			}
		}
		return summ = summ/counter;
	}
	public void print () {
		
		System.out.println(this.indexID + " - " + this.name + " - " + this.studyType);
		System.out.println("Predmeti:");
		for (int i = 0; i < ispiti.size(); i++) {
			this.ispiti.get(i).print();
		}
		System.out.println("Average mark: " + average());
		System.out.println();
	}
	
	

}

//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)