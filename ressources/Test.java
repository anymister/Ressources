package ressources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Test {
	 
		public static void main(String[] args) {
			Materiel m=new Materiel("4","4");//nbr de pc , nbr de datashow
			Salle sal=new Salle("3","2");//capacité d une salle, nbr de salle qui ont cette capacité
			Reunion reu=new Reunion(2,"23",20,"52","conferance");//dure,nbr de personne, heure , jour
			//creer un evenement en utilisant les contacts si dessous
			RepertoireContact r=new RepertoireContact(); 
			
			r.ajouterEmployer("anis","anis@cergy.fr","01.20.10.20","Chef de Rayon");
			r.ajouterEmployer("lydia","lydia@cergy.fr","03.20.25.21","Presentateur"); 
			r.ajouterEmployer("celia","fatma@cergy.fr","03.04.50.15","Chefamectuh ");
			r.ajouterEmployer("pole","pole@cergy.fr","02.30.62.20","sous directeur");
			r.ajouterEmployer("julie","julie@cergy.fr","07.48.52.12","developpeur");  
			 
			  
			Contact c2=new Contact("lydia","lydia@cergy.fr","03.20.25.21","Presentateur");
			Contact c1=new Contact("julie","ania@cergy.fr","03.20.25.21","Presentateur"); 					
			RepertoireContact repBesoin=new RepertoireContact();   
  
			repBesoin.ajouterArrayList(c2);
			repBesoin.ajouterArrayList(c1); 
			repBesoin.ajouterEmploisDuTempEmployer(c2);  
			repBesoin.ajouterEmploisDuTempEmployer(c1);        
			Evenement ev=new Evenement(reu,m,sal,repBesoin); 
			EmploisDuTemp emt=new EmploisDuTemp(ev);        
			  
			 
		//	emt.initialiserSemaine(); 
			  
		//	emt.ajouterEvenementEmploidDuTemp(ev);  
			try {
				emt.ajouterDansEmploisDuTemps(c2.getName(), ev.getReu().getHeure(),ev.getReu().getDure(),ev);
				emt.ajouterDansEmploisDuTempsEmployer(ev);
				//emt.ajouterDansEmploisDuTemps("semaine1", ev.getReu().getHeure(),ev.getReu().getDure(),ev);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//emt.modifierEmploisDuTempsEmployer("lydia",reu.getHeure(),reu.getDure());
			//elle modifie l emplois du temps de l employer au meme temps celui de l entreprise (ou y a 1 il le remplace par 0)
			// ne marche pas si l'employer n existe pas 
	}  
 
}
