package ressources;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class IHM {

public static class newJFrame extends javax.swing.JFrame {

    public newJFrame() {
    	contact =new ArrayList<String> ();
    	contacts =new ArrayList<String> ();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(254, 232, 232));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { 
                {"Lundi", 1, null, null, null, null, null, null, null},
                {"Mardi", null, null, null, null, null, null, null, null},
                {"Mercredi", null, null, null, null, null, null, null, null},
                {"Jeudi", null, null, null, null, null, null, null, null},
                {"Vendredi", null, null, null, null, null, null, null, null}
            },
            new String [] { 
                "", "8h00-9h00", "9h00-10h00", "10h00-11h00", "11h00-12h00", "12h00-13h00", "13h00-14h00", "14h00-15h00", "15h00-16h00"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAlignmentX(5.0F);
        jTable1.setAlignmentY(2.0F);
        jTable1.setCellSelectionEnabled(true);
        jTable1.setRowHeight(50);
        jTable1.setRowMargin(10);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleParent(jButton3);

        jLabel1.setText("Evenement :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réunion", "Conférence", "Autre..." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
               
            }
        });

        jLabel2.setText("Materiel :");

        jCheckBox1.setText("Pc");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Tableau");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Projecteur");

        jCheckBox4.setText("Micro");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton3.setText("Mon Entreprise");
        jButton3.addActionListener(new ActionEntreprise() );
    /*    jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                 IHMEntreprise c=new IHMEntreprise();
                
            }
        });*/

        jLabel3.setText("Employés :");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
        	public int getSize() { 
            	contact.clear();
            	contacts.clear();
            	String line=""; 
            	
            	BufferedReader lireEmploisDuTempEmployer;
            	try {
            		lireEmploisDuTempEmployer = new BufferedReader(new FileReader(".\\data\\contacts.txt"));

            	while((line=lireEmploisDuTempEmployer.readLine())!=null) { 
            		contact.add(line);  
            	}
            	lireEmploisDuTempEmployer.close();
            	int j=0;
            	 for(int k=0;k<contact.size();k++) {
            		
            		 if (j==k) {
            		 j=j+6;
            		 contacts.add(contact.get(k));
            		 System.out.println(contact.get(k)); 
            	}else {
            		contact.set(k,null);
            		
            		
            	}
            		 }
            	
            	 } catch (FileNotFoundException e) {
            	 } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            return contacts.size();}
            public String getElementAt(int i) { 
            	
        	
        	 
            	return contacts.get(i); }  
        });
        jScrollPane2.setViewportView(jList1);

        jLabel4.setText("Durée de l'événement :");

        textField1.setText("en heure...");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        textField2.setText("textField2");

        jLabel5.setText("Salle :");

        jButton1.setText("Effacer");
        jButton1.setActionCommand("Effacer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	int option = JOptionPane.showConfirmDialog(null, 
    					
    			        "Voulez-vous vraiment effacer?", 
    			        "Confirmation", 
    			        JOptionPane.YES_NO_OPTION, 
    			        JOptionPane.QUESTION_MESSAGE);

    			      if(option == JOptionPane.OK_OPTION){
    			    	  
                jButton1ActionPerformed(evt);
                textField1.setText("");  
          	  textField2.setText("");
          	  textField3.setText("");
          	  textField4.setText("");
          	  textField5.setText("");
          	  textField6.setText("");
          	  EmploisDuTemp emt=new EmploisDuTemp(null);
          	}}
        });

        jButton2.setText("Sauvegarder");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new SauvegardeAction());
        
        textField3.setText("Quantité");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            }
        });

        textField4.setText("Quantité");

        textField5.setText("Quantité");

        textField6.setText("Quantité");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Aide");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBox2)
                                                    .addComponent(jCheckBox4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(139, 139, 139)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(126, 126, 126)))
                                .addGap(236, 236, 236))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1)
                            .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    private class ActionEntreprise implements ActionListener{
  		public void actionPerformed(java.awt.event.ActionEvent evt) {
  			new IHMEntreprise();
  		}
  		
    }
    private class SauvegardeAction implements ActionListener{
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			int option = JOptionPane.showConfirmDialog(null, 
					
			        "Voulez-vous vraiment sauvegarder l'evenement?",  
			        "Confirmation", 
			        JOptionPane.YES_NO_OPTION, 
			        JOptionPane.QUESTION_MESSAGE);

			      if(option == JOptionPane.OK_OPTION){
			    	  
           		 RepertoireContact repBesoinEmployer=new RepertoireContact(); 
          	        repBesoinEmployer.lireListeDesEmployer();
          for(int j=0;j<repBesoinEmployer.getListeDesEmployer().size();j++) {
           		
           		
           		System.out.println("*"+repBesoinEmployer.getListeDesEmployer().get(j)+"*");
           		
           	}
           	
			String dure = textField1.getText();
			
			String heure = textField2.getText();
			String nbrPersonne = textField3.getText();
			String nom=jList1.getSelectedValue();
			String nbrTableau= textField4.getText(); 
			String nbrMicros= textField5.getText();
			String nbrProjecteurs= textField5.getText();
			String nbrPc= textField6.getText(); 
			String typeEvenement=(String) jComboBox1.getSelectedItem();
			jMenu1.getSelectedIcon();
			
			System.out.println(dure+heure+nom+nbrTableau+nbrPc+jList1.getSelectedValue()+jComboBox1.getSelectedItem());
			//RepertoireContact repBesoinEmployer=new RepertoireContact(); 
			Contact employer=repBesoinEmployer.rechercheEmployer(nom);
			repBesoinEmployer.ajouterArrayList(employer);
		
			Materiel materiel=new Materiel(nbrTableau,nbrPc);
			if((dure==null)||(nbrPersonne==null)||(nom==null)||(nbrTableau==null)||(nbrPc==null)||(jComboBox1.getSelectedItem()==null)) {
				JOptionPane.showMessageDialog(null,"Attention !Des informations manquent à votre évènement",
		    			  "Information", JOptionPane.INFORMATION_MESSAGE);
				
			}
		
				int dur = Integer.parseInt(dure); 
				int nbPersonne = Integer.parseInt(nbrPersonne); 
				
				int heur=0;
				
				 Reunion reunion=new Reunion(dur,nbrPersonne,heur,typeEvenement);
				 heur = reunion.traduireSelectionEnIHMenHeures(jTable1.getSelectedColumn(),
						 jTable1.getSelectedRow());
				 reunion.setHeure(heur);
				 Evenement event=new Evenement (reunion,materiel,nbPersonne,repBesoinEmployer);
				EmploisDuTemp emploisTemp=new EmploisDuTemp(event);
				 
			//	int nbPersonne = Integer.parseInt(nbrPersonne); 
				
				
		
			
		
			try {
				emploisTemp.ajouterDansEmploisDuTempsEmployer(event);
				emploisTemp.ajouterDansEmploisDuTempsEntreprise(event);
				if(emploisTemp.ajouterDansEmploisDuTempsEmployer(event)==0) {
					JOptionPane.showMessageDialog(null,"Attention ! Le creneau que vous avez choisis n'est pas disponible",
			    			  "Information", JOptionPane.INFORMATION_MESSAGE);
				}else
				{
					JOptionPane.showMessageDialog(null,"L'evenement à etais enregistrer avec succès",
			    			  "Information", JOptionPane.INFORMATION_MESSAGE);
				}
				if(emploisTemp.ajouterDansEmploisDuTempsEntreprise(event)==0) {
					JOptionPane.showMessageDialog(null,"Attention ! Le creneau que vous avez choisis n'est pas disponible",
			    			  "Information", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"L'evenement à etais enregistrer avec succès",
			    			  "Information", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			} catch (IOException e) {  
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			      }
			
		}
		}
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private JButton jButton3;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private ArrayList<String> contact;
    private ArrayList<String> contacts;
    // End of variables declaration                   
}

}
/*
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IHM {

public static class newJFrame extends javax.swing.JFrame {
	
}
/*	
	 private ArrayList<String> nomEmployer;
	 private ArrayList<String> contacts;
    public newJFrame() {
    	
    	nomEmployer=new ArrayList<String>();
    	contacts=new ArrayList<String>();
        initComponents();
    }
 
 
	
	/*private Materiel materiel=new Materiel(null,null);
    private Reunion reunion=new Reunion(0, "", 0, "");
	private Evenement event=new Evenement (reunion,materiel,0,repBesoinEmployer);
	private EmploisDuTemp emploisTemp=new EmploisDuTemp(event);*/
   /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>(); 
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(254, 232, 232));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Lundi", null, null, null, null, null, null, null, null},
                {"Mardi", null, null, null, null, null, null, null, null},
                {"Mercredi", null, null, null, null, null, null, null, null},
                {"Jeudi", null, null, null, null, null, null, null, null},
                {"Vendredi", null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "8h00-9h00", "9h00-10h00", "10h00-11h00", "11h00-12h00", "12h00-13h00", "13h00-14h00", "14h00-15h00", "15h00-16h00"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAlignmentX(5.0F);
        jTable1.setAlignmentY(2.0F);
        jTable1.setCellSelectionEnabled(true);
        jTable1.setRowHeight(50);
        jTable1.setRowMargin(10);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getAccessibleContext().setAccessibleParent(jToggleButton1);

        jLabel1.setText("Evenement :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réunion", "Conférence", "Autre..." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Materiel :");

        jCheckBox1.setText("Pc");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Tableau"); 
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Projecteur");

        jCheckBox4.setText("Micro");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Mon Entreprise");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Employés :");
      
       
        
            
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
        	
        	
        		
        	
        	
            public int getSize() { 
            	nomEmployer.clear();
            	contacts.clear();
            	String line=""; 
            	
            	BufferedReader lireEmploisDuTempEmployer;
            	try {
            		lireEmploisDuTempEmployer = new BufferedReader(new FileReader(".\\data\\contacts.txt"));

            	while((line=lireEmploisDuTempEmployer.readLine())!=null) { 
            		nomEmployer.add(line);  
            	}
            	lireEmploisDuTempEmployer.close();
            	int j=0;
            	 for(int k=0;k<nomEmployer.size();k++) {
            		
            		 if (j==k) {
            		 j=j+6;
            		 contacts.add(nomEmployer.get(k));
            		 System.out.println(nomEmployer.get(k)); 
            	}else {
            		nomEmployer.set(k,null);
            		
            		
            	}
            		 }
            	
            	 } catch (FileNotFoundException e) {
            	 } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            return contacts.size();}
            public String getElementAt(int i) { 
            	
        	
        	 
            	return contacts.get(i); }  
        });
        jScrollPane2.setViewportView(jList1);

        jLabel4.setText("Durée de l'événement :");

        textField1.setText("en heure...");
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
        });

        textField2.setText("textField2");

        jLabel5.setText("Nombre de personne :");

        jButton1.setText("Effacer");
        jButton1.setActionCommand("Effacer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	  textField1.setText("");  
            	  textField2.setText("");
            	  textField3.setText("");
            	  textField4.setText("");
            	  textField5.setText("");
            	  textField6.setText("");
            	  }
        });

        jButton2.setText("Sauvegarder");
        jButton2.setToolTipText("");
      
        
           
            jButton2.addActionListener(new SauvegardeAction());
            
        textField3.setText("Quantité"); 
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            } 
        }); 

        textField4.setText("Quantité");

        textField5.setText("Quantité");

        textField6.setText("Quantité");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Aide");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCheckBox2)
                                                    .addComponent(jCheckBox4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(139, 139, 139)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(126, 126, 126)))
                                .addGap(236, 236, 236))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1)
                            .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    private class SauvegardeAction implements ActionListener{
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			
           		 RepertoireContact repBesoinEmployer=new RepertoireContact(); 
          /* 	        repBesoinEmployer.lireListeDesEmployer();
          for(int j=0;j<repBesoinEmployer.getListeDesEmployer().size();j++) {
           		
           		
           		System.out.println("*"+repBesoinEmployer.getListeDesEmployer().get(j)+"*");
           		
           	}
           	*/
           /*	
			String dure = textField1.getText();
			
			String heure = textField2.getText();
			String nbrPersonne = textField3.getText();
			String nom=jList1.getSelectedValue();
			String nbrTableau= textField4.getText();
			String nbrMicros= textField5.getText();
			String nbrProjecteurs= textField5.getText();
			String nbrPc= textField6.getText(); 
			String typeEvenement=(String) jComboBox1.getSelectedItem();
			jMenu1.getSelectedIcon();
		 
			System.out.println(dure+heure+nom+nbrTableau+nbrPc+jList1.getSelectedValue()+jComboBox1.getSelectedItem());
			//RepertoireContact repBesoinEmployer=new RepertoireContact(); 
			Contact employer=repBesoinEmployer.rechercheEmployer(nom);
			repBesoinEmployer.ajouterArrayList(employer);
			Materiel materiel=new Materiel(nbrTableau,nbrPc);
				int dur = Integer.parseInt(dure); 
				int nbPersonne = Integer.parseInt(nbrPersonne); 
				int heur = Integer.parseInt(nbrMicros);
				
				 Reunion reunion=new Reunion(dur,nbrPersonne,heur,typeEvenement);
				 Evenement event=new Evenement (reunion,materiel,nbPersonne,repBesoinEmployer);
				EmploisDuTemp emploisTemp=new EmploisDuTemp(event);
				 
			//	int nbPersonne = Integer.parseInt(nbrPersonne); 
				
			
			
		//nbr de pc , nbr de datashow
			try {
				emploisTemp.ajouterDansEmploisDuTempsEmployer(event);
				emploisTemp.ajouterDansEmploisDuTempsEntreprise(event);
			} catch (IOException e) {  
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Salle sal=new Salle("3","2");//capacité d une salle, nbr de salle qui ont cette capacité
			//Reunion reu=new Reunion(dure,nbrPersonne,heure,"52","conferance");//dure,nbr de personne, heure , jour
			
		/*	Contact c2=new Contact("anis","lydia@cergy.fr","03.20.25.21","Presentateur");
			Contact c1=new Contact("julie","ania@cergy.fr","03.20.25.21","Presentateur"); 					
			  
  
			repBesoin.ajouterArrayList(c2);
			repBesoin.ajouterArrayList(c1); 
			//repBesoin.ajouterEmploisDuTempEmployer(c2);  
			//repBesoin.ajouterEmploisDuTempEmployer(c1);  
			Evenement ev=new Evenement(reu,m,sal,repBesoin); 
			EmploisDuTemp emt=new EmploisDuTemp(ev);    
			try {
				emt.ajouterDansEmploisDuTemps(c2.getName(), ev.getReu().getHeure(),ev.getReu().getDure(),ev);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				emt.ajouterDansEmploisDuTempsEmployer(ev);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
		/*}
		}
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
   /*     try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
  /**      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration                   
}

}
*/
