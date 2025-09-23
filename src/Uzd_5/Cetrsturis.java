package Uzd_5;

public class Cetrsturis {
	public double platums, augstums;
	public Centrs punkts;
	
	//KONSTRUKTORA PARSLOGOŠANA
	public Cetrsturis() {
		punkts = new Centrs (0, 0);
	}
	
	public Cetrsturis(Centrs punkts, double p, double a) {
		this.punkts = punkts;
		platums = p;
		augstums = a;
	}
	
	public String izvaditCetrsturaInfo() {
		return"Platums: "+platums+"cm augstums: "+augstums+"cm";
	}
	
	//Uztaisīt metodi, kas apreiķina laukumu
	public double cLaukums() {
		return platums*augstums;
	}
	
}
