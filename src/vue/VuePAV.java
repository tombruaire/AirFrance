package vue;

import java.util.ArrayList;

import controleur.PAV;

public class VuePAV {
	
	public static void afficherPAV (ArrayList<PAV> lesPAVs) {
		System.out.println("__________ TABLEAU DE BORD __________");
		System.out.println("|     NOM     |     Prénom     |     Avion     |     Vol     |     Date     |     Heure     |");
		for (PAV unPAV : lesPAVs) {
			System.out.println("|     " + unPAV.getNom() + "     |     " + unPAV.getPrenom() + "     |     " + unPAV.getAvion() + "     |     " + unPAV.getVol() + "     |     " + unPAV.getDatevol() + "     |     " + unPAV.getHeurevol());
			System.out.println("");
		}
	}

}
