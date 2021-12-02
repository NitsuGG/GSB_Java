package gsb.tests;

import java.util.ArrayList;

import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;
import gsb.utils.AffichageModele;

public class VisiteurDaoTest {
	
	public static void main(String[] args) {
		
		Visiteur unVisiteur = VisiteurDao.rechercher("a17");
		AffichageModele.afficherVisiteur(unVisiteur);
	}
}
