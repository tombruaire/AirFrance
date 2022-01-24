package vue;

import controleur.Avion;

public class VueAvion {
	
	public static Avion saisirAvion () {
		Avion unAvion = null;
		System.out.println("--------------------------------------");
		System.out.println("---------- AJOUT D'UN AVION ----------");
		System.out.println("--------------------------------------");
		System.out.println("Donner la designation de l'avion : ");
		String designation = Console.saisirString();
		System.out.println("Donner le constructeur de l'avion : ");
		String constructeur = Console.saisirString();
		System.out.println("Donner le nombre de places : ");
		int nbplaces = Console.saisirInt();
		unAvion = new Avion (designation, constructeur, nbplaces);
		return unAvion;
	}
	
	public static void afficherAvion (Avion unAvion) {
		System.out.println("--------------------------------------");
		System.out.println("---------- INFOS DE L AVION ----------");
		System.out.println("--------------------------------------");
		System.out.println("ID de l'avion : " + unAvion.getIdavion());
		System.out.println("Désingation : " + unAvion.getDesignation());
		System.out.println("Constructeur : " + unAvion.getConstructeur());
		System.out.println("Nombre de places : " + unAvion.getNbplaces());
		System.out.println("--------------------------------------");
	}
	
	public static int saisirId () {
		System.out.println("--------------------------------------------");
		System.out.println("---------- SUPPRESSION D'UN AVION ----------");
		System.out.println("--------------------------------------------");
		System.out.println("Donner l'id de l'avion : ");
		return Console.saisirInt();
	}
	
	public static Avion modifierAvion (Avion unAvion) {
		System.out.println("----------------------------------------");
		System.out.println("---------- EDITION D'UN AVION ----------");
		System.out.println("----------------------------------------");
		System.out.println("Ancienne désignation de l'avion : " + unAvion.getDesignation());
		System.out.println("Donner la nouvelle désignation de l'avion : ");
		unAvion.setDesignation(Console.saisirString());
		System.out.println("Ancien constructeur de l'avion : " + unAvion.getConstructeur());
		System.out.println("Donner le nouveau constructeur de l'avion : ");
		unAvion.setConstructeur(Console.saisirString());
		System.out.println("Ancien nombre de places : " + unAvion.getNbplaces());
		System.out.println("Donner le nouveau nombre de places : ");
		unAvion.setNbplaces(Console.saisirInt());
		return unAvion;
	}

}
