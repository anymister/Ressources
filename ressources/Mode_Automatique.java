package ressources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Mode_Automatique {
	private RepertoireEvenement RE = new RepertoireEvenement();
	private ModeSemiAutomatique MSA = new ModeSemiAutomatique();
	private ArrayList<String> emtEmployer;
	private ArrayList<String> emtEntreprise;
	private ArrayList<String> creneauDispo;
	private ArrayList<Evenement> evenements;
	private Evenement event;
	private RepertoireEvenement repEvent; 
	private EmploisDuTemp emt;

	public Mode_Automatique() {
		emtEmployer=new ArrayList<String>();
		emtEntreprise=new ArrayList<String>();
		creneauDispo=new ArrayList<String>();
		evenements=new ArrayList<Evenement>();
		event=new Evenement(null, null, null, null); 
		repEvent =new RepertoireEvenement(); 
		emt=new EmploisDuTemp(event);
		creneauDispo("lea");
	}

	public ArrayList creneauDispo(String nom) {
		BufferedReader lireEmploisDutemps;
		String line = "";

		try {
			lireEmploisDutemps = new BufferedReader(new FileReader(".\\data\\" + nom + ".txt"));
			emtEmployer.clear();
			try {
				while ((line = lireEmploisDutemps.readLine()) != null) {
					emtEmployer.add(line);
				}
				lireEmploisDutemps.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader lireEmploisEntreprise;
		String line1 = "";

		try {
			lireEmploisEntreprise = new BufferedReader(new FileReader(".\\data\\semaine1.txt"));
			emtEntreprise.clear();
			try {
				while ((line1 = lireEmploisEntreprise.readLine()) != null) {
					emtEntreprise.add(line1);
				}
				lireEmploisEntreprise.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		creneauDispo.clear();
		for(int i=0;i<40;i++) {
			if(emtEntreprise.get(i).contains("1")&&(emtEmployer.get(i).contains("1"))) {
				creneauDispo.add("1");
			}
			else creneauDispo.add("0"); 
			System.out.println("entreprise....."+emtEntreprise.get(i)+"....employer :"+emtEmployer.get(i)+".......resultat   :"+creneauDispo.get(i));
		}
		
		try {
			emt.sauvegardeEmploisDuTempsEmployer(creneauDispo, "crenaux");
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		return creneauDispo ;
		
	}
	public int placerLesEvenement(Evenement event) {
for(int j=0;j<event.getRepContact().getNomEmployer().size();j++) {
creneauDispo(event.getRepContact().getNomEmployer().get(j));
for(int i=0;i<getCreneauDispo().size();i++) {
	if(getCreneauDispo().get(i).contains("1")) {
if(event.getReu().getDure()==1) {
	return i; 
}
else if(event.getReu().getDure()==2) {
	return i;
}
else if(event.getReu().getDure()==3) {
	return i;
}
else if(event.getReu().getDure()==4) {
	return i;
}
else if(event.getReu().getDure()==5) {
	return i;	
}else return 111;
}
else return 111;
}
}
	return 111;	
	}
	public void ajouterEvenement(Evenement event) {
		evenements.add(event);
		
	}
	
	
	public ArrayList<Evenement> getEvenements() {
		return evenements;
	}

	public void setEvenements(ArrayList<Evenement> evenements) {
		this.evenements = evenements;
	}

	public ArrayList<String> getCreneauDispo() {
		return creneauDispo;
	}

	public void setCreneauDispo(ArrayList<String> creneauDispo) {
		this.creneauDispo = creneauDispo;
	}

	public static void main(String[] args) throws IOException {
		new  Mode_Automatique();
			}

}
