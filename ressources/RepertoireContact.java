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
	private ArrayList<String>  nomContacts;
	private Contact employer  ; 
	private Contact employe  ; 
			public RepertoireContact() {
				employer =new Contact("","","",""); 
				employe =new Contact("","","",""); 
				listeDesEmployer=new ArrayList<String> ();
				nomEmployer=new ArrayList<String> ();
			contacts=new ArrayList<String> ();
			nomContacts=new ArrayList<String> ();
		} 
			
			public void ajouterArrayList(Contact employer) {
				//listeDesEmployer.clear();
				listeDesEmployer.add(employer.getName());
				listeDesEmployer.add(employer.getEmail());
				listeDesEmployer.add(employer.getNumber());
				listeDesEmployer.add(employer.getResponsabilite());
				
			}
			
			public void ajouterEmployer(String name,String email,String number,String responsabilite) {
				
	 			
				employe.setEmail(email);
				employe.setName(name);
				employe.setNumber(number);
				employe.setResponsabilite(responsabilite); 
				if(rechercheEmployer(name)!=employe) {
				sauvegarderEmployer(employe); 
				ajouterEmploisDuTempEmployer(employe);
				}
				
			}
 
	 public void sauvegarderEmployer (Contact contact) {
			try {
				BufferedWriter contacts=new BufferedWriter
				(new FileWriter(".\\data\\contacts.txt",true));
				
		
				contacts.write("\r\n"+
				contact.getName()+"\r\n"+ 
				contact.getEmail()+"\r\n"+
				contact.getNumber()+"\r\n"+
				contact.getResponsabilite()+
				"\r\n\n"); 
				contacts.close();
				 
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void ajouterEmploisDuTempEmployer(Contact contact) {
			 
			BufferedWriter initEmploisDuTempsEmployer; 
			try {
				initEmploisDuTempsEmployer = new BufferedWriter
						(new FileWriter(new File(".\\data\\"+contact.getName()+".txt"),true));
			
			for(int i=1;i<41;i++) {
				initEmploisDuTempsEmployer.write(1+"\r\n");
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
		
			try {
				listeDesEmployer.clear(); 
				BufferedReader contacts = new BufferedReader (new FileReader(".\\data\\contacts.txt"));
				while((contacts.readLine())!=null)
				{ 
					listeDesEmployer.add(contacts.readLine());
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
        	String line=""; 
        	
        	BufferedReader lireEmploisDuTempEmployer;
        	
        		lireEmploisDuTempEmployer = new BufferedReader(new FileReader(".\\data\\contacts.txt"));

        	while((line=lireEmploisDuTempEmployer.readLine())!=null) { 
        		contacts.add(line);  
        	}
        	lireEmploisDuTempEmployer.close();
        	int j=0;
        	 for(int k=0;k<contacts.size();k++) {
        		
        		 if (j==k) {
        		 j=j+6;
        		 nomContacts.add(contacts.get(k));
        		 }
        		 
        		 }
        	 return  nomContacts;
        	}
		public Contact rechercheEmployer(String name) {
			lireListeDesEmployer(); 
		for(int i=0;i<nombreEmployer();i++) {
			if(listeDesEmployer.get(i)==name) {
				employer.setName(listeDesEmployer.get(i));
				employer.setEmail(listeDesEmployer.get(i+1)); 
				employer.setNumber(listeDesEmployer.get(i+2));
				employer.setResponsabilite(listeDesEmployer.get(i+3)); 
			}
		}
		System.out.println(employer.getEmail()+"...."+employer.getName());
		return employer;
	}
		
		public void modify(String name, String newNumber) {
					
					listeDesEmployer.clear();
					lireListeDesEmployer();
					for(int i=0;i<listeDesEmployer.size();i++) {
						if(listeDesEmployer.get(i)==name) {
							listeDesEmployer.set(i+2,newNumber);
						}
						}
					
					sauvegarderEmployer(rechercheEmployer(name));
		}
		public void remove(String name) {
			
			
			File f=new File(".\\data\\"+name+".txt");
			f.delete();
			 
			for(int i=0;i<listeDesEmployer.size();i++) {
				if(listeDesEmployer.get(i)==name) {
					listeDesEmployer.set(i,"");
				  	listeDesEmployer.set(i+1,"");
					listeDesEmployer.set(i+2,"");  
					listeDesEmployer.set(i+3,""); 
				 
				}
				else {
				BufferedWriter contact;
				try {
					
					contact = new BufferedWriter(new FileWriter(new File(".\\data\\contacts.txt"),true));
				
						contact.write(listeDesEmployer.get(i)+"\n");
						contact.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
			

	}
		
		}

		}

		public ArrayList<String> getListeDesEmployer() {
			return listeDesEmployer;
		}

		public void setListeDesEmployer(ArrayList<String> listeDesEmployer) {
			this.listeDesEmployer = listeDesEmployer;
		}
		}
