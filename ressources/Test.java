package ressources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Test {
	 
		public static void main(String[] args) throws IOException {
			RepertoireSalle rs=new RepertoireSalle();
			
			
	//	
	Salle s1=new Salle(1,7);

		Salle s2=new Salle(2,8);
		Salle s3=new Salle(3,9);
		
		
		//rs.ajouterSalle(s);
		//rs.ajouterSalle(s1);
		//rs.ajouterSalle(s2);
//	rs.ajouterSalle(s3);
		
		
			Materiel m=new Materiel("4","2","3","4");//nbr de pc , nbr de datashow
			Salle sal=new Salle(30,20);//capacit� d une salle, nbr de salle qui ont cette capacit�
			Reunion reu=new Reunion(2,"23",5,"conferance");//dure,nbr de personne, heure , jour
			//creer un evenement en utilisant les contacts si dessous
			RepertoireContact r=new RepertoireContact(); 
		RepertoireSalle repSal=new 	RepertoireSalle();
		//repSal.ajouterSalle(sal);
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
			//repBesoin.ajouterEmploisDuTempEmployer(c2);  
			//repBesoin.ajouterEmploisDuTempEmployer(c1);        
			Evenement ev=new Evenement(reu,m,30,repBesoin); 
			EmploisDuTemp emt=new EmploisDuTemp(ev);
		//	emt.traduireSelectionEnIHMenHeures(2, 3);
			
	
		//	RepertoireSalle s=new RepertoireSalle();
			//s.choisirSallePourEvenement(9);
		//	emt.nomDesEmployer();
		  
			  
		//	emt.initialiserSemaine(); 
			  
		//emt.ajouterEvenementEmploidDuTemp(ev);  
			try {
				emt.ajouterDansEmploisDuTempsEntreprise(ev);
				emt.ajouterDansEmploisDuTempsEmployer(ev);
				//System.out.println(emt.traduireSelectionEnIHMenHeures(2, 3));
				//emt.ajouterDansEmploisDuTemps("semaine1", ev.getReu().getHeure(),ev.getReu().getDure(),ev);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		/*	//emt.modifierEmploisDuTempsEmployer("lydia",reu.getHeure(),reu.getDure());
			//elle modifie l emplois du temps de l employer au meme temps celui de l entreprise (ou y a 1 il le remplace par 0)
			// ne marche pas si l'employer n existe pas 
	*/} 
 
}
