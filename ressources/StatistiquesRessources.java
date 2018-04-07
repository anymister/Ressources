package ressources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class StatistiquesRessources {
	private ArrayList<String> emploisTemps;
	private ArrayList<String> salles;
	private ArrayList<String> sallesRestante;
	private ArrayList<String> materiel;
	private ArrayList<String> nomDesEmployer;
	private ArrayList<String> Employer;
	private ArrayList<String> pourcentageOccupation;

	public StatistiquesRessources() {
		emploisTemps = new ArrayList<String>();
		salles = new ArrayList<String>();
		materiel = new ArrayList<String>();
		nomDesEmployer = new ArrayList<String>();
		Employer = new ArrayList<String>();
		pourcentageOccupation = new ArrayList<String>();
		sallesRestante = new ArrayList<String>();
		try {
			occupationDeChaqueEmployer();
			salleRestante();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void tempsRestant() throws IOException {
		String line = "";
		BufferedReader lireEmploisDuTempEmployer = new BufferedReader(new FileReader(".\\data\\semaine1.txt"));
		while ((line = lireEmploisDuTempEmployer.readLine()) != null) {
			emploisTemps.add(line);
		}
		lireEmploisDuTempEmployer.close();
	}

	public float salleRestante() throws IOException { 
		String line = "";
		String line1 = "";
		BufferedReader lireSallesRestante = new BufferedReader(new FileReader(".\\data\\salleRestante.txt"));
		BufferedReader lireSalles = new BufferedReader(new FileReader(".\\data\\salles.txt")); 
		while ((line1 = lireSallesRestante.readLine()) != null) {
			sallesRestante.add(line1);
		}
		lireSallesRestante.close();
		while ((line = lireSalles.readLine()) != null) {
			salles.add(line);
		}
		lireSalles.close();
		int a = 0;
		int b = 0;
		for (int i = 1; i < salles.size(); i += 2) {

			System.out.println("nbr de salles existantes" + salles.get(i) + "....nbr de salles restantes  :"
					+ sallesRestante.get(i));
			a += Integer.parseInt(salles.get(i));
			b += Integer.parseInt(sallesRestante.get(i));
		}

		float c = 0;
		if (a != 0) {
			c = ((a-b) * 100) / a;

			System.out.println("taux d'occupation des salles" + c + "%");
		} else
			System.out.println("Y a une salle qui dans la capacité est egale à: 0");
		return c;
	}

	public void materielRestant() throws IOException {
		String line = "";
		BufferedReader lireEmploisDuTempEmployer = new BufferedReader(new FileReader(".\\data\\materielrestant.txt"));
		while ((line = lireEmploisDuTempEmployer.readLine()) != null) {
			emploisTemps.add(line);
		}
		lireEmploisDuTempEmployer.close();

	}

	public void occupationDeChaqueEmployer() throws IOException {
		String line = "";
		String rline = "";
		String nom = "";
		int tmp = 0;
		String percent = "";
		float pourcentage = 0;
		nomDesEmployer.clear(); 

		Employer.clear();
		try {

			BufferedReader contacts = new BufferedReader(new FileReader(".\\data\\contacts.txt"));
			while ((rline = contacts.readLine()) != null) {
				Employer.add(rline);
			}
			contacts.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int k = 0; k < Employer.size(); k += 5) {
			System.out.println("nom des employes  :" + Employer.get(k));
			nomDesEmployer.add(Employer.get(k));

		}
		for (int i = 0; i < nomDesEmployer.size(); i++) {
			pourcentage = 0;
			nom = nomDesEmployer.get(i);
			System.out.println(nomDesEmployer.get(i));
			File file = new File(".\\data\\" + nom + ".txt");
			if (file.exists()) {

				BufferedReader lireEmploisDuTempEmployer = new BufferedReader(
						new FileReader(".\\data\\" + nom + ".txt"));
				while ((line = lireEmploisDuTempEmployer.readLine()) != null) {
					if (Integer.parseInt(line) == 0) {
						tmp += 1;
					}

				}
				lireEmploisDuTempEmployer.close();

				pourcentage = (100 * tmp) / 40;
				tmp = 0;
				percent = "" + pourcentage;
				pourcentageOccupation.add(percent);
				System.out.println("pourcentage d'occupation de:'" + nom + "'est :.." + percent + "..%");
			}
		}

	}

	public float calculeOccupationMoyenneDeToutLePersonnel() throws IOException {
		float moyenne = 0;
		float tmp = 0;
		int nombreEmployer = 0;
		occupationDeChaqueEmployer(); 
		for (int i = 0; i < getPourcentageOccupation().size(); i++) {

			tmp = tmp + Float.parseFloat(getPourcentageOccupation().get(i));
			nombreEmployer++;
		}
		moyenne = tmp / nombreEmployer;
		return moyenne;
	}

	public ArrayList<String> getPourcentageOccupation() {
		return pourcentageOccupation;
	}

	public void setPourcentageOccupation(ArrayList<String> pourcentageOccupation) {
		this.pourcentageOccupation = pourcentageOccupation;
	}

	public static void main(String[] args) throws IOException {
new  StatistiquesRessources();
	}
}
