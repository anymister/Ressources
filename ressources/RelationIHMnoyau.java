package ressources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RelationIHMnoyau {
private int[][] tabs;
private int tab[];
private ArrayList<String> nom;
private ArrayList<String> noms;
int n;
	public RelationIHMnoyau() {
		tabs = new int[15][15];
		tab = new int[2];
		nom=new ArrayList<String>();
		noms=new ArrayList<String>();
	}
	
	public int stringEnEntier(String string) {
		int entier = Integer.parseInt(string); 
		return entier;
	}
	
	public int convertir_tableau_En_heure(int colon,int ligne) {
		n=1;
		for(int i=0;i<10;i++) {
			for(int j=1;j<9;j++) {
				tabs[j][i] = n;
				n++;
			}
		}
		return tabs[colon][ligne];
		
	}
	public int[] convertir_Heure_En_Tableau(int heure) {
		n=1;
		
		for(int i=0;i<10;i++) {
			for(int j=1;j<9;j++) {
				tabs[j][i] = n;
				
				if(tabs[j][i] == heure) {
					tab[0]=j;
					tab[1]=i;
				}
				n++;
			}
		}
		setTab(tab);
		return tab ;
		
	}
	public ArrayList nomEmployees() throws IOException {
	
		
			String line1="";
			
			 
            	nom.clear();
            	noms.clear(); 
            	
            	
            	BufferedReader lireContact;
            	
            		lireContact = new BufferedReader(new FileReader(".\\data\\contacts.txt"));

            	while((line1=lireContact.readLine())!=null) { 
            		nom.add(line1);  
            	}
            	lireContact.close();
            	int j=0;
            	 for(int k=0;k<nom.size();k++) {
            		
            		 if (j==k) {
            		 j=j+6;
            		 noms.add(nom.get(k));
            		 System.out.println(nom.get(k));  
            	}else {
            		nom.set(k,null);
            		
            		
            	}
            		 }
            	return noms;
	}

	public int[] getTab() {
		return tab;
	}

	public void setTab(int[] tab) {
		this.tab = tab;
	}

}

