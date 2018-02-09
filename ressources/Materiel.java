package ressources;

public class Materiel {

private String nombreDePc;
private String nombreDeProjecteurs;

public Materiel(String nombreDePc,String nombreDeProjecteurs) {
	this.nombreDeProjecteurs=nombreDeProjecteurs;
	this.nombreDePc=nombreDePc;
}

public String getNombreDePc() {
	return nombreDePc;
}

public void setNombreDePc(String nombreDePc) {
	this.nombreDePc = nombreDePc;
}

public String getNombreDeProjecteurs() {
	return nombreDeProjecteurs;
}

public void setNombreDeProjecteurs(String nombreDeProjecteurs) {
	this.nombreDeProjecteurs = nombreDeProjecteurs;
}



}
