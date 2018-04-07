package ressources;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class RepertoireSalle {
	private ArrayList<String> salleReini;
	private ArrayList<String> listeDesSalles;
	private ArrayList<String> listeDesSallesRestantes;
	File Fichiersallerestante;

	private Salle salle;

	public RepertoireSalle() {
		Fichiersallerestante = new File(".\\data\\salleRestante.txt");
		salle = new Salle(0, 0);
		listeDesSalles = new ArrayList<String>();
		listeDesSallesRestantes = new ArrayList<String>();
		salleReini = new ArrayList<String>();
		//reinitialisationDesSalles();
		choisirSallePourEvenement(20); 
	}

	public int stringEnEntier(String string) {
		int entier = Integer.parseInt(string); 
		return entier;
	}

	public void lireListeDesSalles() {// Enregitrer le nombre de salle qui reste apres chaque evenement organiser
		listeDesSalles.clear();
		try {
			File salle = new File(".\\data\\salles.txt"); 
			BufferedReader lireSalle = new BufferedReader(new FileReader(".\\data\\salles.txt"));

			String line = "";
			while ((line = lireSalle.readLine()) != null) {
				listeDesSalles.add(line); 

			}
			lireSalle.close();
			// salle.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}

	}

	public void lireListeDesSallesRestante() {// Enregitrer le nombre de salle qui reste apres chaque evenement
												// organiser
		listeDesSallesRestantes.clear();
		
		try {

			BufferedReader lireSalle = new BufferedReader(new FileReader(Fichiersallerestante));

			String line = "";
			listeDesSallesRestantes.clear();
			while ((line = lireSalle.readLine()) != null) {
				listeDesSallesRestantes.add(line);
				System.out.println("lecture des salles restantes:"+line);
			}
			lireSalle.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void supprimerAncienneSalleRestante() {
		Fichiersallerestante.delete();
		System.out.println("fichier supprimer avec succes");
	}

	public void ajouterSalle(Salle sall) {// les salles sont enregistrer dans le fichier de façon ou la premiere ligne
											// represente
		// la capacite d'une salle et la ligne qui suie represente le nombre de salle
		// contenent la mem capacité

		String nbrSalles = "" + sall.getNbSalles();
		String capaciteSalle = "" + sall.getCapacite();
		//
		File salle = new File(".\\data\\salles.txt");

		int k = 0; 
		lireListeDesSalles();

		for (int i = 0; i < listeDesSalles.size(); i += 2) {

			if (Integer.parseInt(listeDesSalles.get(i)) == sall.getCapacite()) {
				int nbr = stringEnEntier(listeDesSalles.get(i + 1)) + sall.getNbSalles();
				String newNbr = "" + nbr;
				listeDesSalles.set(i + 1, newNbr);
				k = 1;

			}

		}

		if (k == 0) {
			listeDesSalles.add(capaciteSalle);
			listeDesSalles.add(nbrSalles);
		}
		salle.delete();
		BufferedWriter salles = null;
		try {
			salles = new BufferedWriter(new FileWriter(new File(".\\data\\salles.txt"), true));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		;
		try {
			for (int j = 0; j < listeDesSalles.size(); j++) {
				salles.write(listeDesSalles.get(j) + "\r\n");
				System.out.println("mes salles :..." + listeDesSalles.get(j));
			}
			salles.close();

			// for(int i=0;i<listeDesSalles.size();i++) {
			// System.out.println(listeDesSalles.get(i)+k);
			// }
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
	}

	public void enleveSalle(Salle sall) {// les salles sont enregistrer dans le fichier de façon ou la premiere ligne
											// represente
		// la capacite d'une salle et la ligne qui suie represente le nombre de salle
		// contenent la mem capacité
		try {
			
			
			
			BufferedWriter salles = new BufferedWriter(new FileWriter(Fichiersallerestante));
			
 
	 
		
			for (int i = 0; i < listeDesSallesRestantes.size(); i ++) { 
				System.out.println("parcours des salles restantes  :"+listeDesSallesRestantes.get(i));
				}
			for (int i = 0; i < listeDesSallesRestantes.size(); i += 2) {  
				
				if (stringEnEntier(listeDesSallesRestantes.get(i)) == sall.getCapacite()) {
					int nbr = stringEnEntier(listeDesSallesRestantes.get(i + 1)) - 1; 
					String newNbr = "" + nbr; 
					listeDesSallesRestantes.set(i + 1, newNbr);
					System.out.println("nombres de salles debiter avec succès");
				}
 
			}
			supprimerAncienneSalleRestante();
			for (int j = 0; j < listeDesSallesRestantes.size(); j++) {
				System.out.println("salles restate :"+listeDesSallesRestantes.get(j));
				salles.write(listeDesSallesRestantes.get(j) + "\r\n");
			}
			salles.close();

			for (int i = 0; i < listeDesSallesRestantes.size(); i++) {
				System.out.println("salle restante " + listeDesSallesRestantes.get(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Salle choisirSallePourEvenement(int nbPersonne) {
		lireListeDesSallesRestante(); 
 
		int tmp = Integer.parseInt(getListeDesSallesRestantes().get(0));
		int k = 0;
		int[] list = new int[100];
		for (int i = 2; i < getListeDesSallesRestantes().size(); i += 2) {
			list[i] = Integer.parseInt(getListeDesSallesRestantes().get(i));
			System.out.println("tableau des capacité"+list[i]);
			Arrays.sort(list);//ordonner par ordre croissant les elements du tableau
		} 
		tmp = list[0];
		for (int j = 0; j < list.length; j++) { System.out.println("tableau contient :"+list[j]);}
		for (int j = 0; j < list.length; j++) { 
			
			if ((nbPersonne >= tmp)) {
				tmp = list[j];
				k = j; 
			}
		}
		salle.setCapacite(tmp); 
		salle.setNbSalles(1);
		int n=0;
		for (int j = 0; j < getListeDesSallesRestantes().size(); j++) { 
			
			if(Integer.parseInt(getListeDesSallesRestantes().get(j))==tmp) {
				n=j;
			}
		}
		if(Integer.parseInt(getListeDesSallesRestantes().get(n+1))!=0) {
		enleveSalle(salle); 
		System.out.println("salle choisi, capacité  :" + salle.getCapacite());
		return salle;
		// parcourir l arraylist pour choisir le type de salle en fonction du nombre de
		// personne participant à l'evenement
		}else {
			System.out.println("Aucune salle n'est disponible");
			salle.setCapacite(0);
			salle.setNbSalles(0);
			return salle;
		}
	}
	public void reinitialisationDesSalles() {
		File salleRest=new File(".\\data\\sallerestante.txt");
		salleRest.delete();
		BufferedReader lireSalleDup;
		String line="";

		try {
			lireSalleDup = new BufferedReader(new FileReader(".\\data\\salles.txt"));

			try {
				while ((line=lireSalleDup.readLine()) != null) {
					salleReini.add(line);
				}
				lireSalleDup.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			BufferedWriter reiniSalle = new BufferedWriter(new FileWriter(salleRest, true));
			
			for(int i=0;i<salleReini.size();i++) {
				
				reiniSalle.write(salleReini.get(i)+"\r\n");
			}
			reiniSalle.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	public ArrayList<String> getListeDesSalles() {
		return listeDesSalles;
	}

	public void setListeDesSalles(ArrayList<String> listeDesSalles) {
		this.listeDesSalles = listeDesSalles;
	}

	public ArrayList<String> getListeDesSallesRestantes() {
		return listeDesSallesRestantes;
	}

	public void setListeDesSallesRestantes(ArrayList<String> listeDesSallesRestantes) {
		this.listeDesSallesRestantes = listeDesSallesRestantes;
	}

	public static void main(String[] args) throws IOException {

		new RepertoireSalle();

	}
	
}
