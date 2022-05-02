package gsb.vue;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JInternalFrame;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import gsb.modele.Visiteur;
import gsb.modele.Localite;
import gsb.modele.dao.LocaliteDao;
import gsb.modele.dao.VisiteurDao;


public class JIFVisiteurDetail extends JInternalFrame{
	
	private static final long serialVersionUID = 1L;

	protected JPanel p;  
	protected JPanel pTexte;

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
	protected JPasswordField JTmdp;
	protected JTextField JTadresse;
	protected JTextField JTcp;
	protected JTextField JTdateEntree;
	protected JTextField JTcodeUnit;
	protected JTextField JTnomUnit;
	
	public JIFVisiteurDetail(Visiteur unVisiteur) {
		
		setTitle("Detail Visiteur");
		p = new JPanel(); 
        pTexte = new JPanel(new GridLayout(10,2));
        
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
        JTmdp = new JPasswordField();
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
        Container contentPane = getContentPane();
        contentPane.add(p);
        
        JTmatricule.setText(unVisiteur.getMatricule());
        JTnom.setText(unVisiteur.getNom());
        JTprenom.setText(unVisiteur.getPrenom());
        JTlogin.setText(unVisiteur.getLogin());
        JTmdp.setText(unVisiteur.getMdp());
        JTadresse.setText(unVisiteur.getAdresse());
        JTcp.setText(unVisiteur.getCodePostal().getCodePostal());
        JTdateEntree.setText(unVisiteur.getDateEntree());
        JTcodeUnit.setText(unVisiteur.getCodeUnit());
        JTnomUnit.setText(unVisiteur.getNomUnit());
        
	}
}
