package gsb.utils;

import gsb.modele.Localite;
import gsb.modele.Visiteur;

public class AffichageModele {
	public static void afficherVisiteur(Visiteur unVisiteur) {
		System.out.println("matricule Visiteur :"+unVisiteur.getMatricule());
		System.out.println("nom Visiteur :"+unVisiteur.getNom());
		System.out.println("prenom Visiteur :"+unVisiteur.getPrenom());
		System.out.println("adresse Visiteur :"+unVisiteur.getAdresse());
		System.out.println("code postal Visiteur :"+unVisiteur.getCodePostal());
		System.out.println("date entrée Visiteur :"+unVisiteur.getDateEntree());
		System.out.println("codeUnit Visiteur :"+unVisiteur.getCodeUnit());
		System.out.println("nomUnit Visiteur :"+unVisiteur.getNomUnit());
	}
	
	public static void afficherLocalite(Localite unLocalite) {
		System.out.println("CodePostal :"+unLocalite.getCodePostal());
		System.out.println("une ville :"+unLocalite.getVille());
	}
}
