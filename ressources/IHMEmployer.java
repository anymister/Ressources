package ressources;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class IHMEmployer extends javax.swing.JFrame {
	
		    public IHMEmployer() {
		        initComponents();
		    }                         
		    private void initComponents() {
		    	
		    	nomEmployer =new ArrayList<String>();
		    	repertoire=new RepertoireContact();  
		    	 relationNoyau=new RelationIHMnoyau();
		        jLabel1 = new javax.swing.JLabel();
		        jLabel2 = new javax.swing.JLabel(); 
		        jLabel3 = new javax.swing.JLabel();
		        jLabel4 = new javax.swing.JLabel();
		        jLabel5 = new javax.swing.JLabel();
		        jTextField2 = new javax.swing.JTextField();
		        jTextField1 = new javax.swing.JTextField();
		        jTextField3 = new javax.swing.JTextField();
		        jTextField4 = new javax.swing.JTextField();
		        jButtonAjouter = new javax.swing.JButton();
		        jButtonModifier = new javax.swing.JButton();
		        JButtonSupprimer = new javax.swing.JButton();
		        jButtonEnregistrer = new javax.swing.JButton();
		        jLabel6 = new javax.swing.JLabel();
		        jScrollPane1 = new javax.swing.JScrollPane();
		        model=new DefaultListModel();
		        JList = new javax.swing.JList(model);
		        jMenuBar1 = new javax.swing.JMenuBar();
		        jMenu1 = new javax.swing.JMenu();
		        jMenuItem2 = new javax.swing.JMenuItem();
		        jMenuItem1 = new javax.swing.JMenuItem();
		        jMenuItem3 = new javax.swing.JMenuItem();
		        jMenu2 = new javax.swing.JMenu();
		        jMenu3 = new javax.swing.JMenu();

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		        try {
            		
		        	nomEmployer=relationNoyau.nomEmployees();
					for (int i=0;i<nomEmployer.size();i++) {
					model.add(i, nomEmployer.get(i));
					}
				
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        jLabel1.setText("Nom :");

		        jLabel2.setText("E-mail :");

		        jLabel3.setText("Numéro :");

		        jLabel5.setText("Responsabilité :");
		        

		        jTextField1.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jTextField1ActionPerformed(evt);
		            }
		        });

		        jButtonAjouter.setText("Ajouter");
		        jButtonAjouter.addActionListener(new java.awt.event.ActionListener() {
		        	
		        	public void actionPerformed(java.awt.event.ActionEvent evt) {
		        		int option = JOptionPane.showConfirmDialog(null, 
		    					
		    			        "Voulez-vous vraiment ajouter un nouvel employer?", 
		    			        "Confirmation", 
		    			        JOptionPane.YES_NO_OPTION, 
		    			        JOptionPane.QUESTION_MESSAGE);

		    			      if(option == JOptionPane.OK_OPTION){
		            	
		            	String nom= jTextField1.getText();
		            	String email= jTextField2.getText();
		            	String numero= jTextField3.getText();
		            	String responsabilite= jTextField4.getText();
		            	System.out.println(nom+email+numero+responsabilite);
		            	int tmp=repertoire.ajouterEmployer(nom,email,numero,responsabilite); 
		            	if (tmp==0) {

								model.addElement(jTextField1.getText());
								
						
		            		JOptionPane.showMessageDialog(null,"l'employer a été ajouter avec succès.",
					    			  "Information", JOptionPane.INFORMATION_MESSAGE);
		            	}else {
		            		JOptionPane.showMessageDialog(null,"Attention ! Le contact existe dejà.",
					    			  "Information", JOptionPane.INFORMATION_MESSAGE);
		            	}
		            	
		            }
		        	}
		        	
		        });

		        jButtonModifier.setText("Modifier");
		        jButtonModifier.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		           repertoire.modify(jTextField1.getText(), jTextField3.getText());
		           model.clear();
		           try {
	            		
			        	nomEmployer=relationNoyau.nomEmployees();
						for (int i=0;i<nomEmployer.size();i++) {
						model.add(i, nomEmployer.get(i));
						}
					
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            }
		        });


		        JButtonSupprimer.setText("Supprimer");
		       
		        JButtonSupprimer.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		            	repertoire.remove(jTextField1.getText());;
				           model.clear();
				           try {
			            		
					        	nomEmployer=relationNoyau.nomEmployees();
								for (int i=0;i<nomEmployer.size();i++) {
								model.add(i, nomEmployer.get(i));
								}
							
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		            }
		        });



		        jButtonEnregistrer.setText("Quitter");
		        jButtonEnregistrer.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		            	int option = JOptionPane.showConfirmDialog(null, 
		    					
		    			        "Voulez-vous vraiment quitter?", 
		    			        "Confirmation", 
		    			        JOptionPane.YES_NO_OPTION, 
		    			        JOptionPane.QUESTION_MESSAGE);

		    			      if(option == JOptionPane.OK_OPTION){
		    			    	  
		            	dispose();}
		           
		            }
		        });


		        jLabel6.setText("Liste des employés");

		       
		        jScrollPane1.setViewportView(JList);

		        jMenu1.setText("Mode");

		        jMenuItem2.setText("Manuel");
		        jMenu1.add(jMenuItem2);

		        jMenuItem1.setText("Semi-automatique");
		        jMenu1.add(jMenuItem1);

		        jMenuItem3.setText("Automatique");
		        jMenu1.add(jMenuItem3);

		        jMenuBar1.add(jMenu1);

		        jMenu2.setText("Aide");
		        jMenuBar1.add(jMenu2);

		        jMenu3.setText("Quitter");
		        jMenuBar1.add(jMenu3);

		        setJMenuBar(jMenuBar1);

		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        getContentPane().setLayout(layout);
		        layout.setHorizontalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addGap(84, 84, 84)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(jLabel1)
		                    .addComponent(jLabel2)
		                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel5)
		                    .addComponent(jButtonAjouter))
		                .addGap(38, 38, 38)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
		                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(jTextField2)
		                            .addComponent(jTextField1))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(34, 34, 34))
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(21, 21, 21)
		                        .addComponent(jButtonModifier)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
		                        .addComponent(JButtonSupprimer)))
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(60, 60, 60)
		                        .addComponent(jButtonEnregistrer))
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(2, 2, 2)
		                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                .addContainerGap(63, Short.MAX_VALUE))
		            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                .addComponent(jLabel6)
		                .addGap(102, 102, 102))
		        );
		        layout.setVerticalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(194, 194, 194)
		                        .addComponent(jLabel4))
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(78, 78, 78)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jLabel1))
		                        .addGap(39, 39, 39)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jLabel2))
		                        .addGap(41, 41, 41)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jLabel3))
		                        .addGap(30, 30, 30)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jLabel5)))
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(44, 44, 44)
		                        .addComponent(jLabel6)
		                        .addGap(18, 18, 18)
		                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jButtonEnregistrer)
		                    .addComponent(JButtonSupprimer)
		                    .addComponent(jButtonModifier)
		                    .addComponent(jButtonAjouter))
		                .addGap(49, 49, 49))
		        );
		        
		        pack();
		        setLocationRelativeTo(null);
		    }// </editor-fold>                        

		    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
		        // TODO add your handling code here:
		    }                                           

		    /**
		     * @param args the command line arguments
		     */
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
		            java.util.logging.Logger.getLogger(IHMEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(IHMEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(IHMEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(IHMEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        //</editor-fold>

		        /* Create and display the form */
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new IHMEmployer().setVisible(true);
		            }
		        });
		    }

		    // Variables declaration - do not modify                     
		    private javax.swing.JButton JButtonSupprimer;
		    private javax.swing.JButton jButtonAjouter;
		    private javax.swing.JButton jButtonEnregistrer;
		    private javax.swing.JButton jButtonModifier;
		    private javax.swing.JLabel jLabel1;
		    private javax.swing.JLabel jLabel2;
		    private javax.swing.JLabel jLabel3;
		    private javax.swing.JLabel jLabel4;
		    private javax.swing.JLabel jLabel5;
		    private javax.swing.JLabel jLabel6;
		    private javax.swing.JMenu jMenu1;
		    private javax.swing.JMenu jMenu2;
		    private javax.swing.JMenu jMenu3;
		    private javax.swing.JMenuBar jMenuBar1;
		    private javax.swing.JMenuItem jMenuItem1;
		    private javax.swing.JMenuItem jMenuItem2;
		    private javax.swing.JMenuItem jMenuItem3;
		    private javax.swing.JScrollPane jScrollPane1;
		    private javax.swing.JList JList;
		    private javax.swing.JTextField jTextField1;
		    private javax.swing.JTextField jTextField2;
		    private javax.swing.JTextField jTextField3;
		    private javax.swing.JTextField jTextField4;
		    private RepertoireContact repertoire;
		    private RelationIHMnoyau relationNoyau;
		    private ArrayList<String> nomEmployer ;
		    private DefaultListModel model;
		    // End of variables declaration                   
		
	}



