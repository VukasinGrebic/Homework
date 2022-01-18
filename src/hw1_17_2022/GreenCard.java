package hw1_17_2022;

public class GreenCard {
	private String student;
	private String iD;
	private String subject;
	private String professor;
	private int mark;
	public String getStudent() {
		return this.student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	public String getiD() {
		return this.iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getProfessor() {
		return this.professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getMark() {
		return this.mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public GreenCard (String student, String iD, String subject, String professor, int mark) {
		this.student = student;
		this.iD = iD;
		this.subject = subject;
		this.professor = professor;
		this.mark = mark;
	}
	
	public boolean isPass () {
		return getMark()>5;
	}
	
	public void print () {
		System.out.println(this.subject + " - " + this.mark);
		System.out.println("Student: " + this.student + ", " + this.iD);
		System.out.println("Professor: " + this.professor);
		System.out.println();
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