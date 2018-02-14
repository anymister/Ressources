package ressources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class EmploisDuTemp {
	
	private String semaine;
	private String jour;
	private String heure;
private Evenement event;
private int k=0;
private HashMap<String,String> jours;
private ArrayList<String> jrs;
private RepertoireContact repContact;
private ArrayList<String> EmploisDusTemps;
private BufferedWriter emploisDuTempsEmployer;

public EmploisDuTemp(Evenement event) {
	EmploisDusTemps=new ArrayList<String>();
	this.event=event;
	jours =new HashMap<String,String> ();
	jrs=new ArrayList<String>();
	repContact =new RepertoireContact();
}
public void lireEmploisDuTempEmployer(String nom) {

	BufferedReader lireEmploisDutemps;
	
		try {
			lireEmploisDutemps=new BufferedReader(new FileReader(".\\data\\semaineEmployert"+nom+".txt"));
		
		try {
			while((lireEmploisDutemps.readLine())!=null)
			{ 
				try {
					EmploisDusTemps.add(lireEmploisDutemps.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
public void modifierEmploisDuTempsEmployer(String nom,int heure,int dure) {// l heure est un chiffre entre 1 et 40
	
	lireEmploisDuTempEmployer(nom);
	
	try {
		emploisDuTempsEmployer = new BufferedWriter(new FileWriter(
				new File(".\\data\\semaineEmployert"+nom+".txt"),true));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		//la dure maximum d'un evenement est de 3
		if(EmploisDusTemps.get(heure)=="1") {
			if(dure==1) {
			EmploisDusTemps.set(heure, "0");
			}
			else if((EmploisDusTemps.get(heure+1)=="1")&&(dure==2)) {
				EmploisDusTemps.set(heure, "0");
				EmploisDusTemps.set(heure+1, "0");
			}
			else if((EmploisDusTemps.get(heure+2)=="1")&&(EmploisDusTemps.get(heure+1)=="1")&&(dure==3)) {
				EmploisDusTemps.set(heure, "0");
				EmploisDusTemps.set(heure+1, "0");
				EmploisDusTemps.set(heure+2, "0");
			}
		for(int i=0;i<EmploisDusTemps.size();i++) {
			
		
			try {
				emploisDuTempsEmployer.write(EmploisDusTemps.get(i));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			}
		try {
			emploisDuTempsEmployer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}}


public void ajouterEvenement (Evenement event) {
	File semaine=new File(".\\data\\semaine1.txt");
	BufferedReader jr;

		try {
			jr = new BufferedReader (new FileReader(semaine));
		
		while((jr.readLine())!=null)
		{ 
			
			jrs.add(jr.readLine());
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	semaine.delete();
	BufferedWriter contact;
	
	try {
		contact = new BufferedWriter(new FileWriter(new File(".\\data\\semaine1.txt"),true));
		
		repContact.lireListeDesEmployer();
		
		for(int j=0;j<repContact.nombreEmployer();j++) {
		//event.getRepContact().getListeDesEmployer().get(i)
		
			String nom=event.getRepContact().getListeDesEmployer().get(j);
			int heure=event.getReu().getHeure();
			int dure=event.getReu().getDure();
			modifierEmploisDuTempsEmployer(nom,heure,dure);
			
		}
	
	for(int i=0;i<jrs.size();i++) {
		if(jrs.get(i)==event.getReu().getJour()) {
			if(jrs.get(i)=="1") {
	//heure 8h=1  9h=2 ....
	jrs.set(i+event.getReu().getHeure(), "0");
	 }
	  else {
		  k=1;
	  }
	  }
	 
	 contact.write(jrs.get(i));
	 
	 
	 }
contact.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 }
	 
	


public void modifierEvenement() {
	
}

public void supprimerEvenement() {
	
}

}
