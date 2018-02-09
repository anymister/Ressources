package ressources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Semaine {
	
	private Evenement event;
	private Jour jour;
	private int heures;
	private ArrayList <String> semaine;
	
	public Semaine(Jour jour,Evenement event) {
		this.jour=jour;
		this.event=event;
		semaine=new ArrayList <String> ();
	}
	
	public void ajouterEmployer(String name,String email,String number,String responsabilite) {
		
		
		
	}
	public void sauvegarderEvenement(Evenement event) {
		BufferedWriter evenement = null;
		try {
			 evenement=new BufferedWriter(new FileWriter(".\\data\\semaine1.txt",true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*		heures=+event.getDure();
			jour.setJour(event.getJour().getJour()+1);
			if((heures<=8)&&(jour.getJour()<=5)) {*/
				
			
			try {
				evenement.write("/n"+
						event.getDure()+"/n"+
						event.getSalle()+"/n"+
						event.getJour()+"/n"+
						event.getReu().getNbPersonne()+"/n");
						// mazal les materiaux
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		/*	return 1;
			}
			else 
				return 0;*/
		
		
	}





public void lireEvenementsSemaine() {
	BufferedReader semaines = null;
	try {
		semaines = new BufferedReader (new FileReader("..\\data\\semaine1.txt"));
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	try {
		while(semaines.readLine()!=null)
		{
			semaine.add(semaines.readLine());
			semaines.close();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}

public Evenement rechercheDisponibilte(Evenement event)  {
	Evenement evenement=null;
	
	Salle salle;
	Reunion reu;
	Materiel materiel;
	
for(int i=0;i<semaine.size();i++) {
	
	jour.setJour(semaine.get(i+2));
	salle.setCapacite(semaine.get(i+1));
	reu.setDure(semaine.get(i));
	reu.setNbPersonne(semaine.get(i+3));
	
	materiel.setNombreDePc(semaine.get(i));
	materiel.setNombreDeProjecteurs(semaine.get(i));
	
	reu.setMateriel(materiel);
	
	evenement.setDure(semaine.get(i));
	evenement.setJour(jour);
	evenement.setReu(reu);
	evenement.setSalle(salle);
	if(name==listeDesEmployer.get(i)) {
		evenement=event;
		
	}
}
return evenement;
}

public void modify(String name, String newNumber) {
		try {
				Contact employer;
				employer=rechercheEmployer(name);
				remove(name);
				employer.setNumber(newNumber);
				sauvegarderEmployer(employer);
		}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

public void remove(String name) {
	
		
	

}



}
