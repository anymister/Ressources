package ressources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RepertoireEvenement {

	private ArrayList<String> repertoireEvenement;
	private ArrayList<Evenement> events;

	public RepertoireEvenement() {

		repertoireEvenement = new ArrayList<String>();
		events = new ArrayList<Evenement>();
		lireListeDesEvenement();
	}

	public void enregistrerEvenement(Evenement event) {
		try {
			String heure = "" + event.getReu().getHeure();
			// chaque 5 donne c est un evenement d une heure
			BufferedWriter contact = new BufferedWriter(new FileWriter(new File(".\\data\\evenements.txt"), true));// changer
																													// le
																													// nom
																													// d
																													// evenemnt
			// String capacite=""+event.getSalle().getCapacite();
			String dure = "" + event.getReu().getDure();
			contact.write("\r\n" + heure + "\r\n" + event.getReu().getTypeEvenement() + "\r\n"
					+ event.getMateriel().getNombreDePc() + "\r\n" + event.getMateriel().getNombreDeProjecteurs()
					+ "\r\n" + event.getMateriel().getNbMicro() + "\r\n" + event.getMateriel().getNbTableau() + "\r\n" +
					// capacite+"\r\n"+
					dure + "\r\n" + event.getReu().getNbPersonne() + "\r\n");
			for (int i = 0; i < event.getRepContact().getListeDesEmployer().size(); i++) {
				contact.write(event.getRepContact().nomEmploye() + ",");
				i = i + 10; // enregistrer njuste le nom de l employer
			}
			contact.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void lireListeDesEvenement() {
		String line = "";
		try {

			BufferedReader readEvent = new BufferedReader(new FileReader(".\\data\\evenements.txt"));
			try {
				while ((line = readEvent.readLine()) != null) {
					repertoireEvenement.add(line);
				}
				readEvent.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Evenement event = new Evenement(null, null, 0, null);
		Reunion reunion = new Reunion(0, null, 0, null);
		Materiel materiel = new Materiel(null, null, null, null);
		Salle salle = new Salle(0, 0);
		RepertoireContact repContact = new RepertoireContact();
		for (int i = 0; i < repertoireEvenement.size(); i += 9) {
			int tmp = i + 9;
			if (tmp < repertoireEvenement.size()) {
				System.out.println("");
				// reunion.setHeure(Integer.parseInt(repertoireEvenement.get(i)));
				reunion.setTypeEvenement(repertoireEvenement.get(i + 1));
				materiel.setNombreDePc(repertoireEvenement.get(i + 2));
				materiel.setNombreDeProjecteurs(repertoireEvenement.get(i + 3));
				materiel.setNbMicro(repertoireEvenement.get(i + 4));
				materiel.setNbTableau(repertoireEvenement.get(i + 5));
				// salle.setCapacite(Integer.parseInt(repertoireEvenement.get(i+6)));
				salle.setCapacite(1);
				// reunion.setDure(Integer.parseInt(repertoireEvenement.get(i+7)));
				reunion.setNbPersonne(repertoireEvenement.get(i + 8));
				salle.setNbSalles(1);
				event.setMateriel(materiel);
				event.setReu(reunion);
				event.setSalle(salle);

				String employer = repertoireEvenement.get(i + 9);
				String[] splitArray = null;
				splitArray = employer.split(",");

				for (int j = 0; j < splitArray.length; j++) {

					repContact.ajouterArrayList(repContact.rechercheEmployer(splitArray[j]));
					System.out.println(splitArray[j] + "..");
				}

				event.setRepContact(repContact);
				System.out.println("\r\n" + event.getMateriel().getNbMicro() + "...micro...\r\n"
						+ event.getMateriel().getNbTableau() + "..getNbTableau..\r\n"
						+ event.getMateriel().getNombreDePc() + "..pc\r\n"
						+ event.getMateriel().getNombreDeProjecteurs() + "...Projecteurs\\r\\n"
						+ event.getReu().getDure() + "...dure\r\n" + event.getReu().getHeure() + "..heure\r\n"
						+ event.getReu().getNbPersonne() + "...nbPersonne\r\n" + event.getReu().getTypeEvenement()
						+ "..type\r\n" + event.getSalle().getCapacite() + "..capacite\r\n"
						+ event.getSalle().getNbSalles() + "..nb de salle\r\n");

			}
		}
	}

	public ArrayList<String> getRepertoireEvenement() {
		return repertoireEvenement;
	}

	public void setRepertoireEvenement(ArrayList<String> repertoireEvenement) {
		this.repertoireEvenement = repertoireEvenement;
	}

	public static void main(String[] args) throws IOException {
		new RepertoireEvenement();
	}

}
