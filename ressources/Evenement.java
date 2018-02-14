package ressources;

public class Evenement {
	
	private Reunion reu;
	private Materiel materiel;
	private RepertoireSalle repSalle;
	private RepertoireContact repContact;
	

	
	
	
	
	public Evenement (Reunion reu,Materiel materiel,RepertoireSalle repSalle,RepertoireContact repContact) {
		this.reu=reu;
		this.repSalle=repSalle;
		this.materiel=materiel;
		this.repContact=repContact;
	}
	
	public Reunion conferance(String nbPersonne,int dure,int heure, String jour) {
		
		reu.setDure(dure);
		reu.setNbPersonne(nbPersonne);
		reu.setJour(jour);
		reu.setHeure(heure);
		return reu;
	}
	
	
	public RepertoireSalle getRepSalle() {
		return repSalle;
	}

	public void setRepSalle(RepertoireSalle repSalle) {
		this.repSalle = repSalle;
	}

	public RepertoireContact getRepContact() {
		return repContact;
	}

	public void setRepContact(RepertoireContact repContact) {
		this.repContact = repContact;
	}

	public Materiel getMateriel() {
		return materiel;
	}

	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	

	public Reunion getReu() {
		return reu;
	}

	public void setReu(Reunion reu) {
		this.reu = reu;
	}

	

	
	
	
	
	
	

}
