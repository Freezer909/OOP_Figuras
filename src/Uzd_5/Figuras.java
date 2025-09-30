package Uzd_5;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Uzd_1.MinkaTante;

public class Figuras {
	static ArrayList<Centrs> centraObjekti = new ArrayList<>();
	static ArrayList<Cetrsturis> cetrsturaObjekti = new ArrayList<>();
	static ArrayList<Aplis> aplaObjekti = new ArrayList<>();
	static ArrayList<Trijsturis> trijsturaObjekti = new ArrayList<>();
	
	static String[] objektuPogas = {"Centrs", "Četrstūris", "Aplis", 
			"Trijstūris", "Atgriezties"};
	

	public static void main(String[] args) {
		/*// izveido Centrs objektu
		Centrs centraP1 = new Centrs(-10, 12);
		System.out.println(centraP1.izvaditKoordinatas());
		centraP1.parvietot(5, -2);
		System.out.println(centraP1.izvaditKoordinatas());
		
		// izveido Cetrsturis objektu
		Cetrsturis cetrsturis1 = new Cetrsturis();
		System.out.println(cetrsturis1.izvaditCetrsturaInfo());
		// izvadīt šī četrstūra atrašanās vietu
		System.out.println(cetrsturis1.punkts.izvaditKoordinatas());
		
		Cetrsturis cetrsturis2 = new Cetrsturis(centraP1, 5, 11);
		System.out.println(cetrsturis2.izvaditCetrsturaInfo()+"\n"+
				cetrsturis2.punkts.izvaditKoordinatas()+
				"\ns = "+cetrsturis2.cLaukums());
		
		Centrs punkts2 = new Centrs (5, 23);
		Aplis aplis1 = new Aplis(punkts2, 5);
		System.out.println(aplis1.izvaditAplaInfo()+"\n"+
		"s = "+aplis1.rLaukums()+"\n"+
			"c = "+ aplis1.rLGarums());
			*/
		int izvele, poga;
		
		do {
			izvele = MinkaTante.skaitlaParbaude(
					"Ko vēlies darīt?\n"
					+ "0 - Apturēt\n"
					+ "1 - Izveidot objektu\n"
					+ "2 - Aplūkot objektus\n"
					+ "3 - Izsaukt metodi", 0, 3);
			if (izvele == -1)
				izvele = 0;
			
			switch (izvele) {
			case 0:
				JOptionPane.showMessageDialog(null,
				"Programma apturēta!", "Paziņojums", 
				JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 1:
				OIzveide.izveidotObjektu();
				break;
				
			case 2:
				poga = JOptionPane.showOptionDialog(null, "Kuras figūras aplūkot?", "Izvēle", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, objektuPogas, objektuPogas[0]);
				
				switch(poga) {
				case 0:
					if(centraObjekti.size()<1) {
						JOptionPane.showMessageDialog(null, "Nav neviens centra punkts!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
						break;
					}
					JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvadit(centraObjekti), "Centra punkti", JOptionPane.PLAIN_MESSAGE);
					break;
				case 1:
					if(cetrsturaObjekti.size()<1) {
						JOptionPane.showMessageDialog(null, "Nav neviens četrsturis!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
						break;
						
					}
					JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvaditC(cetrsturaObjekti), "Četrstura objekti", JOptionPane.PLAIN_MESSAGE);
					break;
					
				case 2:
					if(aplaObjekti.size()<1) {
						JOptionPane.showMessageDialog(null, "Nav neviens aplis!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
						break;
						
					}
					JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvaditA(aplaObjekti), "Apla objekti", JOptionPane.PLAIN_MESSAGE);
					break;
					
				case 3:
					if(trijsturaObjekti.size()<1) {
						JOptionPane.showMessageDialog(null, "Nav neviens trijstūris!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
						break;
						
					}
					JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvaditT(trijsturaObjekti), "Trijstura objekti", JOptionPane.PLAIN_MESSAGE);
					break;
					
				}
				break;
				
			}
		} while (izvele != 0);
		
	}
}