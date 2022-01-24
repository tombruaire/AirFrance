package vue;

import java.util.ArrayList;

import controleur.Avion;
import controleur.Pilote;
import controleur.Vol;
import modele.Modele;

public class VueVol {
	
	public static Vol saisirVol () {
		Vol unVol = null;
		System.out.println("------------------------------------");
		System.out.println("---------- AJOUT D'UN VOL ----------");
		System.out.println("------------------------------------");
		System.out.println("Donner la desingnation du vol : ");
		String designation = Console.saisirString();
		System.out.println("Donner la date du vol : ");
		String datevol = Console.saisirString();
		System.out.println("Donner l'heure du vol : ");
		String heurevol = Console.saisirString();
		ArrayList<Pilote> lesPilotes = Modele.selectAllPilotes();
		String chaine = "ID Pilotes : [";
		for (Pilote unPilote : lesPilotes) {
			chaine += unPilote.getIdpilote()+", ";
		}
		chaine += "]";
		System.out.println(chaine);
		System.out.println("Donner l'id du pilote 1 : ");
		int idpilote1 = Console.saisirInt();
		System.out.println("Donner l'id du pilote 2 : ");
		int idpilote2 = Console.saisirInt();
		ArrayList<Avion> lesAvions = Modele.selectAllAvions();
		chaine = "ID Avions : [";
		for (Avion unAvion : lesAvions) {
			chaine += unAvion.getIdavion()+", ";
		}
		chaine = "]";
		System.out.println(chaine);
		System.out.println("Donner l'id de l'avion : ");
		int idavion = Console.saisirInt();
		unVol = new Vol (designation, datevol, heurevol, idpilote1, idpilote2, idavion);
		return unVol;
	}
	
	public static void afficherVol (Vol unVol) {
		System.out.println("----------------------------------");
		System.out.println("---------- INFOS DU VOL ----------");
		System.out.println("----------------------------------");
		System.out.println("ID du vol : " + unVol.getIdvol());
		System.out.println("Désingation : " + unVol.getDesignation());
		System.out.println("Date du vol : " + unVol.getDatevol());
		System.out.println("Heure du vol : " + unVol.getHeurevol());
		System.out.println("Pilote 1 : " + unVol.getIdpilote1());
		System.out.println("Pilote 2 : " + unVol.getIdpilote2());
		System.out.println("Avion : " + unVol.getIdavion());
		System.out.println("----------------------------------");
	}
	
	public static int saisirId () {
		System.out.println("------------------------------------------");
		System.out.println("---------- SUPPRESSION D'UN VOL ----------");
		System.out.println("------------------------------------------");
		System.out.println("Donner l'id du vol : ");
		return Console.saisirInt();
	}
	
	public static Vol modifierVol (Vol unVol) {
		System.out.println("--------------------------------------");
		System.out.println("---------- EDITION D'UN VOL ----------");
		System.out.println("--------------------------------------");
		System.out.println("Ancienne désignation du vol : " + unVol.getDesignation());
		System.out.println("Donner la nouvelle désignation du vol : ");
		unVol.setDesignation(Console.saisirString());
		System.out.println("Ancienne date du vol : " + unVol.getDatevol());
		System.out.println("Donner la nouvelle date du vol : ");
		unVol.setDatevol(Console.saisirString());
		System.out.println("Ancienne heure du vol : " + unVol.getHeurevol());
		System.out.println("Donner la nouvelle heure du vol : ");
		unVol.setHeurevol(Console.saisirString());
		System.out.println("ID actuel du pilote 1 : " + unVol.getIdpilote1());
		System.out.println("Donner le nouvel ID du pilote 1 : ");
		unVol.setIdpilote1(Console.saisirInt());
		System.out.println("ID actuel du pilote 2 : " + unVol.getIdpilote2());
		System.out.println("Donner le nouvel ID du pilote 2 : ");
		unVol.setIdpilote2(Console.saisirInt());
		System.out.println("ID actuel de l'avion : " + unVol.getIdavion());
		System.out.println("Donner le nouvel ID de l'avion : ");
		unVol.setIdavion(Console.saisirInt());
		return unVol;
	}

}
