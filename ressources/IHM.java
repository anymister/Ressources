package ressources;

import java.awt.Button;

import javax.swing.JFrame;

public class IHM extends JFrame {
	private Button event;
	private Button quitter;
	private Button entreprise;
	
	public IHM() {
		init();
		setVisible(true);
	}
	
	
public void init() {
	event =new Button("Evenement");
	quitter=new Button("Quitter");
	entreprise= new Button("Entreprise");
	
	event.addActionListener(new ActionListener (evenement));
	
}
}
