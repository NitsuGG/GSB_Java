package gsb.vue;

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
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JIFVisiteAjout extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	

	protected JLabel JLref;
	protected JLabel JLdate;
	protected JLabel JLcomm;
	protected JLabel JLmatricule;
	protected JLabel JLcodeMed;
	
	protected JTextField JTref;
	protected JTextField JTdate;
	protected JTextField JTcomm;
	protected JTextField JTmatricule;
	protected JTextField JTcodeMed;

	private JButton ajouter;
	
	
	 public JIFVisiteAjout() {
		 	setTitle("Ajout Visite");
	    	p = new JPanel();  // panneau principal de la fenêtre
	        pBoutons = new JPanel();    // panneau supportant les boutons
	        pTexte = new JPanel(new GridLayout(5,2));
	        
	        JLref= new JLabel("Référence");
	        JLdate= new JLabel("Date visite");
	        JLcomm= new JLabel("Commentaire");
	        JLmatricule= new JLabel("Matricule visiteur");
	        JLcodeMed= new JLabel("Code médecin");
	        
	        
	        
	        JTref = new JTextField(20);
	        JTref.setMaximumSize(JTref.getPreferredSize());
	        JTdate = new JTextField();
	        JTcomm = new JTextField();
	        JTmatricule = new JTextField();
	        JTcodeMed = new JTextField();
	        
	        ajouter = new JButton("Ajouter Visite");
	        ajouter.addActionListener(this);
	        
	        pTexte.add(JLref);
	        pTexte.add(JTref);
	        pTexte.add(JLdate);
	        pTexte.add(JTdate);
	        pTexte.add(JLcomm);
	        pTexte.add(JTcomm);
	        pTexte.add(JLmatricule);
	        pTexte.add(JTmatricule);
	        pTexte.add(JLcodeMed);
	        pTexte.add(JTcodeMed);
	        
	        pBoutons.add(ajouter);
	        
	        // mise en forme de la fenêtre
	        
	        p.add(pTexte);
	        p.add(pBoutons);
	        Container contentPane = getContentPane();
	        contentPane.add(p);
	 }
	 
	 public void actionPerformed(ActionEvent evt) {
		 if (evt.getSource() instanceof JButton) {
			 evt.getActionCommand();
		 }
	 }
}
