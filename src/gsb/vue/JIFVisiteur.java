package gsb.vue;

import gsb.modele.Visiteur;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JIFVisiteur extends JInternalFrame{
	
	private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	
	protected JLabel JLmatricule;
	protected JLabel JLnom;
	protected JLabel JLprenom;
	protected JLabel JLlogin;
	protected JLabel JLmdp;
	protected JLabel JLadresse;
	protected JLabel JLcp;
	protected JLabel JLdateEntree;
	protected JLabel JLcodeUnit;
	protected JLabel JLnomUnit;
	
	protected JTextField JTmatricule;
	protected JTextField JTnom;
	protected JTextField JTprenom;
	protected JTextField JTlogin;
	protected JTextField JTmdp;
	protected JTextField JTadresse;
	protected JTextField JTcp;
	protected JTextField JTdateEntree;
	protected JTextField JTcodeUnit;
	protected JTextField JTnomUnit;
	
	public JIFVisiteur() {
		p = new JPanel();
		pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(9,2));
        
        JLmatricule = new JLabel("Matricule");
        JLnom = new JLabel("Nom");
        JLprenom = new JLabel("Prenom");
        JLlogin = new JLabel("Login");
        JLmdp = new JLabel("Mdp");
        JLadresse = new JLabel("Adresse");
        JLcp = new JLabel("Code Postal");
        JLdateEntree = new JLabel("Date Entrée");
        JLcodeUnit = new JLabel("Code Unit");
        JLnomUnit = new JLabel("Nom Unit");
        
        JTmatricule = new JTextField(20);
        JTmatricule.setMaximumSize(JTmatricule.getPreferredSize());
        JTnom = new JTextField();
        JTprenom = new JTextField();
        JTlogin = new JTextField();
        JTmdp = new JTextField();
        JTadresse = new JTextField();
        JTcp = new JTextField();
        JTdateEntree = new JTextField();
        JTcodeUnit = new JTextField();
        JTnomUnit = new JTextField();
        
        pTexte.add(JLmatricule);
        pTexte.add(JTmatricule);
        pTexte.add(JLnom);
        pTexte.add(JTnom);
        pTexte.add(JLprenom);
        pTexte.add(JTprenom);
        pTexte.add(JLlogin);
        pTexte.add(JTlogin);
        pTexte.add(JLmdp);
        pTexte.add(JTmdp);
        pTexte.add(JLadresse);
        pTexte.add(JTadresse);
        pTexte.add(JLcp);
        pTexte.add(JTcp);
        pTexte.add(JLdateEntree);
        pTexte.add(JTdateEntree);
        pTexte.add(JLcodeUnit);
        pTexte.add(JTcodeUnit);
        pTexte.add(JLnomUnit);
        pTexte.add(JTnomUnit);
        
        p.add(pTexte);
        p.add(pBoutons);
        Container contentPane = getContentPane();
        contentPane.add(p);
	}
		
	
	

}
