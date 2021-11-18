package gsb.tests; 
 
import gsb.modele.Medicament; 
 
public class MedicamentTest { 
 
	public static void main(String[] args) { 
		Medicament unMedicament = new Medicament("3MYC7", "TRIMYCINE", "Triamcinolone (ac�tonide) + N�omycine + Nystatine", "Ce m�dicament est un cortico�de �  activit� forte ou tr�s forte associ� �  un antibiotique et un ant", "Ce m�dicament est contre-indiqu� en cas d'allergie �  l'un des constituants, d'infections de la peau�", (float) 50, "CRT", "Cortico�de, antibiotique et antifongique �  usage local"); 
		 
		System.out.println("Id : " + unMedicament.getIdMedicament()); 
		System.out.println("Nom : " + unMedicament.getNomMedicament()); 
		System.out.println("Compo :" + unMedicament.getCompoMedicament()); 
		System.out.println("Effet : " + unMedicament.getEffetMedicament()); 
		System.out.println("ContreIndic : " + unMedicament.getContreIndicMedicament()); 
		System.out.println("Prix : " + unMedicament.getPrixEchantillonMedicament()); 
		System.out.println("famCode : " + unMedicament.getFamCodeMedicament()); 
		System.out.println("famLibell�: " + unMedicament.getFamLibelleMedicament()); 
 
	} 
 
} 
