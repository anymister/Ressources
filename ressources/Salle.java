package ressources;

public class Salle {
	
	private String nbSalles;
	private String capacite;
	
	public Salle(String nbSalles,String capacite) {
		this.nbSalles=nbSalles;
		this.capacite=capacite;
	}

	public String getNbSalles() {
		return nbSalles;
	}

	public void setNbSalles(String nbSalles) {
		this.nbSalles = nbSalles;
	}

	public String getCapacite() {
		return capacite;
	}

	public void setCapacite(String capacite) {
		this.capacite = capacite;
	}
	
	

}
