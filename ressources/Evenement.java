package ressources;

public class Evenement {
	
	private Reunion reu;
	private Materiel materiel;
	private Salle salle;
	private RepertoireContact repContact;
	private int capacite; 
	public Evenement (Reunion reu,Materiel materiel,int capacite,RepertoireContact repContact) {
		this.reu=reu;
		this.capacite=capacite;
		this.materiel=materiel;  
		this.repContact=repContact;
	}
	
	public Reunion conferance(String nbPersonne,int dure,int heure) {
		
		reu.setDure(dure);
		reu.setNbPersonne(nbPersonne);
		reu.setHeure(heure);
		return reu; 
	}
	
	
	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
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
