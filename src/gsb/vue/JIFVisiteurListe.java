package gsb.vue;

import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;
import gsb.modele.dao.VisiteurDao;
import gsb.modele.Visiteur;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JIFVisiteurListe extends JInternalFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Visiteur> lesVisiteurs;
	
	protected JPanel p;
	protected JScrollPane scrollPane;
	protected JPanel pSaisie;
	protected JTextField JTmatriculeVisiteur;
	protected JButton JBafficherFiche;
	protected MenuPrincipal fenetreContainer;
	
	public JIFVisiteurListe(MenuPrincipal uneFenetreContainer) {
		
		fenetreContainer = uneFenetreContainer;
		
		lesVisiteurs = VisiteurDao.retournerCollectionDesVisiteurs();
		
		int nbLignes = lesVisiteurs.size();
		
		JTable table;
	
		p = new JPanel();
		
		int i=0;
				String[][] data = new String[nbLignes][3] ;
			for(Visiteur unVisiteur : lesVisiteurs) {
				data[i][0] = unVisiteur.getMatricule();
				data[i][1] = unVisiteur.getNom();
				data[i][2] = unVisiteur.getPrenom();
				i++;
			}
			String[] columnNames = {"Matricule", "Nom", "Prenom"};
			table = new JTable(data, columnNames);
			
			scrollPane = new JScrollPane(table);
			scrollPane.setPreferredSize(new Dimension(400, 200));
			p.add(scrollPane);
			
			pSaisie = new JPanel();
			JTmatriculeVisiteur = new JTextField(20);
			JTmatriculeVisiteur.setMaximumSize(JTmatriculeVisiteur.getPreferredSize());
			JBafficherFiche = new JButton("Fiche visiteur détaillée");
			JBafficherFiche.addActionListener(this);
			pSaisie.add(JTmatriculeVisiteur);
			pSaisie.add(JBafficherFiche);
			p.add(pSaisie);
			
			Container contentPane = getContentPane();
			contentPane.add(p);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
		if (source == JBafficherFiche){
			Visiteur unVisiteur = VisiteurDao.rechercher(JTmatriculeVisiteur.getText());
			System.out.println(JTmatriculeVisiteur.getText());
			if (unVisiteur!=null) {
				fenetreContainer.ouvrirFenetre(new JIFVisiteurDetail(unVisiteur));
			}
		}
	}
	


}
