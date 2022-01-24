package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VueAvion;

public class C_Avion {
	
	public static void insertAvion () {
		Avion unAvion = VueAvion.saisirAvion();
		Modele.insertAvion(unAvion);
	}
	
	public static void afficherLesAvions () {
		ArrayList<Avion> lesAvions = Modele.selectAllAvions();
		System.out.println("__________ LISTE DES AVIONS __________");
		for (Avion unAvion : lesAvions) {
			VueAvion.afficherAvion(unAvion);
		}
	}
	
	public static void deleteAvion () {
		int idavion = VueAvion.saisirId();
		Modele.deleteAvion(idavion);
	}
	
	public static void modifierAvion () {
		int idavion = VueAvion.saisirId();
		Avion unAvion = Modele.selectWhereAvion(idavion);
		if (unAvion != null) {
			VueAvion.modifierAvion(unAvion);
			Modele.updateAvion(unAvion);
		}
	}
	
	public static void count () {
		int nb;
		nb = Modele.countAvions();
		System.out.println("Le nombre d'avions est de : " + nb);
	}
	
	public static void menuAvion () {
		int choix = 0;
		do {
			System.out.println("__________ MENU AVION __________");
			System.out.println("---------------------------------");
			System.out.println("1 - Ajouter un avion");
			System.out.println("2 - Lister les avions");
			System.out.println("3 - Supprimer un avion");
			System.out.println("4 - Editer un avion");
			System.out.println("0 - Quitter le menu");
			System.out.println("Votre choix : ");
			choix = Console.saisirInt();
			switch (choix) {
				case 1 : insertAvion(); break;
				case 2 : afficherLesAvions(); break;
				case 3 : deleteAvion(); break;
				case 4 : modifierAvion(); break;
			}
		} while (choix != 0);
	}

}
