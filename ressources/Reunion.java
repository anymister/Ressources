package ressources;

public class Reunion {

	private int dure;
	private String nbPersonne;
	private int heure;
	private String TypeEvenement;

	int n = 0;

	public Reunion(int dure, String nbPersonne, int heure, String TypeEvenement) {
		this.TypeEvenement = TypeEvenement;

		this.dure = dure;
		this.nbPersonne = nbPersonne;
		this.heure = heure;

	}

	public String getTypeEvenement() {
		return TypeEvenement;
	}

	public void setTypeEvenement(String typeEvenement) {
		TypeEvenement = typeEvenement;
	}

	public int getDure() {
		return dure;
	}

	public void setDure(int dure) {
		this.dure = dure;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public String getNbPersonne() {
		return nbPersonne;
	}

	public void setNbPersonne(String nbPersonne) {
		this.nbPersonne = nbPersonne;
	}

}