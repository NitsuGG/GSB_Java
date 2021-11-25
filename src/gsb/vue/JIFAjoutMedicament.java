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

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;


public class JIFAjoutMedicament extends JInternalFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	
	protected JLabel JLDepotLegal;
	protected JLabel JLNomCommercial;
	protected JLabel JLComposition;
	protected JLabel JLEffet;
	protected JLabel JLContreIndication;
	protected JLabel JLCodeFamille;
	protected JLabel JLLibelleFamille;
	
	protected JLabel JLValidation;

	
	
	protected JTextField JTDepotLegal;
	protected JTextField JTNomCommercial;
	protected JTextField JTComposition;
	protected JTextField JTEffet;
	protected JTextField JTContreIndication;
	protected JTextField JTCodeFamille;
	protected JTextField JTLibelleFamille;
	
	protected JButton JBAjouterMedic;
	
	
	public JIFAjoutMedicament() {
		/*
		 * Zone de la page
		 */
		p = new JPanel();
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(9,2));
        /*
         * Création des labels
         */
        JLDepotLegal = new JLabel("Dépot légal: ");
        JLNomCommercial = new JLabel("Nom commercial: ");
        JLComposition = new JLabel("Composition: ");
        JLEffet = new JLabel("Effet: ");
        JLContreIndication = new JLabel("Contre indication");
		JLCodeFamille = new JLabel("Code famille: ");
		JLLibelleFamille = new JLabel("Libellé Famille: ");
		JLValidation = new JLabel("");

		
		/*
		 * Création des inputs 
		 */
		JTDepotLegal = new JTextField(20);
		JTDepotLegal.setMaximumSize(JTDepotLegal.getPreferredSize());
		JTNomCommercial = new JTextField();
		JTComposition = new JTextField();
		JTEffet = new JTextField();
		JTContreIndication = new JTextField();
		JTCodeFamille = new JTextField();
		JTLibelleFamille = new JTextField();
		
		/*
		 * Ajout des boutons
		 */
		JBAjouterMedic = new JButton("Ajouter le médicament");
		/*
		 * Insertion des éléments dans l'interface
		 */
		pTexte.add(JLDepotLegal);
		pTexte.add(JTDepotLegal);
		
		pTexte.add(JLNomCommercial);
		pTexte.add(JTNomCommercial);
		
		pTexte.add(JLComposition);
		pTexte.add(JTComposition);

		pTexte.add(JLEffet);
		pTexte.add(JTEffet);
		
		pTexte.add(JLContreIndication);
		pTexte.add(JTContreIndication);
		
		pTexte.add(JLCodeFamille);
		pTexte.add(JTCodeFamille);
		
		pTexte.add(JLLibelleFamille);
		pTexte.add(JTLibelleFamille);
		
		pBoutons.add(JBAjouterMedic);
		pTexte.add(JLValidation);
		JBAjouterMedic.addActionListener(this); //Pour savoir quand on appuit sur le bouton
		
		p.add(pTexte);
		p.add(pBoutons);
		
        Container contentPane = getContentPane();
        contentPane.add(p);
			
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == JBAjouterMedic) {
			try {
				MedicamentDao MedicamentDAO = new MedicamentDao();
				MedicamentDAO.insertNewMedicament(JTDepotLegal.getText(), JTNomCommercial.getText(), JTComposition.getText(), JTEffet.getText(), JTContreIndication.getText(), JTCodeFamille.getText(), JTLibelleFamille.getText());
				JTDepotLegal.setText("");
				JTNomCommercial.setText("");
				JTComposition.setText("");
				JTEffet.setText("");
				JTContreIndication.setText("");
				JTCodeFamille.setText("");
				JTLibelleFamille.setText("");
				
				JLValidation.setText("Le médicament à été ajouté !");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		}
		
	}
	
	
}
