package Uzd_5;

public class Figuras {

	public static void main(String[] args) {
		//Izveido Centrs objektu
		Centrs centraP1 = new Centrs(-10, 12);
		System.out.println(centraP1.izvaditKordinatas());
		centraP1.parvietot(5, -2);
		System.out.println(centraP1.izvaditKordinatas());
		
		//Izveido Centrsturis objektu
		Cetrsturis cetrsturis1 = new Cetrsturis();
		System.out.println(cetrsturis1.izvaditCetrsturaInfo());
		//Izvadīt ši četrstūra atrašanās vietu
		System.out.println(cetrsturis1.punkts.izvaditKordinatas());
		
		
		Cetrsturis cetrsturis2 = new Cetrsturis(centraP1, 5, 11);
		System.out.println(cetrsturis2.izvaditCetrsturaInfo()
				+"\n"+cetrsturis2.punkts.izvaditKordinatas()
				+"\nS = "+cetrsturis2.cLaukums());
		
		Centrs punkts2 = new Centrs (5, 23);
		Aplis aplis1 = new Aplis(punkts2, 5);
		System.out.println(aplis1.izvadiAplaInfo()+"\nS = "+
		aplis1.rLaukums()+"\nC = "+aplis1.RLinijasGarums());
	}

}
