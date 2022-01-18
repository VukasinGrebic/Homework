package hw1_17_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter how many green card for exams you want to enter: ");
		int n = s.nextInt();

		ArrayList<GreenCard> greencards = new ArrayList<GreenCard>();

		for (int i = 0; i < n; i++) {
			
			System.out.print("Enter student's firstname and lastname: ");
			String student = s.next();
			System.out.print("Enter student's ID: ");
			String iD = s.next();
			System.out.print("Enter subject: ");
			String subject = s.next();
			System.out.print("Enter professor's firstname and lastname: ");
			String professor = s.next();
			System.out.print("Enter student's mark: ");
			int mark = s.nextInt();
			
			GreenCard a = new GreenCard(student, iD, subject, professor, mark);
			greencards.add(a);
		}
		
		for (int i = 0; i < greencards.size(); i++) {
			greencards.get(i).print();
		}

	}

}

//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta 
//broj indeksa 
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita