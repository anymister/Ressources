package ressources;

import java.io.BufferedReader;
import java.io.FileReader;

public class Salle {

	private int nbSalles;
	private int capacite;

	public Salle(int nbSalles, int capacite) {
		this.nbSalles = nbSalles;
		this.capacite = capacite;
	}

	public int getNbSalles() {
		return nbSalles;
	}

	public void setNbSalles(int nbSalles) {
		this.nbSalles = nbSalles;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

}
