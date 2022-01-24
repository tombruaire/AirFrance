package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VuePAV;

public class AirFrance {
	
	public static void tableauBord () {
		ArrayList<PAV> lesPAVs = Modele.selectAllPAV();
		VuePAV.afficherPAV(lesPAVs);
	}
	
	public static void menuGeneral () {
		int choix = 0;
		do {
			System.out.println("__________ MENU AIR FRANCE __________");
			System.out.println("-------------------------------------");
			System.out.println("1 - Gérer les pilotes");
			System.out.println("2 - Gérer les avions");
			System.out.println("3 - Gérer les vols");
			System.out.println("4 - Statistiques");
			System.out.println("5 - Tableau de bord");
			System.out.println("0 - Quitter le menu");
			System.out.println("Votre choix : ");
			choix = Console.saisirInt();
			switch (choix) {
				case 1 : C_Pilote.menuPilote(); break;
				case 2 : C_Avion.menuAvion(); break;
				case 3 : C_Vol.menuVol(); break;
				case 4 :
					C_Pilote.count();
					C_Avion.count();
					C_Vol.count();
					break;
				case 5 : tableauBord(); break;
			}
		} while (choix != 0);
	}

	public static void main(String[] args) {
		menuGeneral();
	}

}
