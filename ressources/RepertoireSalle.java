package ressources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RepertoireSalle {

private Salle salle;
private ArrayList <String> listeDesSalles;

public RepertoireSalle(Salle salle)
{
	this.salle=salle;
	listeDesSalles =new ArrayList<String>();
}

public void lireListeDesSalles() {// Enregitrer le nombre de salle qui reste apres chaque evenement organiser
	try {
		BufferedReader lireSalle=new BufferedReader(new FileReader(".\\data\\sallesretante.txt"));
		
		while(lireSalle.readLine()!=null)
		{
			listeDesSalles.add(lireSalle.readLine());
	
		}
		lireSalle.close();	
				}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void ajouterSalle(Salle sall) {// les salles sont enregistrer dans le fichier de façon ou la premiere ligne represente 
	//la capacite d'une salle et la ligne qui suie represente le nombre de salle contenent la mem capacité
	try {
		
		BufferedWriter  salles=new BufferedWriter(new FileWriter(".\\data\\salles.txt",true));;
			
		lireListeDesSalles();
				int k=0;
				File salle=new File(".\\data\\salles.txt");
				
				salle.delete();
				for(int i=0;i<listeDesSalles.size();i++) { 
					if(listeDesSalles.get(2*i)==sall.getCapacite()) {// si il y a deja des salles qui ont la meme capacite
						listeDesSalles.set(2*i+1,listeDesSalles.get(2*i+1)+1);
						i=listeDesSalles.size();
						k=1;
					}
					}
					if (k==0) {// si c est une nouvelle capacite
						listeDesSalles.add(sall.getCapacite());
						listeDesSalles.add(sall.getNbSalles());
					}
					
					for(int j=0;j<listeDesSalles.size();j++) {
					salles.write(listeDesSalles.get(j));
					
					}
					salles.close();
					
						
				}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public Salle choisirSallePourEvenement(String nbPersonne) {
	lireListeDesSalles();
	Salle salle=null;
	for(int i=0;i<listeDesSalles.size();i++) { 
		if(listeDesSalles.get(2*i)==nbPersonne) {//lire comme un entier 	if(listeDesSalles.get(2*i)<nbPersonne) 
			salle.setCapacite(listeDesSalles.get(2*i));
			salle.setNbSalles(listeDesSalles.get(2*i+1));
		}
	}
	
	return salle;// parcourir l arraylist pour choisir le type de salle en fonction du nombre de personne participant à l'evenement
	
}
public void enleverSalle(Salle sall) {
	//a chaque fois ou il organise un evenement il dois soustraire
	try {
		BufferedReader lireSalle=new BufferedReader(new FileReader(".\\data\\sallesretante.txt"));
		BufferedWriter  sallesRestente=new BufferedWriter(new FileWriter(".\\data\\sallesretante.txt",true));;
			
				while(lireSalle.readLine()!=null)
				{
					listeDesSalles.add(lireSalle.readLine());
			
				}
				
				File salle=new File(".\\data\\sallesretante.txt");
				lireSalle.close();
				salle.delete();
				for(int i=0;i<listeDesSalles.size();i++) { 
					if(listeDesSalles.get(2*i)==sall.getCapacite()) {// si il y a deja des salles qui ont la meme capacite
						listeDesSalles.set(2*i+1,listeDesSalles.get(2*i+1)+(-1));
						i=listeDesSalles.size();
					
					}
					}
					
					for(int j=0;j<listeDesSalles.size();j++) {
						sallesRestente.write(listeDesSalles.get(j));
					
					}
					sallesRestente.close();
					
						
				}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
