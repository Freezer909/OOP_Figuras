package Uzd_5;

import javax.swing.JOptionPane;

import Uzd_1.MinkaTante;

public class OIzveide {
	
	static int cPIzvele() {
		if (Figuras.centraObjekti.size() < 1)
			return -1;
		else
		return Integer.parseInt(JOptionPane.showInputDialog(null, IzveidotieObjekti.izvadit(Figuras.centraObjekti)));
	}
	
	static void izveidotObjektu() {
		int x, y, cPNr;
		double p, a;
		
		int izvele = JOptionPane.showOptionDialog(null, 
		"Kuru objektu veidot?", "Izvēle", 
		JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
		null, Figuras.objektuPogas, Figuras.objektuPogas[0]);
		
		if (izvele == -1)
			izvele = 0;
		switch(izvele) {
		case 0:
			x = MinkaTante.skaitlaParbaude(
			"Ievadi centra punkta x koordinātas", -100, 100);
			y = MinkaTante.skaitlaParbaude(
			"Ievadi centra punkta y koordinātas", -100, 100);
			// Izveidot centra punkta objektu un ielikt dinamiskajā masīvā
			Figuras.centraObjekti.add(new Centrs(x, y));
			break;
			
		case 1:
			String[] ceIzvelesVeids = 
			{"Noklusējuma", "Centra punkts un malas"};
			
			String veids = (String)JOptionPane.showInputDialog(null, 
			"Izvēlies, kuru konstruktoru izsaukt", 
			"Četrstūra izveide", JOptionPane.QUESTION_MESSAGE, 
			null, ceIzvelesVeids, ceIzvelesVeids[0]);
			
			if(veids == null)
				veids = ceIzvelesVeids[0];
				
			switch (veids) {
			case "Noklusējuma":
				Figuras.cetrsturaObjekti.add(new Cetrsturis());
				break;
				
			case "Centra punkts un malas":
				cPNr = cPIzvele();
				if (cPNr == -1) {
					JOptionPane.showMessageDialog(null, "Nav uztaisīts centra punkts!", "Kļūda?", JOptionPane.ERROR_MESSAGE);
					break;
				}
				p = MinkaTante.skaitlaParbaude(
						"Ievadi četrstūra platumu", 1, 100);
				a = MinkaTante.skaitlaParbaude(
						"Ievadi četrstūra augstumu", 1, 100);
				Figuras.cetrsturaObjekti.add(new Cetrsturis(
						Figuras.centraObjekti.get(cPNr), p, a));
				break;
			}
			break;
		
		case 2:
			cPNr = cPIzvele();
			if (cPNr == -1) {
				JOptionPane.showMessageDialog(null, "Nav uztaisīts centra punkts!", "Kļūda?", JOptionPane.ERROR_MESSAGE);
				break;
			}
			int r = MinkaTante.skaitlaParbaude("Ievadi apļa radiusu", 1, 100);
			Figuras.aplaObjekti.add(new Aplis(Figuras.centraObjekti.get(cPNr), r));
			break;
			
		case 3:
			cPNr = cPIzvele();
			if (cPNr == -1) {
				JOptionPane.showMessageDialog(null, "Nav uztaisīts centra punkts!", "Kļūda?", JOptionPane.ERROR_MESSAGE);
				break;
			}
			int m1 = MinkaTante.skaitlaParbaude(
					"Ievadi trijstura pirmo malu", 1, 100);
			int m2 =MinkaTante.skaitlaParbaude(
					"Ievadi trijsturas otro malu", 1, 100);
			int m3 = MinkaTante.skaitlaParbaude(
					"Ievadi trijstura trešo malu", 1, 100);
			if(m1 == -1 || m2 == -1 || m3 == -1)
				break;
					Figuras.trijsturaObjekti.add(new Trijsturis(Figuras.centraObjekti.get(cPNr), m1, m2, m3));
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null,
			"Atgriežas uz galveno izvēlni!", "Paziņojums", 
			JOptionPane.INFORMATION_MESSAGE);
			break;	
		}
	}
}
