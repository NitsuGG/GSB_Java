package gsb.vue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JInternalFrame;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.MedicamentDao;


public class JIFMedicamentListe extends JInternalFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Medicament> lesMedicaments;
	
	protected JPanel p;
	protected JScrollPane scrollPane;
	protected JPanel pSaisie;
	protected JTextField JTcodeMedicament;
	protected JButton JBDetailMedicament;
	protected MenuPrincipal fenetreContainer;
	
	public JIFMedicamentListe(MenuPrincipal uneFenetreContainer) {

		fenetreContainer = uneFenetreContainer;
		// récupération des données Medecin dans la collection
		lesMedicaments = MedicamentDao.ListMedicamentDetail();

		int nbLignes = lesMedicaments.size();

		JTable table;
		
		

		p = new JPanel(); // panneau principal de la fenêtre

		int i=0;
		String[][] data = new String[nbLignes][3] ;
		for(Medicament unMedicament : lesMedicaments){
			data[i][0] = unMedicament.getIdMedicament();
			data[i][1] = unMedicament.getNomMedicament();
			data[i][2] = unMedicament.getFamCodeMedicament();
			i++;
		}
		
		String[] columnNames = {"Code", "Nom","Famille"};
		table = new JTable(data, columnNames);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));
		p.add(scrollPane);
		
		pSaisie = new JPanel();
		JTcodeMedicament = new JTextField(20);
		JTcodeMedicament.setMaximumSize(JTcodeMedicament.getPreferredSize());
		JBDetailMedicament = new JButton("Fiche médicament détaillée");
		JBDetailMedicament.addActionListener(this);
		pSaisie.add(JTcodeMedicament);
		pSaisie.add(JBDetailMedicament);
		p.add(pSaisie);
		
		// mise en forme de la fenêtre
		Container contentPane = getContentPane();
		contentPane.add(p);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
   		if (source == JBDetailMedicament){
   			Medicament unMedicament = MedicamentDao.ListMedicamentCode(JTcodeMedicament.getText());
   			System.out.println(JTcodeMedicament.getText()); 
   			if (unMedicament!=null){
   	   			fenetreContainer.ouvrirFenetre(new JIFMedicamentDetail(unMedicament));
   			}
   		}	

	}
}
