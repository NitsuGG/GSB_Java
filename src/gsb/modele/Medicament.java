package gsb.modele; 
 
public class Medicament { 
 
	protected String idMedicament; 
	protected String nomMedicament; 
	protected String compoMedicament; 
	protected String effetMedicament; 
	protected String contreIndicMedicament; 
	protected Float prixEchantillonMedicament; 
	protected String famCodeMedicament; 
	protected String famLibelleMedicament; 
	protected String DC;
	
	 
	public Medicament(String idMedicament, String nomMedicament, String compoMedicament, String effetMedicament, String contreIndicMedicament, Float prixEchantillonMedicament, String famCodeMedicament, String famLibelleMedicament, String DC) { 
		 
		this.idMedicament = idMedicament; 
		this.nomMedicament = nomMedicament; 
		this.compoMedicament = compoMedicament; 
		this.effetMedicament = effetMedicament; 
		this.contreIndicMedicament = contreIndicMedicament; 
		this.prixEchantillonMedicament = prixEchantillonMedicament; 
		this.famCodeMedicament = famCodeMedicament; 
		this.famLibelleMedicament = famLibelleMedicament; 
		this.DC = DC;
		 
	} 
 
	public String getIdMedicament() { 
		return idMedicament; 
	} 
 
	public void setIdMedicament(String idMedicament) { 
		this.idMedicament = idMedicament; 
	} 
 
	public String getNomMedicament() { 
		return nomMedicament; 
	} 
 
	public void setNomMedicament(String nomMedicament) { 
		this.nomMedicament = nomMedicament; 
	} 
 
	public String getCompoMedicament() { 
		return compoMedicament; 
	} 
 
	public void setCompoMedicament(String compoMedicament) { 
		this.compoMedicament = compoMedicament; 
	} 
 
	public String getEffetMedicament() { 
		return effetMedicament; 
	} 
 
	public void setEffetMedicament(String effetMedicament) { 
		this.effetMedicament = effetMedicament; 
	} 
 
	public String getContreIndicMedicament() { 
		return contreIndicMedicament; 
	} 
 
	public void setContreIndicMedicament(String contreIndicMedicament) { 
		this.contreIndicMedicament = contreIndicMedicament; 
	} 
 
	public Float getPrixEchantillonMedicament() { 
		return prixEchantillonMedicament; 
	} 
 
	public void setPrixEchantillonMedicament(Float prixEchantillonMedicament) { 
		this.prixEchantillonMedicament = prixEchantillonMedicament; 
	} 
 
	public String getFamCodeMedicament() { 
		return famCodeMedicament; 
	} 
 
	public void setFamCodeMedicament(String famCodeMedicament) { 
		this.famCodeMedicament = famCodeMedicament; 
	} 
 
	public String getFamLibelleMedicament() { 
		return famLibelleMedicament; 
	} 
 
	public void setFamLibelleMedicament(String famLibelleMedicament) { 
		this.famLibelleMedicament = famLibelleMedicament; 
	} 
	
	public String getDC() { 
		return DC; 
	} 
	 
	 
} 
