package gsb.tests;

import gsb.modele.Visite;
import gsb.modele.Medecin;
import gsb.modele.Visiteur;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.VisiteDao;
import gsb.modele.dao.VisiteurDao;
import gsb.utils.*;

public class VisiteDaoTest {
	
	public static void main(String[] args) {
		
		Visite laVisite = VisiteDao.rechercher("v0004");
		
		AffichageModele.afficherVisite(laVisite);
		
		Visiteur leVisiteur = VisiteurDao.rechercher("a17");
		Medecin leMedecin = MedecinDao.rechercher("m001");
		Visite ajoutVisite = new Visite("v1001", "2021-11-18", "", leVisiteur, leMedecin);
		VisiteDao.creer(ajoutVisite);
	}
}
