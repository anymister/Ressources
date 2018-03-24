package ressources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RepertoireEvenement {
	
	private ArrayList<Evenement> repertoireEvenement;

	public RepertoireEvenement() {
		
		repertoireEvenement=new ArrayList<Evenement>();
	}
	
	public void ajouterEvenement(Evenement event) {
		repertoireEvenement.add(event);
	}
	
	public void enregistrerEvenement(Evenement event) {
		try {
			String heure=""+event.getReu().getHeure();
					//chaque 5 donne c est un evenement d une heure
			BufferedWriter contact = new BufferedWriter(new FileWriter(new File(".\\data\\evenement1.txt"),true));// changer le nom d evenemnt
			//String capacite=""+event.getSalle().getCapacite();
			String dure=""+event.getReu().getDure();
			contact.write(
					heure+"\r\n"+
					event.getReu().getTypeEvenement()+"\r\n"+
					event.getMateriel().getNombreDePc()+"\r\n"+
					event.getMateriel().getNombreDeProjecteurs()+"\r\n"+
					heure+"\r\n"+
				//	capacite+"\r\n"+ 
					dure+"\r\n"+
					event.getReu().getNbPersonne()+"\r\n"
					);  
			for(int i=0;i<event.getRepContact().getListeDesEmployer().size();i++) {
				contact.write(event.getRepContact().nomEmploye()+",");  
				i=i+8; // enregistrer njuste le nom de l employer
			}  
			contact.close();
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public ArrayList<Evenement> getRepertoireEvenement() {
		return repertoireEvenement;
	}

	public void setRepertoireEvenement(ArrayList<Evenement> repertoireEvenement) {
		this.repertoireEvenement = repertoireEvenement;
	}
	
	

}
