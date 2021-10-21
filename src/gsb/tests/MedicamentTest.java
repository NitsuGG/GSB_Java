package gsb.tests;

import gsb.modele.Medicament;

public class MedicamentTest {

	public static void main(String[] args) {
		Medicament unMedicament = new Medicament("3MYC7", "TRIMYCINE", "Triamcinolone (acétonide) + Néomycine + Nystatine", "Ce médicament est un corticoïde à  activité forte ou très forte associé à  un antibiotique et un ant", "Ce médicament est contre-indiqué en cas d'allergie à  l'un des constituants, d'infections de la peau…", (float) 50, "CRT", "Corticoïde, antibiotique et antifongique à  usage local");
		
		System.out.println("Id : " + unMedicament.getIdMedicament());
		System.out.println("Nom : " + unMedicament.getNomMedicament());
		System.out.println("Compo :" + unMedicament.getCompoMedicament());
		System.out.println("Effet : " + unMedicament.getEffetMedicament());
		System.out.println("ContreIndic : " + unMedicament.getContreIndicMedicament());
		System.out.println("Prix : " + unMedicament.getPrixEchantillonMedicament());
		System.out.println("famCode : " + unMedicament.getFamCodeMedicament());
		System.out.println("famLibellé: " + unMedicament.getFamLibelleMedicament());

	}

}
