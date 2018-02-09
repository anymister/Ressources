package ressources;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {

			RepertoireContact r=new 	RepertoireContact();
			
			r.ajouterEmployer("anis","live","1996","Achef");
			r.ajouterEmployer("lydia","gmail","076100","Lchef");
			r.ajouterEmployer("femme","hotmail","089","Fchef");
			r.ajouterEmployer("liu","ber","0247","Lchef");
			r.ajouterEmployer("qaqah","tchef","07485","Qchef");
			
		
		r.modify("anis","20.08.96");
		
	}

}
