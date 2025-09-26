package Uzd_5;

import javax.swing.JOptionPane;

import Uzd_1.MinkaTante;

public class OIzveide {
	
	static void izveidotObjektu() {
	int x, y, cPnr;
	Double p, a;
	
	int izvele = JOptionPane.showOptionDialog(null, "Kuru objektu veidot?", "Izvēle", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Figuras.objektuPogas, Figuras.objektuPogas[0]);
		if(izvele == -1)
			izvele = 0;
	
		switch(izvele) {
		case 0:
			x = MinkaTante.skaitlaParbaude("Ievadi centra punkta x koordinātas", -100, 100);
			y = MinkaTante.skaitlaParbaude("Ievadi centra punkta x koordinātas", -100, 100);
			//izvidot centra punkta objektu un ieliktu masīvā
			Figuras.centraObjekti.add(new Centrs(x,y));
			break;
			
		case 1:
			String[] ceIzvelesVeids = {"Noklusējuma", "Centra punkts un malas"};
			
			String veids = (String) JOptionPane.showInputDialog(null, "Izvēlies, kuru konstruktoru izsaukt", "Četrstura izveide", JOptionPane.QUESTION_MESSAGE, null, ceIzvelesVeids, ceIzvelesVeids[0]);
			
			if(veids == null)
				veids = ceIzvelesVeids[0];
			switch (veids) {
			case "Noklusējuma":
				Figuras.CetrsturaObjekti.add(new Cetrsturis());
				break;
				
			case "Centra punkts un malas":
				cPnr = 0;
				p = MinkaTante.skaitlaParbaude("Ievadi četrstūra platumu", 1, 100);
				a = MinkaTante.skaitlaParbaude("Ievadi četrstūra augstumu", 1, 100);
				Figuras.centraObjekti.add(new Cetrsturis(Figuras.centraObjekti.get(cPnr), p, a));
				break;
				
			}
			break;
		
		case 4:
			JOptionPane.showMessageDialog(null, "Atgriežas uz galveno izvēlni", "Info", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	
}
