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
	
	public Reunion conferance(String nbPersonne,String dure, String heure, String jour) {
		
		reu.setDure(dure);
		reu.setNbPersonne(nbPersonne);
		reu.setJour(jour);
		reu.setHeure(heure);
		
		return reu;
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
