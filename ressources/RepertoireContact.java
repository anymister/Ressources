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
	private Contact employer  ;
	private Contact cntct=null;
	
			public RepertoireContact() {
				employer =new Contact("","","","");
				listeDesEmployer=new ArrayList<String> ();
		
		}
			
			public void ajouterEmployer(String name,String email,String number,String responsabilite) {
				
				employer.setEmail(email);
				employer.setName(name);
				employer.setNumber(number);
				employer.setResponsabilite(responsabilite);
				sauvegarderEmployer(employer);
				
			}

		public void sauvegarderEmployer (Contact contact) {
			try {
				BufferedWriter contacts=new BufferedWriter
				(new FileWriter(".\\data\\contacts.txt",true));
				contacts.write("\n"+
				contact.getName()+"\n"+
				contact.getEmail()+"\n"+
				contact.getNumber()+"\n"+
				contact.getResponsabilite()+
				"\n");
				contacts.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public int nombreEmployer() {
			return listeDesEmployer.size();
		}
		
		public void lireListeDesEmployer() {
			BufferedReader contacts = null;
			try {
				contacts = new BufferedReader (new FileReader(".\\data\\contacts.txt"));
			} catch (FileNotFoundException e1) { 
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				while(contacts.readLine()!=null)
				{
					listeDesEmployer.add(contacts.readLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			try {
				contacts.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

		public Contact rechercheEmployer(String name) throws IOException  {
		
		for(int i=0;i<nombreEmployer();i++) {
		
			if(name==listeDesEmployer.get(i)) {
				
				cntct.setName(listeDesEmployer.get(i));
				cntct.setEmail(listeDesEmployer.get(i+1));
				cntct.setNumber(listeDesEmployer.get(i+2));
				cntct.setResponsabilite(listeDesEmployer.get(i+3));
			}
		}
		return cntct;
	}
		
		public void modify(String name, String newNumber) {
				
					
						
						try {
							cntct=rechercheEmployer(name);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						remove(name);
						cntct.setNumber(newNumber);
						sauvegarderEmployer(cntct);
				}
					

		public void remove(String name) {
			
			listeDesEmployer.clear();
			lireListeDesEmployer();
			File f=new File(".\\data\\contacts.txt");
			f.delete();
			 
			for(int i=0;i<listeDesEmployer.size();i++) {
				if(name==listeDesEmployer.get(i)) {
					listeDesEmployer.set(i,"");
				  	listeDesEmployer.set(i+1,"");
					listeDesEmployer.set(i+2,"");
					listeDesEmployer.set(i+3,"");
				}
				else {
				BufferedWriter contacts;
				try {
					
					contacts = new BufferedWriter(new FileWriter(new File(".\\data\\contacts.txt"),true));
				
						contacts.write(listeDesEmployer.get(i)+"\n");
						contacts.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				}
			
			

	}
		
		}

}
