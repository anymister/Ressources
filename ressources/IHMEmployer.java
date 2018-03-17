package ressources;

public class IHMEmployer  extends javax.swing.JFrame  {
	



		
		
			    public IHMEmployer() {
			        initComponents();
			        setVisible(true);
			    }

			                
			    private void initComponents() {

			        jLabel1 = new javax.swing.JLabel();
			        jLabel2 = new javax.swing.JLabel();
			        jButton1 = new javax.swing.JButton();
			        jLabel3 = new javax.swing.JLabel();
			        jCheckBox1 = new javax.swing.JCheckBox();
			        jCheckBox2 = new javax.swing.JCheckBox();
			        jCheckBox3 = new javax.swing.JCheckBox();
			        jTextField1 = new javax.swing.JTextField();
			        jCheckBox4 = new javax.swing.JCheckBox();
			        jCheckBox5 = new javax.swing.JCheckBox();
			        jCheckBox6 = new javax.swing.JCheckBox();
			        jCheckBox7 = new javax.swing.JCheckBox();
			        jTextField2 = new javax.swing.JTextField();
			        
			       
			        jButton2 = new javax.swing.JButton();
			        jButton3 = new javax.swing.JButton();
			        jLabel5 = new javax.swing.JLabel();
			        jLabel7 = new javax.swing.JLabel();
			        jLabel8 = new javax.swing.JLabel();
			        jLabel9 = new javax.swing.JLabel();
			        jTextField6 = new javax.swing.JTextField();
			        jTextField7 = new javax.swing.JTextField();
			        jTextField8 = new javax.swing.JTextField();
			        jTextField9 = new javax.swing.JTextField();
			       
			        jTextField10 = new javax.swing.JTextField();
			        jTextField11 = new javax.swing.JTextField();
			        jMenuBar1 = new javax.swing.JMenuBar();
			       
			        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

			        jLabel1.setText("Evenement :");

			        jLabel2.setText("Matériel :");

			        jButton1.setText("Organiser un événement");
			        jButton1.setToolTipText("");
			        jButton1.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jButton1ActionPerformed(evt);
			            }
			        });
			        jButton2.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jButton2ActionPerformed(evt);
			            }
			        });
			        jButton3.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jButton3ActionPerformed(evt);
			            }
			        });

			        jLabel3.setBackground(new java.awt.Color(249, 249, 200)); 
			        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
			        jLabel3.setForeground(new java.awt.Color(48, 6, 6));
			        jLabel3.setText("Mon entreprise");

			        jCheckBox1.setSelected(true);
			        jCheckBox1.setText("Réunion");
			        jCheckBox1.setToolTipText("");

			        jCheckBox2.setText("Conférence"); 

			        jCheckBox3.setText("Autre...");

			        jTextField1.setText("...");
			        jTextField1.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jTextField1ActionPerformed(evt);
			            }
			        });

			        jCheckBox4.setText("Pc");

			        jCheckBox5.setText("Projecteur");
			        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jCheckBox5ActionPerformed(evt);
			            }
			        });

			        jCheckBox6.setText("Micro");

			        jCheckBox7.setText("Tableau");

			        jTextField2.setText("Quantité");
			        jTextField2.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jTextField2ActionPerformed(evt);
			            }
			        });

			        

			    

			        jButton2.setText("Ajouter");
			       

			        jButton3.setText("Effacer");

			        jLabel5.setText("Nom :");

			        jLabel7.setText("Responsabilité :");

			        jLabel8.setText("Numéro :");

			        jLabel9.setText("E-mail :");

			       
			        

			       
			        jTextField10.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jTextField10ActionPerformed(evt);
			            }
			        });

			        jTextField11.setText("Nombre de salle");
			        jTextField11.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			                jTextField11ActionPerformed(evt);
			            }
			        });

			       

			     
			       

			        setJMenuBar(jMenuBar1);

			        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
			        getContentPane().setLayout(layout);
			        layout.setHorizontalGroup(
			            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
			                    .addGroup(layout.createSequentialGroup()
			                        .addGap(61, 61, 61)
			                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                            .addComponent(jLabel1)
			                            .addComponent(jLabel2)
			                            
			                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                            .addGroup(layout.createSequentialGroup()
			                                .addGap(41, 41, 41)
			                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                                    .addComponent(jCheckBox1)
			                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
			                                        .addGroup(layout.createSequentialGroup()
			                                            .addComponent(jCheckBox7)
			                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			                                        .addGroup(layout.createSequentialGroup()
			                                            .addComponent(jCheckBox6)
			                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			                                        .addGroup(layout.createSequentialGroup()
			                                            .addComponent(jCheckBox4)
			                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			                                        .addGroup(layout.createSequentialGroup()
			                                            .addComponent(jCheckBox5)
			                                            .addGap(18, 18, 18)
			                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
			                                    .addComponent(jCheckBox2)
			                                    .addGroup(layout.createSequentialGroup()
			                                        .addComponent(jCheckBox3)
			                                        .addGap(31, 31, 31)
			                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
			                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
			                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
			                                    .addGroup(layout.createSequentialGroup()
			                                       
			                                        .addGap(33, 33, 33)
			                                        
			                                    .addGroup(layout.createSequentialGroup()
			                                        .addGap(90, 90, 90)
			                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                                            ))))
			                            .addGroup(layout.createSequentialGroup()
			                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			                                .addGap(0, 0, Short.MAX_VALUE))))
			                    .addGroup(layout.createSequentialGroup()
			                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                        .addComponent(jLabel3)
			                        .addGap(57, 57, 57)))
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
			                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
			                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
			                            .addComponent(jTextField9))
			                        .addGap(92, 92, 92))
			                    .addGroup(layout.createSequentialGroup()
			                        .addGap(9, 9, 9)
			                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
			                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
			                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
			                        .addGap(83, 83, 83))))
			            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
			                .addGap(0, 0, Short.MAX_VALUE)
			                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
			                .addGap(308, 308, 308))
			        )));
			        layout.setVerticalGroup(
			            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			            .addGroup(layout.createSequentialGroup()
			                .addContainerGap()
			                .addComponent(jLabel3)
			                .addGap(36, 36, 36)
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                    .addComponent(jLabel1)
			                    .addComponent(jCheckBox1)
			                    
			                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                    .addComponent(jCheckBox2)
			                    
			                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
			                    .addGroup(layout.createSequentialGroup()
			                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			                        .addGap(35, 35, 35))
			                    .addGroup(layout.createSequentialGroup()
			                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
			                            .addGroup(layout.createSequentialGroup()
			                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                                    .addComponent(jCheckBox3)
			                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			                                .addGap(29, 29, 29))
			                            .addGroup(layout.createSequentialGroup()
			                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			                                    )
			                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                                  
			                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			                                .addGap(15, 15, 15)))
			                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			                            .addComponent(jLabel2)
			                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                                .addComponent(jCheckBox4)
			                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
			                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                            .addComponent(jCheckBox5)
			                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			                            .addComponent(jButton2)
			                            .addComponent(jButton3))
			                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			                        .addComponent(jCheckBox6)
			                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                            .addComponent(jCheckBox7)
			                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
			                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
			                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			                    
			                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
			                .addGap(30, 30, 30)
			                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
			                .addGap(38, 38, 38))
			        );

			        pack();
			    }// </editor-fold>                        

			    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {   
			    	
	    	new IHM();
	    	dispose();
			        // TODO add your handling code here:
			    }       
			    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {   
			    	jTextField1.setText("");
			    	jTextField2.setText("");
			    	jTextField3.setText("");
			    	jTextField4.setText("");
			    	jTextField5.setText("");
			    	jTextField7.setText("");
			    	jTextField6.setText("");
			    	jTextField8.setText("");
			    	jTextField9.setText("");
			    	jTextField10.setText("");
			    	jTextField11.setText("");
			        // TODO add your handling code here:
			    }       
			    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
			    	String name=jTextField6.getText();
	    			String email=jTextField7.getText();
	    			String number=jTextField8.getText();
	    			String responsabilite=jTextField9.getText();
	    	repContact.ajouterEmployer(name, email, number, responsabilite);
			    }
			    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
			        // TODO add your handling code here:
			    }                                           

			    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
			        // TODO add your handling code here:
			    }                                          

			    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
			        // TODO add your handling code here:
			    }                                           

			    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {                                             
			        // TODO add your handling code here:
			    }                                            

			    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {                                             
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
			            java.util.logging.Logger.getLogger(IHMEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			        } catch (InstantiationException ex) {
			            java.util.logging.Logger.getLogger(IHMEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			        } catch (IllegalAccessException ex) {
			            java.util.logging.Logger.getLogger(IHMEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
			            java.util.logging.Logger.getLogger(IHMEntreprise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
			        }
			        //</editor-fold>

			        /* Create and display the form */
			       
			    }

			    // Variables declaration - do not modify                     
			    private javax.swing.JButton jButton1;
			    private javax.swing.JButton jButton2;
			    private javax.swing.JButton jButton3;
			    private javax.swing.JCheckBox jCheckBox1;
			    private javax.swing.JCheckBox jCheckBox2;
			    private javax.swing.JCheckBox jCheckBox3;
			    private javax.swing.JCheckBox jCheckBox4;
			    private javax.swing.JCheckBox jCheckBox5;
			    private javax.swing.JCheckBox jCheckBox6;
			    private javax.swing.JCheckBox jCheckBox7;
			    private javax.swing.JLabel jLabel1;
			    private javax.swing.JLabel jLabel2;
			    private javax.swing.JLabel jLabel3;
			    private javax.swing.JLabel jLabel5; private javax.swing.JLabel jLabel7; private javax.swing.JLabel jLabel8;
			    private javax.swing.JLabel jLabel9;
			  
			    private javax.swing.JMenuBar jMenuBar1;
			    private javax.swing.JTextField jTextField1;
			    private javax.swing.JTextField jTextField10;
			    private javax.swing.JTextField jTextField11;
			    private javax.swing.JTextField jTextField2;
			    private javax.swing.JTextField jTextField3;
			    private javax.swing.JTextField jTextField4;
			    private javax.swing.JTextField jTextField5;
			    private javax.swing.JTextField jTextField6;
			    private javax.swing.JTextField jTextField7;
			    private javax.swing.JTextField jTextField8;
			    private javax.swing.JTextField jTextField9;
			    private RepertoireContact repContact=new RepertoireContact();
			    // End of variables declaration                   
			}



