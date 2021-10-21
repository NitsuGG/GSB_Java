package gsb.tests;

import java.util.ArrayList;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class MedicamentDaoTest {

	public static void main(String[] args) {
		
		//Medicament unMedicament = MedicamentDao.rechercherMedicament("ADIMOL9");

		MedicamentDao.insertNewMedicament("tet", "test", "test", "test", "test", "CR", "test");
		ArrayList<Medicament> Liste = MedicamentDao.ListMedicamentFam("Antibiotique de la famille des béta-lactamines (pénicilline A)");
		
		for (Medicament unMedicament : Liste) {
			System.out.println("Id : " + unMedicament.getIdMedicament());
			System.out.println("Nom : " + unMedicament.getNomMedicament());
			System.out.println("Compo :" + unMedicament.getCompoMedicament());
			System.out.println("Effet : " + unMedicament.getEffetMedicament());
			System.out.println("ContreIndic : " + unMedicament.getContreIndicMedicament());
			System.out.println("Prix : " + unMedicament.getPrixEchantillonMedicament());
			System.out.println("famCode : " + unMedicament.getFamCodeMedicament());
			System.out.println("famLibellé: " + unMedicament.getFamLibelleMedicament());

			System.out.println("---------------------------------------------------");
			
		}
		
		


		
		


	}

}
