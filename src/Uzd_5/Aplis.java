package Uzd_5;

public class Aplis {
	public Centrs punkts;
	public double radiuss;
	
	//KONSTRUKTORS
	public Aplis (Centrs p, double r) {
		punkts = p;
		radiuss =r;
	}
	
	public String izvadiAplaInfo() {
		return"Radiuss: "+radiuss;
	}
	//Izveido metodi riņķa līnijas apreiķināšanai
	public double RLinijasApr() {
		double C;
		C =2*Math.PI*radiuss;
		
		return Math.round(C*100.0)/100.0;
	}
	//Riņķa laukum apreiķināšanai
	public double rLaukums() {
		double S;
		S = Math.PI*Math.pow(radiuss, 2);
		return Math.round(S*100.0)/100.0;
	}
}
