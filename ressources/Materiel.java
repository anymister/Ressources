package ressources;

public class Materiel {

private String nombreDePc;
private String nombreDeProjecteurs;
private String NbMicro;
private String NbTableau;

public Materiel(String nombreDePc,String nombreDeProjecteurs,String NbTableau,String NbMicro) {
	this.nombreDeProjecteurs=nombreDeProjecteurs;
	this.nombreDePc=nombreDePc;
	this.NbMicro=NbMicro;
	this.NbTableau=NbTableau;
	
}



public String getNbMicro() {
	return NbMicro;
}



public void setNbMicro(String nbMicro) {
	NbMicro = nbMicro;
}



public String getNbTableau() {
	return NbTableau;
}



public void setNbTableau(String nbTableau) {
	NbTableau = nbTableau;
}



public String getNombreDePc() {
	return nombreDePc;
}

public void setNombreDePc(String pc) {
	this.nombreDePc = pc;
}

public String getNombreDeProjecteurs() {
	return nombreDeProjecteurs;
}

public void setNombreDeProjecteurs(String nombreDeProjecteurs) {
	this.nombreDeProjecteurs = nombreDeProjecteurs;
}



}
