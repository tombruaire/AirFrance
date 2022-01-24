package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VuePilote;

public class C_Pilote {
	
	public static void insertPilote () {
		Pilote unPilote = VuePilote.saisirPilote();
		Modele.insertPilote(unPilote);
	}
	
	public static void afficherLesPilotes () {
		ArrayList<Pilote> lesPilotes = Modele.selectAllPilotes();
		System.out.println("__________ LISTE DES PILOTES __________");
		for (Pilote unPilote : lesPilotes) {
			VuePilote.afficherPilote(unPilote);
		}
	}
	
	public static void deletePilote () {
		int idpilote = VuePilote.saisirId();
		Modele.deletePilote(idpilote);
	}
	
	public static void modifierPilote () {
		int idpilote = VuePilote.saisirId();
		Pilote unPilote = Modele.selectWherePilote(idpilote);
		if (unPilote != null) {
			VuePilote.modifierPilote(unPilote);
			Modele.updatePilote(unPilote);
		}
	}
	
	public static void count () {
		int nb;
		nb = Modele.countPilotes();
		System.out.println("Le nombres de pilotes est de : " + nb);
	}
	
	public static void menuPilote () {
		int choix = 0;
		do {
			System.out.println("__________ MENU PILOTE __________");
			System.out.println("---------------------------------");
			System.out.println("1 - Ajouter un pilote");
			System.out.println("2 - Lister les pilotes");
			System.out.println("3 - Supprimer un pilote");
			System.out.println("4 - Editer un pilote");
			System.out.println("0 - Quitter le menu");
			System.out.println("Votre choix : ");
			choix = Console.saisirInt();
			switch (choix) {
				case 1 : insertPilote(); break;
				case 2 : afficherLesPilotes(); break;
				case 3 : deletePilote(); break;
				case 4 : modifierPilote(); break;
			}
		} while (choix != 0);
	}

}
