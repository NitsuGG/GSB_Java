package gsb.modele;

public class Offrir {
	
	protected int quantite;
	protected String reference;
	protected String depotlegal;

	public Offrir(int quantite, String reference, String depotlegal) {
		this.quantite=quantite;
		this.reference=reference;
		this.depotlegal=depotlegal;
		
	}
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public String getDepotLegal() {
		return depotlegal;
	}

	public void setDepotLegal(String depotlegal) {
		this.depotlegal=depotlegal;
	}
}
