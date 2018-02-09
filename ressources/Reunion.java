package ressources;

public class Reunion {
	
	private String dure;
	private String nbPersonne;
	private String heure;
	private String jour;
	
public Reunion(String dure, String nbPersonne,String heure,String jour) {
	
	this.dure=dure;
	this.nbPersonne=nbPersonne;
	this.heure=heure;
	this.jour=jour;
}
public String getJour() {
	return jour;
}

public void setJour(String jour) {
	this.jour = jour;
}
public String getHeure() {
	return heure;
}

public void setHeure(String heure) {
	this.heure = heure;
}

public String getDure() {
	return dure;
}

public void setDure(String dure) {
	this.dure = dure;
}

public String getNbPersonne() {
	return nbPersonne;
}

public void setNbPersonne(String nbPersonne) {
	this.nbPersonne = nbPersonne;
}



}