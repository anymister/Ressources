package ressources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RepertoireSalle {


private ArrayList <String> listeDesSalles;

public RepertoireSalle()
{ 
	listeDesSalles =new ArrayList<String>();
}
public int stringEnEntier(String string) {
	int entier = Integer.parseInt(string);  
	return entier;
}
public void lireListeDesSalles() {// Enregitrer le nombre de salle qui reste apres chaque evenement organiser
	try {
		File salle=new File(".\\data\\salles.txt");
		BufferedReader lireSalle=new BufferedReader(new FileReader(".\\data\\salles.txt"));
	listeDesSalles.clear();
	String line="";
		while((line=lireSalle.readLine())!=null )
		{
			listeDesSalles.add(line);
	
		}
		lireSalle.close();	
		salle.delete(); 
	}
	catch (IOException e) { 
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public void ajouterSalle(Salle sall) {// les salles sont enregistrer dans le fichier de façon ou la premiere ligne represente 
	//la capacite d'une salle et la ligne qui suie represente le nombre de salle contenent la mem capacité
	try {
		String nbrSalles=""+sall.getNbSalles(); 
		String capaciteSalle=""+sall.getCapacite();
		//
		File salle=new File(".\\data\\salles.txt");
		BufferedWriter  salles=new BufferedWriter(new FileWriter(new File(".\\data\\salles.txt"),true));;
		int k=0;
		lireListeDesSalles();
		new File(".\\data\\salles.txt").delete(); 
				for(int i=0;i<listeDesSalles.size();i+=2) { 
					
					
					if(Integer.parseInt(listeDesSalles.get(i))==sall.getCapacite()) {
						int nbr=stringEnEntier(listeDesSalles.get(i+1))+sall.getNbSalles();
						String newNbr=""+nbr;
						listeDesSalles.set(i+1,newNbr); 
						k=1;
						
					}
				
				} 
			
			if(k==0) {   
				listeDesSalles.add(capaciteSalle);
				listeDesSalles.add(nbrSalles);
			}
			salle.deleteOnExit();
			for(int j=0;j<listeDesSalles.size();j++) {
			salles.write(listeDesSalles.get(j)+"\r\n");
			}
			salles.close();
			
				for(int i=0;i<listeDesSalles.size();i++) {
					System.out.println(listeDesSalles.get(i)+k);
				}
}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void enleveSalle(Salle sall) {// les salles sont enregistrer dans le fichier de façon ou la premiere ligne represente 
	//la capacite d'une salle et la ligne qui suie represente le nombre de salle contenent la mem capacité
	try {
		String nbrSalles=""+sall.getNbSalles();
		String capaciteSalle=""+sall.getCapacite();
		//
		File salle=new File(".\\data\\salles.txt");
		BufferedWriter  salles=new BufferedWriter(new FileWriter(new File(".\\data\\salles.txt"),true));;
		
		lireListeDesSalles();
		new File(".\\data\\salles.txt").delete();
				for(int i=0;i<listeDesSalles.size();i+=2) { 
					
					
					if(stringEnEntier(listeDesSalles.get(i))==sall.getCapacite()) {
						int nbr=stringEnEntier(listeDesSalles.get(i+1))-1;
						String newNbr=""+nbr;
						listeDesSalles.set(i+1,newNbr);
					
					}
				
				}
			
			
	 
			for(int j=0;j<listeDesSalles.size();j++) {
			salles.write(listeDesSalles.get(j)+"\r\n");
			}
			salles.close();
			
				for(int i=0;i<listeDesSalles.size();i++) {
					System.out.println(listeDesSalles.get(i));
				}
}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public Salle choisirSallePourEvenement(int nbPersonne) { 
	lireListeDesSalles();
	Salle salle=null;
	int tmp=Integer.parseInt(getListeDesSalles().get(0));
	int j=0;
	for(int i=2;i<listeDesSalles.size();i+=2) { 
		if((Integer.parseInt(getListeDesSalles().get(i))>tmp)&&(tmp>=nbPersonne)) {//lire comme un entier 	if(listeDesSalles.get(2*i)<nbPersonne) 
			tmp= Integer.parseInt(getListeDesSalles().get(i));
			j=i;
		}
		
	}
	//salle.setNbSalles(Integer.parseInt(getListeDesSalles().get(j+1)));
	//salle.setCapacite(Integer.parseInt(getListeDesSalles().get(j)));
	
	//enleverSalle(salle);
	
		System.out.println(getListeDesSalles().get(j)+tmp);
	
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
				String sallCapacite=""+sall.getCapacite();
				for(int i=0;i<listeDesSalles.size();i++) { 
					if(listeDesSalles.get(2*i)==sallCapacite) {// si il y a deja des salles qui ont la meme capacite
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

public ArrayList<String> getListeDesSalles() {
	return listeDesSalles;
}
public void setListeDesSalles(ArrayList<String> listeDesSalles) {
	this.listeDesSalles = listeDesSalles;
}

}
