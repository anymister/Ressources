package ressources;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.CellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class IHM {

	public static class newJFrame extends javax.swing.JFrame {

		public newJFrame() {
			contact = new ArrayList<String>();
			contacts = new ArrayList<String>();
			initComponents();
		}

		@SuppressWarnings("unchecked")
		// <editor-fold defaultstate="collapsed" desc="Generated Code">
		private void initComponents() {

			jScrollPane1 = new javax.swing.JScrollPane();
			jTable1 = new javax.swing.JTable() {
				public Component prepareRenderer(TableCellRenderer r, int a, int b) {

					Component c = super.prepareRenderer(r, a, b);
					c.setBackground(Color.GREEN);
					if ((a == 1) && (b == 2)) {
						c.setBackground(Color.RED);
						c.setForeground(Color.BLACK);
					}
					return c;
				}
			};
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
			jButton3 = new javax.swing.JButton();
			jButton4 = new javax.swing.JButton();
			textField3 = new java.awt.TextField();
			JTextField textBox = new JTextField();
			textField4 = new java.awt.TextField();
			textField5 = new java.awt.TextField();
			textField6 = new java.awt.TextField();
			jMenuBar1 = new javax.swing.JMenuBar();
			jMenu1 = new javax.swing.JMenu();
			jMenu2 = new javax.swing.JMenu();
			repBesoinEmployer = new RepertoireContact();
			RelationIHMno = new RelationIHMnoyau();
			setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
			final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();
			jTable1.setAutoCreateRowSorter(true);
			jTable1.setBackground(new java.awt.Color(254, 232, 232));
			jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
			jTable1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N

			jTable1.setModel(new javax.swing.table.DefaultTableModel(
					new Object[][] { { "Lundi", null, null, null, null, null, null, null, null },
							{ "Mardi", null, null, null, null, null, null, null, null },
							{ "Mercredi", null, null, null, null, null, null, null, null },
							{ "Jeudi", null, null, null, null, null, null, null, null },
							{ "Vendredi", null, null, null, null, null, null, null, null } },
					new String[] { "", "8h00-9h00", "9h00-10h00", "10h00-11h00", "11h00-12h00", "12h00-13h00",
							"13h00-14h00", "14h00-15h00", "15h00-16h00" }) {
				Class[] types = new Class[] { java.lang.String.class, java.lang.Object.class, java.lang.Object.class,
						java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
						java.lang.Object.class, java.lang.Object.class };

				public Class getColumnClass(int columnIndex) {
					return types[columnIndex];
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

			jComboBox1.setModel(
					new javax.swing.DefaultComboBoxModel<>(new String[] { "Réunion", "Conférence", "Autre..." }));
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
			jButton3.addActionListener(new ActionEntreprise());
			jButton3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {

					IHMEntreprise c = new IHMEntreprise();
					c.main(null);

				}
			});
			jButton4.setText("Statistique en cours");
			jButton4.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jButton4ActionPerformed(evt);

				}
			});

			jLabel3.setText("Employés :");

			jList1.setModel(new javax.swing.AbstractListModel<String>() {
				public int getSize() {
					contact.clear();
					contacts.clear();
					String line = "";
					StatistiquesRessources SR = new StatistiquesRessources();
					try {
						SR.occupationDeChaqueEmployer();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					BufferedReader lireEmploisDuTempEmployer;
					try {
						lireEmploisDuTempEmployer = new BufferedReader(new FileReader(".\\data\\contacts.txt"));

						while ((line = lireEmploisDuTempEmployer.readLine()) != null) {
							contact.add(line);
						}
						lireEmploisDuTempEmployer.close();
						int j = 0;
						for (int k = 0; k < contact.size(); k++) {

							if (j == k) {
								j = j + 6;
								contacts.add(contact.get(k));
								// System.out.println("employer..'"+contact.get(k)+"'.."+SR.getPourcentageOccupation().get(k));
							} else {
								contact.set(k, null);
							}
						}

					} catch (FileNotFoundException e) {
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return contacts.size();
				}

				public String getElementAt(int i) {

					return contacts.get(i);
				}
			});
			jScrollPane2.setViewportView(jList1);

			jLabel4.setText("Durée de l'événement :");

			textField1.setText("en heure...");
			textField1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					textField1ActionPerformed(evt);

				}
			});

			textField2.setText("");

			jLabel5.setText("Nombre de participants :");

			jButton1.setText("Effacer");
			jButton1.setActionCommand("Effacer");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					int option = JOptionPane.showConfirmDialog(null,

							"Voulez-vous vraiment effacer?", "Confirmation", JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE);

					if (option == JOptionPane.OK_OPTION) {

						jButton1ActionPerformed(evt);
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						textField4.setText("");
						textField5.setText("");
						textField6.setText("");
						TableCellRenderer r = null;

						// jTable1.prepareRenderer(r,1,2);
						// JLabel l = (JLabel) super.getTableCellRendererComponent(jTable1, 2, true,
						// true,2, 2);

						TableColumn soprtColumn = jTable1.getColumnModel().getColumn(1);

						soprtColumn.setCellRenderer(DEFAULT_RENDERER);
						soprtColumn.setCellEditor(new DefaultCellEditor(textBox));
						textBox.setBackground(Color.RED);
						// jTable1.setSelectionBackground(Color.RED);

						// custom.setBackground(Color.RED);

						// jTable1.getColumnModel().getColumnIndex(jTable1.getSelectedRow().setCellRenderer(custom));

						// jTable1.getColumnModel().getColumnIndex().setCellRenderer(custom);

					}
				}
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
			jMenu2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					if (jMenu2.isSelected()) {
						File file = new File(".\\data\\celia.txt");
						try {
							Desktop.getDesktop().open(file);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
			javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
			getContentPane().setLayout(layout);
			layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup().addGroup(
							layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
									.createSequentialGroup().addGap(92, 92, 92).addGroup(
											layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
													.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
															javax.swing.GroupLayout.PREFERRED_SIZE)
													.addComponent(
															jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
															javax.swing.GroupLayout.PREFERRED_SIZE))
									.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
											.addGroup(layout.createSequentialGroup().addGap(78, 78, 78).addGroup(layout
													.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
													.addGroup(layout.createSequentialGroup().addGroup(layout
															.createParallelGroup(
																	javax.swing.GroupLayout.Alignment.LEADING, false)
															.addComponent(jComboBox1,
																	javax.swing.GroupLayout.PREFERRED_SIZE, 169,
																	javax.swing.GroupLayout.PREFERRED_SIZE)
															.addGroup(layout.createSequentialGroup()
																	.addComponent(jCheckBox3)
																	.addPreferredGap(
																			javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																			javax.swing.GroupLayout.DEFAULT_SIZE,
																			Short.MAX_VALUE)
																	.addComponent(textField5,
																			javax.swing.GroupLayout.PREFERRED_SIZE,
																			javax.swing.GroupLayout.DEFAULT_SIZE,
																			javax.swing.GroupLayout.PREFERRED_SIZE))
															.addGroup(layout.createSequentialGroup()
																	.addComponent(jCheckBox1)
																	.addPreferredGap(
																			javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																			javax.swing.GroupLayout.DEFAULT_SIZE,
																			Short.MAX_VALUE)
																	.addComponent(textField6,
																			javax.swing.GroupLayout.PREFERRED_SIZE,
																			javax.swing.GroupLayout.DEFAULT_SIZE,
																			javax.swing.GroupLayout.PREFERRED_SIZE))
															.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
																	.createSequentialGroup()
																	.addGroup(layout.createParallelGroup(
																			javax.swing.GroupLayout.Alignment.LEADING)
																			.addComponent(jCheckBox2)
																			.addComponent(jCheckBox4))
																	.addPreferredGap(
																			javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																			javax.swing.GroupLayout.DEFAULT_SIZE,
																			Short.MAX_VALUE)
																	.addGroup(layout.createParallelGroup(
																			javax.swing.GroupLayout.Alignment.LEADING,
																			false)
																			.addComponent(textField4,
																					javax.swing.GroupLayout.DEFAULT_SIZE,
																					javax.swing.GroupLayout.DEFAULT_SIZE,
																					Short.MAX_VALUE)
																			.addComponent(textField3,
																					javax.swing.GroupLayout.DEFAULT_SIZE,
																					javax.swing.GroupLayout.DEFAULT_SIZE,
																					Short.MAX_VALUE))))
															.addGap(139, 139, 139)
															.addGroup(layout
																	.createParallelGroup(
																			javax.swing.GroupLayout.Alignment.LEADING)
																	.addGroup(
																			javax.swing.GroupLayout.Alignment.TRAILING,
																			layout.createSequentialGroup()
																					.addComponent(jLabel4)
																					.addPreferredGap(
																							javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																	.addGroup(layout.createSequentialGroup()
																			.addComponent(jLabel5,
																					javax.swing.GroupLayout.PREFERRED_SIZE,
																					116,
																					javax.swing.GroupLayout.PREFERRED_SIZE)
																			.addGap(28, 28, 28)))
															.addGroup(layout
																	.createParallelGroup(
																			javax.swing.GroupLayout.Alignment.LEADING)
																	.addComponent(textField2,
																			javax.swing.GroupLayout.PREFERRED_SIZE,
																			javax.swing.GroupLayout.DEFAULT_SIZE,
																			javax.swing.GroupLayout.PREFERRED_SIZE)
																	.addComponent(textField1,
																			javax.swing.GroupLayout.PREFERRED_SIZE, 116,
																			javax.swing.GroupLayout.PREFERRED_SIZE)))
													.addGroup(layout.createSequentialGroup()
															.addComponent(jButton3,
																	javax.swing.GroupLayout.PREFERRED_SIZE, 153,
																	javax.swing.GroupLayout.PREFERRED_SIZE)

															.addGap(126, 126, 126)))
													.addGap(236, 236, 236))
											.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
													layout.createSequentialGroup()
															.addPreferredGap(
																	javax.swing.LayoutStyle.ComponentPlacement.RELATED)
															.addComponent(jLabel3).addGap(44, 44, 44)))
									.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196,
											javax.swing.GroupLayout.PREFERRED_SIZE))
									.addGroup(layout.createSequentialGroup().addGap(520, 520, 520)
											.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
													javax.swing.GroupLayout.PREFERRED_SIZE)
											.addGap(60, 60, 60).addComponent(jButton2).addGap(60, 60, 60)
											.addComponent(jButton4))
									.addGroup(layout.createSequentialGroup().addGap(220, 220, 220).addComponent(
											jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879,
											javax.swing.GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(83, Short.MAX_VALUE)));
			layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup().addContainerGap()
							.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
									javax.swing.GroupLayout.PREFERRED_SIZE)

							.addGap(38, 38, 38)
							.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
									.addGroup(layout.createSequentialGroup().addGroup(layout
											.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
											.addGroup(layout.createSequentialGroup().addGap(5, 5, 5).addGroup(layout
													.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
													.addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															javax.swing.GroupLayout.PREFERRED_SIZE)
													.addGroup(layout
															.createParallelGroup(
																	javax.swing.GroupLayout.Alignment.BASELINE)
															.addComponent(jLabel4)
															.addComponent(jLabel1,
																	javax.swing.GroupLayout.PREFERRED_SIZE, 22,
																	javax.swing.GroupLayout.PREFERRED_SIZE)
															.addComponent(jComboBox1,
																	javax.swing.GroupLayout.PREFERRED_SIZE,
																	javax.swing.GroupLayout.DEFAULT_SIZE,
																	javax.swing.GroupLayout.PREFERRED_SIZE)))
													.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
															47, Short.MAX_VALUE)
													.addGroup(layout
															.createParallelGroup(
																	javax.swing.GroupLayout.Alignment.LEADING)
															.addComponent(textField2,
																	javax.swing.GroupLayout.Alignment.TRAILING,
																	javax.swing.GroupLayout.PREFERRED_SIZE,
																	javax.swing.GroupLayout.DEFAULT_SIZE,
																	javax.swing.GroupLayout.PREFERRED_SIZE)
															.addComponent(textField3,
																	javax.swing.GroupLayout.Alignment.TRAILING,
																	javax.swing.GroupLayout.PREFERRED_SIZE,
																	javax.swing.GroupLayout.DEFAULT_SIZE,
																	javax.swing.GroupLayout.PREFERRED_SIZE)))
											.addGroup(layout.createSequentialGroup().addGap(59, 59, 59).addGroup(layout
													.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
													.addComponent(jLabel5)
													.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
															javax.swing.GroupLayout.PREFERRED_SIZE)
													.addComponent(jCheckBox2))))
											.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(layout
													.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
													.addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															javax.swing.GroupLayout.PREFERRED_SIZE)
													.addComponent(jCheckBox4))
											.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(layout
													.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
													.addComponent(jCheckBox3).addComponent(textField5,
															javax.swing.GroupLayout.PREFERRED_SIZE,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															javax.swing.GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(layout
													.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
													.addComponent(jCheckBox1).addComponent(textField6,
															javax.swing.GroupLayout.PREFERRED_SIZE,
															javax.swing.GroupLayout.DEFAULT_SIZE,
															javax.swing.GroupLayout.PREFERRED_SIZE)))
									.addComponent(jLabel3).addComponent(jScrollPane2,
											javax.swing.GroupLayout.PREFERRED_SIZE, 182,
											javax.swing.GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
							.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276,
									javax.swing.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
									.addComponent(jButton1).addComponent(jButton2).addComponent(jButton4))
							.addContainerGap(43, Short.MAX_VALUE)));

			pack();
		}// </editor-fold>

		private class ActionEntreprise implements ActionListener {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				new IHMEntreprise();
			}

		}

		private class SauvegardeAction implements ActionListener {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				RepertoireContact repBesoinEmployer = new RepertoireContact();
				repBesoinEmployer.lireListeDesEmployer();
				for (int j = 0; j < repBesoinEmployer.getNomEmployer().size(); j++) {

					System.out
							.println("mes employer necessaire" + repBesoinEmployer.getListeDesEmployer().get(j) + "*");

				}

				String dure = textField1.getText();

				String heure = textField2.getText();
				String nbrPersonne = textField3.getText();
				String nom = jList1.getSelectedValue();

				String nbrTableau;
				String nbrMicros;
				String nbrProjecteurs;
				String nbrPc;

				if (jCheckBox1.isSelected()) {
					nbrTableau = textField3.getText();
				} else {
					nbrTableau = "0";
				}
				if (jCheckBox2.isSelected()) {
					nbrMicros = textField4.getText();
				} else {
					nbrMicros = "0";
				}
				if (jCheckBox3.isSelected()) {
					nbrProjecteurs = textField5.getText();
				} else {
					nbrProjecteurs = "0";
				}
				if (jCheckBox4.isSelected()) {
					nbrPc = textField6.getText();
				} else {
					nbrPc = "0";
				}

				String typeEvenement = (String) jComboBox1.getSelectedItem();
				jMenu1.getSelectedIcon();

				System.out.println(dure + heure + nom + nbrTableau + nbrPc + jList1.getSelectedValue()
						+ jComboBox1.getSelectedItem());

				Contact employer = repBesoinEmployer.rechercheEmployer(nom);
				System.out.println(
						"reultat de la methode rechercheemployer():" + employer.getName() + employer.getNumber());
				// Contact employer=new Contact ("anis","anis@cergy.fr","01.20.10.20","Chef de
				// Rayon");

				repBesoinEmployer.ajouterNomArrayList(employer);

				Materiel materiel = new Materiel(nbrPc, nbrProjecteurs, nbrTableau, nbrMicros);
				if ((dure == null) || (nbrPersonne == null) || (nom == null) || (nbrTableau == null) || (nbrPc == null)
						|| (jComboBox1.getSelectedItem() == null)) {
					JOptionPane.showMessageDialog(null, "Attention !Des informations manquent à votre évènement",
							"Information", JOptionPane.INFORMATION_MESSAGE);

				} else {

					int dur = Integer.parseInt(dure);
					int nbPersonne = Integer.parseInt(nbrPersonne);

					int heur = 0;
					int option = JOptionPane.showConfirmDialog(null,

							"Récapitulatif de l'evenement :\r\n" + "Tableau :" + nbrTableau + "\r\nMicros :" + nbrMicros
									+ "\r\nProjecteurs : " + nbrProjecteurs + "\r\nPC : " + nbrPc + "\r\ndure : " + dur
									+ "\r\nNombre de personnes: " + nbrPersonne + "\r\nheure du debut de l'evenement : "
									+ heur + "\r\ntype d'evenement : " + typeEvenement
									+ "\r\nVoulez-vous vraiment sauvegarder cette evenement?",
							"Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

					if (option == JOptionPane.OK_OPTION) {
						Reunion reunion = new Reunion(dur, nbrPersonne, heur, typeEvenement);
						heur = RelationIHMno.convertir_tableau_En_heure(jTable1.getSelectedColumn(),
								jTable1.getSelectedRow());
						reunion.setHeure(heur);

						Evenement event = new Evenement(reunion, materiel, nbPersonne, repBesoinEmployer);
						EmploisDuTemp emploisTemp = new EmploisDuTemp(event);

						// int nbPersonne = Integer.parseInt(nbrPersonne);
						if (jTable1.isCellSelected(jTable1.getSelectedColumn(), jTable1.getSelectedColumn())) {
							jTable1.setSelectionBackground(Color.RED);
						}
						try {
							int tmp = 0;
							int tmp1 = 0;
							tmp = emploisTemp.ajouterDansEmploisDuTempsEmployer(event);

							if (tmp == 1) {

								tmp1 = emploisTemp.ajouterDansEmploisDuTempsEntreprise(event);
							} else if (tmp == 0) {
								JOptionPane.showMessageDialog(null,
										"Attention ! L'emloyer que vous avez choisis n'est pas libre dans créneau. Veuillez en choisir un autre, merci.",
										"Information", JOptionPane.INFORMATION_MESSAGE);

							}
							if (tmp1 == 1) {

								JOptionPane.showMessageDialog(null, "L'evenement à etais enregistrer avec succès",
										"Information", JOptionPane.INFORMATION_MESSAGE);
							} else if (tmp1 == 0) {
								JOptionPane.showMessageDialog(null, "L'evenement à etais enregistrer avec succès",
										"Information", JOptionPane.INFORMATION_MESSAGE);
							}

							/*
							 * int[] table; table=RelationIHMno.getTab();
							 * RelationIHMno.convertir_Heure_En_Tableau(heur);
							 * jTable1.setModel(tab[table[0]][table[1]]);
							 */

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

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

		private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

			IHMStatistiques a = new IHMStatistiques();
			a.main(null);
		}

		private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {
			// TODO add your handling code here:
		}

		public static void main(String args[]) {
			/* Set the Nimbus look and feel */
			// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
			// (optional) ">
			/*
			 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
			 * look and feel. For details see
			 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
			 */
			try {
				for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
					if ("Nimbus".equals(info.getName())) {
						javax.swing.UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}
			} catch (ClassNotFoundException ex) {
				java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
						ex);
			} catch (InstantiationException ex) {
				java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
						ex);
			} catch (IllegalAccessException ex) {
				java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
						ex);
			} catch (javax.swing.UnsupportedLookAndFeelException ex) {
				java.util.logging.Logger.getLogger(newJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
						ex);
			}
			// </editor-fold>

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
		private JButton jButton4;
		private java.awt.TextField textField1;
		private java.awt.TextField textField2;
		private java.awt.TextField textField3;
		private java.awt.TextField textField4;
		private java.awt.TextField textField5;
		private java.awt.TextField textField6;
		private ArrayList<String> contact;
		private ArrayList<String> contacts;
		private RelationIHMnoyau RelationIHMno;
		private RepertoireContact repBesoinEmployer;
		// End of variables declaration
	}

}
