package ressources;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmploisDuTempEnHTML {
	private ArrayList<String> emploisDuTemps;
	private RelationIHMnoyau rIHMn;
	private int[][] tab;

	public EmploisDuTempEnHTML() {
		emploisDuTemps = new ArrayList<String>();
		rIHMn = new RelationIHMnoyau();
		tab = new int[20][20]; 
		/*try { 
			convertirTXTenHTML(".\\data\\semaine1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	public void afficherPageWeb(ArrayList emt, String nom) throws IOException {
		File html = new File(".\\data\\" + nom + ".html");
		html.delete();
		tab = rIHMn.tableau_En_heure();
		BufferedWriter writeHTML = new BufferedWriter(new FileWriter(html, true));

		writeHTML.write("<!DOCTYPE html >\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "	<title >");
		writeHTML.write(nom);
		writeHTML.write("</title>\r\n" + "</head>\r\n" + "\r\n" + "<body style=\" background-image:url(../img/fond.jpg)\">");
		writeHTML.write("<h1 style=\" margin-left:40%;\">");
		writeHTML.write("Emplois du temps de :" + nom);
		writeHTML.write("</h1>");
		writeHTML.write("<pn style=\" background:black; color:white;margin-left:40%;\">Vert ====> Libre__________Rouge ====> Occupé</p>");
		writeHTML.write("<table style=\" margin-left:32%;\">");

		for (int i = 0; i < 6; i++) {
			writeHTML.write("<tr style=\"border: 3px solid blueviolet; background:black;\">");

			for (int j = 0; j < 9; j++) {
				if ((j == 0) && (i == 0)) {
					writeHTML.write("<td>/////////</td>");
				} else if ((i == 0) && (j == 1)) {
					writeHTML.write("<td>//////</td>");
				} else if ((i == 0) && (j == 2)) { 
					writeHTML.write("<td>8h-9h</td>");
				} else if ((i == 0) && (j == 3)) {
					writeHTML.write("<td>9h-10h</td>");
				} else if ((i == 0) && (j == 4)) {
					writeHTML.write("<td>10h-11h</td>");
				} else if ((i == 0) && (j == 5)) {
					writeHTML.write("<td>11h-12h</td>");
				} else if ((i == 0) && (j == 6)) {
					writeHTML.write("<td>12h-13h</td>");
				} else if ((i == 0) && (j == 7)) {
					writeHTML.write("<td>13h-14h</td>");
				} else if ((i == 0) && (j == 8)) {
					writeHTML.write("<td>15h-16h</td>");
				} else if ((i == 1) && (j == 0)) {
					writeHTML.write("<td>Lundi</td>");
				} else if ((i == 2) && (j == 0)) {
					writeHTML.write("<td>Mardi</td>");
				} else if ((i == 3) && (j == 0)) {
					writeHTML.write("<td>Mercredi</td>");
				} else if ((i == 4) && (j == 0)) {
					writeHTML.write("<td>Jeudi</td>");
				} else if ((i == 5) && (j == 0)) {
					writeHTML.write("<td>Vendredi</td>");
				}

				else {
					writeHTML.write("<td style=\"border: 3px solid blueviolet;background : ");

					if (Integer.parseInt((String) emt.get(tab[j][i])) == 0) {
						writeHTML.write("red;\">///////////");
					} else {
						writeHTML.write("green;\">");

					}
					writeHTML.write("</td>");
				}
			}
			writeHTML.write("</tr>");
		}
		writeHTML.write("</body></html>");
		writeHTML.close();
		Desktop.getDesktop().open(html);
	}

	public void convertirTXTenHTML(String nom) throws IOException {
		BufferedReader lireEmploisDutemps;
		emploisDuTemps.clear();
		String line="";
		int n = 0;
		try {
			lireEmploisDutemps = new BufferedReader(new FileReader(".\\data\\" + nom + ".txt"));

			try {
				while ((line=lireEmploisDutemps.readLine()) != null) {
					emploisDuTemps.add(line);
					System.out.println(emploisDuTemps.get(n) + "\r\n" + n);
					n++;
				}
				lireEmploisDutemps.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		afficherPageWeb(emploisDuTemps, nom);

	}

	
}
