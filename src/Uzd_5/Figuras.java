package Uzd_5;
import Uzd_1.MinkaTante;

public class Figuras {

	public static void main(String[] args) {
		/*//Izveido Centrs objektu
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
		aplis1.rLaukums()+"\nC = "+aplis1.RLinijasGarums());*/
		int cObjSk = 
				MinkaTante.skaitlaParbaude("Cik centra objektus glabāsi", 1, 99);
		if(cObjSk == -1)
			cObjSk = 1;
		Centrs[] centraObjekti = new Centrs[cObjSk];
		
		int ceObjSk = 
				MinkaTante.skaitlaParbaude("Cik četrstūra objektus glabāsi", 1, 99);
		if(ceObjSk == -1)
			ceObjSk = 1;
		Centrs[] centrsturaObjekti = new Centrs[ceObjSk];
		int aObjSk = 
				MinkaTante.skaitlaParbaude("Cik apļa objektus glabāsi", 1, 99);
		if(aObjSk == -1)
			aObjSk = 1;
		Centrs[] aplaObjekti = new Centrs[aObjSk];
		int tObjSk = 
				MinkaTante.skaitlaParbaude("Cik trijstūra objektus glabāsi", 1, 99);
		if(tObjSk == -1)
			tObjSk = 1;
		Centrs[] trijsturabjekti = new Centrs[tObjSk];
		
	}

}
