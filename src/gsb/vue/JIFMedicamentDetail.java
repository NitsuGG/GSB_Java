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

public class JIFMedicamentDetail extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	
	protected JPanel p;  
	protected JPanel pTexte;
	
	protected JLabel JLDepotLegal;
	protected JLabel JLNomCommercial;
	protected JLabel JLComposition;
	protected JLabel JLEffet;
	protected JLabel JLContreIndication;
	protected JLabel JLCodeFamille;
	protected JLabel JLLibelleFamille;
	protected JLabel JLLibelleConditionnement;
	protected JLabel JLLabelDC;
	
	
	protected JTextField JTDepotLegal;
	protected JTextField JTNomCommercial;
	protected JTextField JTComposition;
	protected JTextField JTEffet;
	protected JTextField JTContreIndication;
	protected JTextField JTCodeFamille;
	protected JTextField JTLibelleFamille;
	protected JTextField JTConditionnement;
	protected JTextField JTDC;
	

	
	
	public JIFMedicamentDetail(Medicament unMedicament) {
		/*
		 * Zone de la page
		 */
		super();
		p = new JPanel();
        pTexte = new JPanel(new GridLayout(10,2));
        /*
         * Cr�ation des labels
         */
        JLDepotLegal = new JLabel("D�pot l�gal: ");
        JLNomCommercial = new JLabel("Nom commercial: ");
        JLComposition = new JLabel("Composition: ");
        JLEffet = new JLabel("Effet: ");
        JLContreIndication = new JLabel("Contre indication");
		JLCodeFamille = new JLabel("Code famille: ");
		JLLibelleFamille = new JLabel("Libell� Famille: ");
		JLLibelleConditionnement = new JLabel("Nb conditionnement: ");
		JLLabelDC = new JLabel("DC: ");

		
		/*
		 * Cr�ation des inputs 
		 */
		JTDepotLegal = new JTextField(1);
		JTNomCommercial = new JTextField();
		JTComposition = new JTextField();
		JTEffet = new JTextField();
		JTContreIndication = new JTextField();
		JTCodeFamille = new JTextField();
		JTLibelleFamille = new JTextField();
		JTConditionnement = new JTextField();
		JTDC = new JTextField();


				
		/*
		 * Insertion des �l�ments dans l'interface
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
		
		pTexte.add(JLLibelleConditionnement);
		pTexte.add(JTConditionnement);
		
		pTexte.add(JLLabelDC);
		pTexte.add(JTDC);
		
		
		
		p.add(pTexte);		
        Container contentPane = getContentPane();
        contentPane.add(p);
		
		JTDepotLegal.setText(unMedicament.getIdMedicament());
		JTNomCommercial.setText(unMedicament.getNomMedicament());
		JTComposition.setText(unMedicament.getCompoMedicament());
		JTEffet.setText(unMedicament.getEffetMedicament());
		JTContreIndication.setText(unMedicament.getContreIndicMedicament());
		JTCodeFamille.setText(unMedicament.getFamCodeMedicament());
		JTLibelleFamille.setText(unMedicament.getFamLibelleMedicament());
		JTDC.setText(unMedicament.getDC());
		JTConditionnement.setText(MedicamentDao.getNbConditionnement(unMedicament.getIdMedicament()));
	}
	
	
}
