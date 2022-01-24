package vue;

import controleur.Pilote;

public class VuePilote {

	public static Pilote saisirPilote () {
		Pilote unPilote = null;
		System.out.println("---------------------------------------");
		System.out.println("---------- AJOUT D'UN PILOTE ----------");
		System.out.println("---------------------------------------");
		System.out.println("Donner le nom du pilote : ");
		String nom = Console.saisirString();
		System.out.println("Donner le prénom du pilote : ");
		String prenom = Console.saisirString();
		System.out.println("Donner l'adresse du pilote : ");
		String adresse = Console.saisirString();
		System.out.println("Donner le nombre d'heure de vol : ");
		int nbheuresvol = Console.saisirInt();
		System.out.println("Donner le BIP du pilote : ");
		String bip = Console.saisirString();
		unPilote = new Pilote (nom, prenom, adresse, nbheuresvol, bip);
		return unPilote;
	}
	
	public static void afficherPilote (Pilote unPilote) {
		System.out.println("-------------------------------------");
		System.out.println("---------- INFOS DU PILOTE ----------");
		System.out.println("-------------------------------------");
		System.out.println("ID du pilote : " + unPilote.getIdpilote());
		System.out.println("Nom du pilote : " + unPilote.getNom());
		System.out.println("Prénom du pilote : " + unPilote.getPrenom());
		System.out.println("Adresse du pilote : " + unPilote.getAdresse());
		System.out.println("Nombre d'heures de vol : " + unPilote.getNbheuresvol());
		System.out.println("BIP du pilote : " + unPilote.getBip());
		System.out.println("-------------------------------------");
	}
	
	public static int saisirId () {
		System.out.println("---------------------------------------------");
		System.out.println("---------- SUPPRESSION D'UN PILOTE ----------");
		System.out.println("---------------------------------------------");
		System.out.println("Donner l'id du pilote : ");
		return Console.saisirInt();
	}
	
	public static Pilote modifierPilote (Pilote unPilote) {
		System.out.println("-----------------------------------------");
		System.out.println("---------- EDITION D'UN PILOTE ----------");
		System.out.println("-----------------------------------------");
		System.out.println("Ancien nom du pilote : " + unPilote.getNom());
		System.out.println("Donner le nouveau nom du pilote : ");
		unPilote.setNom(Console.saisirString());
		System.out.println("Ancien prénom du pilote : " + unPilote.getPrenom());
		System.out.println("Donner le nouveau prénom du pilote : ");
		unPilote.setPrenom(Console.saisirString());
		System.out.println("Ancienne adresse du pilote : " + unPilote.getAdresse());
		System.out.println("Donner la nouvelle adresse du pilote : ");
		unPilote.setAdresse(Console.saisirString());
		System.out.println("Ancien nombre d'heures de vol : " + unPilote.getNbheuresvol());
		System.out.println("Donner le nouveau nombre d'heures de vol : ");
		unPilote.setNbheuresvol(Console.saisirInt());
		System.out.println("Ancien BIP du pilote : " + unPilote.getBip());
		System.out.println("Donner le nouveau BIP du pilote : ");
		unPilote.setBip(Console.saisirString());
		return unPilote;
	}
	
}
