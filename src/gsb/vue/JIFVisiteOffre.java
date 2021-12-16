package gsb.vue;

import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.VisiteDao;
import gsb.modele.dao.VisiteurDao;
import gsb.modele.Medecin;
import gsb.modele.Offrir;
import gsb.modele.Visite;
import gsb.modele.Visiteur;


import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JIFVisiteOffre extends JInternalFrame implements ActionListener {

	protected JPanel p;
	protected JPanel pRef;
	protected JPanel m1;
	protected JPanel m2;
	
	protected JLabel JLref;
	protected JLabel JLrefvalue;
	protected JLabel JLmed1;
	protected JLabel JLq1;
	protected JLabel JLd1;
	protected JLabel JLq2;
	protected JLabel JLd2;
	protected JLabel JLmed2;
	
	
	protected JTextField JTq1;
	protected JTextField JTd1;
	protected JTextField JTq2;
	protected JTextField JTd2;
	
	protected JButton Bmodif1;
	protected JButton Bmodif2;
	protected JButton Bretour;
	
	protected MenuPrincipal leMenu;
	protected String ref;
	protected String depot1;
	protected String depot2;
	protected Visite uneVisite;
	protected HashMap<String, Offrir> lesMedicaments;
	
	public JIFVisiteOffre(MenuPrincipal leMenu, String ref) {
		
		setTitle("Médicaments offerts");
		this.leMenu = leMenu;
		this.ref=ref;
		
		p = new JPanel();
		pRef= new JPanel(new GridLayout(1,3));
		m1 = new JPanel(new GridLayout(2,3));
		m2 = new JPanel(new GridLayout(2,3));
		
		JLref= new JLabel("Référence :      ");
		JLrefvalue = new JLabel(ref);
		
		JLmed1= new JLabel("Médicament 1");
		
		JLq1= new JLabel("Quantité");
		JLd1= new JLabel("Dépot légal");
		JLq2= new JLabel("Quantité");
		JLd2= new JLabel("Dépot légal");
		
		JLmed2= new JLabel("Médicament 2");
		
		JTq1= new JTextField(10);
		JTq1.setMaximumSize(JTq1.getPreferredSize());
		JTd1 = new JTextField();
		Bmodif1 = new JButton("Enregistrer ");
		Bmodif1.addActionListener(this);
		
		JTq2= new JTextField(10);
		JTq2.setMaximumSize(JTq2.getPreferredSize());
		JTd2 = new JTextField();
		Bmodif2 = new JButton("Enregistrer ");
		Bmodif2.addActionListener(this);
		
		pRef.add(JLref);
		pRef.add(JLrefvalue);
		Bretour = new JButton("Retour");
		Bretour.addActionListener(this);
		pRef.add(Bretour);
		p.add(pRef);
		
		m1.add(JLmed1);
		m1.add(JLq1);
		m1.add(JLd1);
		m1.add(Bmodif1);
		m1.add(JTq1);
		m1.add(JTd1);
		
		p.add(m1);
		
		m2.add(JLmed2);
		m2.add(JLq2);
		m2.add(JLd2);
		m2.add(Bmodif2);
		m2.add(JTq2);
		m2.add(JTd2);
		
		p.add(m2);
		
		// mise en forme de la fenêtre
		Container contentPane = getContentPane();
		contentPane.add(p);
		
		 lesMedicaments= new HashMap<String,Offrir>();
		 lesMedicaments= VisiteDao.rechercherMedicaments(ref);

		 
		 for(Map.Entry<String,Offrir> uneEntree : lesMedicaments.entrySet()) {
			if(uneEntree.getKey().equals("'0'")) {
				JTq1.setText(""+uneEntree.getValue().getQuantite());
				JTd1.setText(uneEntree.getValue().getDepotLegal());
				this.depot1=uneEntree.getValue().getDepotLegal();
				
			}
			else if(uneEntree.getKey().equals("'1'")) {
				JTq2.setText(""+uneEntree.getValue().getQuantite());
				JTd2.setText(uneEntree.getValue().getDepotLegal());
				this.depot2=uneEntree.getValue().getDepotLegal();
			}
		 }
		
		

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Bmodif1) {
			try {
				if(JTd1.getText()!="" && JTq1.getText()!="") {
					VisiteDao.updateMedicaments(ref, depot1, JTd1.getText(),JTq1.getText() );
					
				}
				else {
					VisiteDao.updateMedicaments(ref, null, JTd1.getText(), JTq1.getText());
				}
				leMenu.ouvrirFenetre(new JIFVisiteOffre(leMenu, ref));
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		else if(e.getSource()==Bmodif2) {
			try {
				if(JTd2.getText()!="" && JTq2.getText()!="") {
					VisiteDao.updateMedicaments(ref, depot2, JTd2.getText(),JTq2.getText() );
					
				}
				else {
					VisiteDao.updateMedicaments(ref, null, JTd2.getText(), JTq2.getText());
				}
				leMenu.ouvrirFenetre(new JIFVisiteOffre(leMenu, ref));
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		else if(e.getSource()==Bretour) {
			uneVisite = VisiteDao.rechercher(ref);
			leMenu.ouvrirFenetre(new JIFVisiteMaj(leMenu ,uneVisite));
		}
	}

	
}
