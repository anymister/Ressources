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

public void ajouterSalle(Salle sall) {
	try {
		BufferedReader lireSalle=new BufferedReader(new FileReader(".\\data\\salles.txt"));
		BufferedWriter  salles=new BufferedWriter(new FileWriter(".\\data\\salles.txt",true));;
			
				while(lireSalle.readLine()!=null)
				{
					listeDesSalles.add(lireSalle.readLine());
			
				}
				lireSalle.close();
				
				for(int i=0;i<listeDesSalles.size();i++) {
					if(listeDesSalles.get(2*i)==sall.getCapacite()) {
						File salle=new File(".\\data\\salles.txt");
						salle.delete();
						listeDesSalles.add(listeDesSalles.get(2*i+1)+1);
						listeDesSalles.set(2*i+1,listeDesSalles.get(2*i+1)+1);
						
						for(int j=0;j<listeDesSalles.size();j++) {
							salles.write(listeDesSalles.get(j));
							}
						salles.close();
					}
					else {
					}
					
					salles.write("/n"+sall.getCapacite()+"/n"+sall.getNbSalles()+"/n");
					salles.close();
						}
				}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
