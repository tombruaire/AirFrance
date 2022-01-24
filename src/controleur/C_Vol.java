package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VueVol;

public class C_Vol {
	
	public static void insertVol () {
		Vol unVol = VueVol.saisirVol();
		Modele.insertVol(unVol);
	}
	
	public static void afficherLesVols () {
		ArrayList<Vol> lesVols = Modele.selectAllVols();
		System.out.println("__________ LISTE DES VOLS __________");
		for (Vol unVol : lesVols) { 
			VueVol.afficherVol(unVol);
		}
	}
	
	public static void deleteVol () {
		int idvol = VueVol.saisirId();
		Modele.deleteVol(idvol);
	}
	
	public static void modifierVol () {
		int idvol = VueVol.saisirId();
		Vol unVol = Modele.selectWhereVol(idvol);
		if (unVol != null) {
			VueVol.modifierVol(unVol);
			Modele.updateVol(unVol);
		}
	}
	
	public static void count () {
		int nb;
		nb = Modele.countVols();
		System.out.println("Le nombre de vols est de :" + nb);
	}
	
	public static void menuVol () {
		int choix = 0;
		do {
			System.out.println("__________ MENU VOL __________");
			System.out.println("------------------------------");
			System.out.println("1 - Ajouter un vol");
			System.out.println("2 - Lister les vols");
			System.out.println("3 - Supprimer un vol");
			System.out.println("4 - Editer un vol");
			System.out.println("0 - Quitter le menu");
			System.out.println("Votre choix : ");
			choix = Console.saisirInt();
			switch (choix) {
				case 1 : insertVol(); break;
				case 2 : afficherLesVols(); break;
				case 3 : deleteVol(); break;
				case 4 : modifierVol(); break;
			}
		} while (choix != 0);
	}

}
