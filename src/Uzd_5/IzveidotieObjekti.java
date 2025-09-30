package Uzd_5;

import java.util.ArrayList;

public class IzveidotieObjekti {

	static String izvadit(ArrayList<Centrs> centruSaraksts) {
		String str = " ";
		for(int i=0; i<centruSaraksts.size(); i++) {
			str += i+". objekts "+centruSaraksts.get(i).izvaditKordinatas()+"\n";
		}
		return str;
	}

	static String izvaditC(ArrayList<Cetrsturis> centruSaraksts) {
		String str = " ";
		for(int i=0; i<centruSaraksts.size(); i++) {
			str += i+". objekts "+centruSaraksts.get(i).izvaditCetrsturaInfo()+"Atrodas: "+centruSaraksts.get(i).punkts.izvaditKordinatas()+"\n";
		}
		return str;
	}
	
	static String izvaditA(ArrayList<Aplis> centruSaraksts) {
		String str = " ";
		for(int i=0; i<centruSaraksts.size(); i++) {
			str += i+". objekts "+centruSaraksts.get(i).izvadiAplaInfo()+"Atrodas: "+centruSaraksts.get(i).punkts.izvaditKordinatas()+"\n";
		}
		return str;
	}
	
	static String izvaditT(ArrayList<Trijsturis> centruSaraksts) {
		String str = " ";
		for(int i=0; i<centruSaraksts.size(); i++) {
			str += i+". objekts "+centruSaraksts.get(i).izvaditTrijsturaInfo()+"Atrodas: "+centruSaraksts.get(i).punkts.izvaditKordinatas()+"\n";
		}
		return str;
	}


}
