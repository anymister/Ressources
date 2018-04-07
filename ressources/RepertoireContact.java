package ressources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RepertoireContact {

	private ArrayList<String> listeDesEmployer;
	private ArrayList<String> nomEmployer;
	private ArrayList<String> contacts;
	private ArrayList<String> nomContacts;
	private Contact employer;
	private Contact employe;
	private int k;

	public RepertoireContact() {
		k = 0;
		employer = new Contact("", "", "", "");
		employe = new Contact("", "", "", ""); 
		listeDesEmployer = new ArrayList<String>();
		nomEmployer = new ArrayList<String>();
		contacts = new ArrayList<String>();
		nomContacts = new ArrayList<String>();
		// rechercheEmployer("lydia");
		// modifyNumero("anis","2666");
		//remove("anis");
	//	ajouterEmployer("anis","anis@vn","01515151","chef");
	}
 
	public void ajouterArrayList(Contact employer) {
		// listeDesEmployer.clear();
		listeDesEmployer.add(employer.getName());
		listeDesEmployer.add(employer.getEmail());
		listeDesEmployer.add(employer.getNumber());
		listeDesEmployer.add(employer.getResponsabilite());

	}

	public void ajouterNomArrayList(Contact employer) {

		nomEmployer.add(employer.getName());
		 System.out.println("nom de mon employer choisis :"+getNomEmployer().get(0));

	} 

	public ArrayList<String> getNomEmployer() {
		return nomEmployer;
	}

	public void setNomEmployer(ArrayList<String> nomEmployer) {
		this.nomEmployer = nomEmployer;
	}

	public int ajouterEmployer(String name, String email, String number, String responsabilite) {

		employe.setEmail(email);
		employe.setName(name); 
		employe.setNumber(number);
		employe.setResponsabilite(responsabilite);
		Contact Ctcttmp = null;
		Ctcttmp = rechercheEmployer(name);
		System.out.println("nom du contact rechercher"+Ctcttmp.getName());
		if (Ctcttmp.getName().contains(employe.getName())) { 
			return 1;
		} else {
			System.out.println(Ctcttmp.getName() + ".." + Ctcttmp.getNumber());
		sauvegarderEmployer(employe);
		ajouterEmploisDuTempEmployer(employe);
		return 0;
		}
	}

	public void sauvegarderEmployer(Contact contact) {
		File fileContact = new File(".\\data\\contacts.txt");
		//fileContact.delete();
		try {
			BufferedWriter contacts = new BufferedWriter(new FileWriter(fileContact, true));

			contacts.write(contact.getName() + "\r\n" + contact.getEmail() + "\r\n" + contact.getNumber()
					+ "\r\n" + contact.getResponsabilite() + "\r\n\r\n");
			contacts.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ajouterEmploisDuTempEmployer(Contact contact) {

		BufferedWriter initEmploisDuTempsEmployer;
		try {
			initEmploisDuTempsEmployer = new BufferedWriter(
					new FileWriter(new File(".\\data\\" + contact.getName() + ".txt"), true));

			for (int i = 1; i < 41; i++) {
				initEmploisDuTempsEmployer.write(1 + "\r\n");
			}
			initEmploisDuTempsEmployer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void reinitialiser(String nom) {
		File tmp = new File(".\\data\\" + nom + ".txt");
		tmp.delete();
		BufferedWriter initEmploisDuTempsEmployer;
		try {
			initEmploisDuTempsEmployer = new BufferedWriter(new FileWriter(tmp, true));

			for (int i = 1; i < 41; i++) {
				initEmploisDuTempsEmployer.write(1 + "\r\n");
			}
			initEmploisDuTempsEmployer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int nombreEmployer() {
		return listeDesEmployer.size();
	}

	public void lireListeDesEmployer() {
		listeDesEmployer.clear();
		try {
			String line = "";
			BufferedReader contacts = new BufferedReader(new FileReader(".\\data\\contacts.txt"));
			while ((line = contacts.readLine()) != null) {
				listeDesEmployer.add(line);
			}
			contacts.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList nomEmploye() throws IOException {
		nomContacts.clear();
		contacts.clear();
		String line = "";

		BufferedReader lireEmploisDuTempEmployer;

		lireEmploisDuTempEmployer = new BufferedReader(new FileReader(".\\data\\contacts.txt"));

		while ((line = lireEmploisDuTempEmployer.readLine()) != null) {
			contacts.add(line);
		}
		lireEmploisDuTempEmployer.close();
		int j = 0;
		for (int k = 0; k < contacts.size(); k++) {

			if (j == k) {
				j = j + 5;
				nomContacts.add(contacts.get(k));
				System.out.println(contacts.get(k) + ".......nom employer");
			}

		}
		return nomContacts;
	}

	public Contact rechercheEmployer(String name) {
		listeDesEmployer.clear();
		lireListeDesEmployer();

		for (int i = 0; i < listeDesEmployer.size(); i++) {
			System.out.println(listeDesEmployer.get(i) + "*recherche*" + name);
			if ((listeDesEmployer.get(i).contains(name))) {
				System.out.println(listeDesEmployer.get(i) + "*trouver*" + name);
				employer.setName(listeDesEmployer.get(i));
				employer.setEmail(listeDesEmployer.get(i + 1));
				employer.setNumber(listeDesEmployer.get(i + 2));
				employer.setResponsabilite(listeDesEmployer.get(i + 3));
				k = i;
				
				i = nombreEmployer();
			}
		}
		System.out.println("l'employer rechercher :"+employer.getEmail() +employer.getNumber()+ "...." + employer.getName());
		return employer;
	}

	public void modifyNumero(String name, String newNumber) {
		Contact empTmp = new Contact(newNumber, newNumber, newNumber, newNumber);
		listeDesEmployer.clear();
		lireListeDesEmployer(); 
		
		System.out.println("L'employer trouver" + empTmp.getName() + empTmp.getNumber());
		empTmp = rechercheEmployer(name);
		empTmp.setNumber(newNumber);
		getListeDesEmployer().set(k, empTmp.getName());
		getListeDesEmployer().set(k + 1, empTmp.getEmail());
		getListeDesEmployer().set(k + 2, empTmp.getNumber());
		getListeDesEmployer().set(k + 3, empTmp.getResponsabilite());
		getListeDesEmployer().set(k + 4,"");
		
		System.out.println("L'employer trouver" + empTmp.getName() + empTmp.getNumber());
		
		File fileContact = new File(".\\data\\contacts.txt");
		fileContact.delete();
		try {
			BufferedWriter contacts = new BufferedWriter(new FileWriter(fileContact, true));
			for (int i = 0; i < getListeDesEmployer().size(); i++) {
				contacts.write(getListeDesEmployer().get(i) + "\r\n");
			}
			contacts.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void remove(String name) {
		listeDesEmployer.clear();
		lireListeDesEmployer(); 
		File f = new File(".\\data\\" + name + ".txt");
		f.delete();

		for (int i = 0; i < listeDesEmployer.size(); i++) {
			if (name.contains(listeDesEmployer.get(i))) {
				listeDesEmployer.set(i, "");
				listeDesEmployer.set(i + 1, "");
				listeDesEmployer.set(i + 2, "");
				listeDesEmployer.set(i + 3, "");
				listeDesEmployer.set(i + 4, "");
				i= listeDesEmployer.size();
			}}

			
				File fileContact = new File(".\\data\\contacts.txt");
				fileContact.delete();
				BufferedWriter contact;
				try {

					contact = new BufferedWriter(new FileWriter(fileContact, true));
					for (int i = 0; i < listeDesEmployer.size(); i++) {
					contact.write(listeDesEmployer.get(i) + "\r\n");
					}
					contact.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		

	public void reinitialiserLaSemaine() throws IOException {
		nomEmploye();
		for (int i = 0; i < getNomContacts().size(); i++) {
			File tmp = new File(".\\data\\" + getNomContacts().get(i) + ".txt");
			tmp.delete();
			System.out.println("l emplois du temps de :" + getNomContacts().get(i) + " ..est reinitialiser");
			reinitialiser(getNomContacts().get(i));
		}
	}

	public ArrayList<String> getListeDesEmployer() {
		return listeDesEmployer;
	}

	public void setListeDesEmployer(ArrayList<String> listeDesEmployer) {
		this.listeDesEmployer = listeDesEmployer;
	}

	public ArrayList<String> getNomContacts() {
		return nomContacts;
	}

	public void setNomContacts(ArrayList<String> nomContacts) {
		this.nomContacts = nomContacts;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public static void main(String[] args) throws IOException {
		new RepertoireContact();

	}

}
