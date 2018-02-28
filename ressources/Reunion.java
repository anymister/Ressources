package ressources;

public class Reunion {
	
	private int dure;
	private String nbPersonne;
	private int heure;
	private String jour;
	private String TypeEvenement;
	
public Reunion(int dure, String nbPersonne,int heure,String jour,String TypeEvenement) {
	 this.TypeEvenement=TypeEvenement;
	this.dure=dure;
	this.nbPersonne=nbPersonne;
	this.heure=heure;
	this.jour=jour;
}

public String getTypeEvenement() {
	return TypeEvenement;
}

public void setTypeEvenement(String typeEvenement) {
	TypeEvenement = typeEvenement;
}

public String getJour() {
	return jour;
}

public void setJour(String jour) {
	this.jour = jour;
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