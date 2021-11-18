package gsb.tests;

import gsb.modele.Visite;
import gsb.modele.dao.VisiteDao;
import gsb.utils.*;

public class VisiteDaoTest {
	
	public static void main(String[] args) {
		
		Visite laVisite = VisiteDao.rechercher("v0004");
		
		AffichageModele.afficherVisite(laVisite);
		
		
	}
}
