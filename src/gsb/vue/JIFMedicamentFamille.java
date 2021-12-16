package gsb.vue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
import gsb.modele.Visite;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.VisiteDao;

public class JIFMedicamentFamille extends JInternalFrame implements ActionListener{

	private HashMap<String,Medicament> dicoFamille;

	
	protected JPanel p;  
	protected JPanel pTexte1;
	protected JPanel pSaisie;
	
	protected JLabel JLfamille;
	
	protected JTextField JTfamille;	
	private JButton Brecherche;
	private JButton Baffiche;
	protected JTable table;
	protected JScrollPane scrollPane;
	protected MenuPrincipal leMenu;
	
	public JIFMedicamentFamille(MenuPrincipal leMenu ,String Famille) {
		this.leMenu = leMenu;
		setTitle("Liste des médicament par famille");
		
		
    	p = new JPanel();  // panneau principal de la fenêtre
        
        pTexte1 = new JPanel(new GridLayout(1,10)); //premier panneau (form)
        
        
        JLfamille= new JLabel("Code Médicament");
        
        JTfamille = new JTextField();
        
        Brecherche = new JButton("Rechercher");
        
        pTexte1.add(JLfamille);
        pTexte1.add(JTfamille);
        pTexte1.add(Brecherche);
        Brecherche.addActionListener(this);
        
        p.add(pTexte1); //ajoue form
        
        
        	dicoFamille = new HashMap<String,Medicament>();
            dicoFamille = MedicamentDao.dicoFamille(Famille);
    		int nbLignes= dicoFamille.size();
    		
    		int i=0;
    		String[][] data = new String[nbLignes][5] ;
    		
    		for (Map.Entry<String,Medicament> uneEntree : dicoFamille.entrySet()){
       			data[i][0] = uneEntree.getValue().getIdMedicament();
    			data[i][1] = uneEntree.getValue().getNomMedicament();
    			data[i][2] = uneEntree.getValue().getCompoMedicament();
    			data[i][3] = uneEntree.getValue().getEffetMedicament();
    			data[i][4] = uneEntree.getValue().getContreIndicMedicament();



    			i++;
    			}
    		String[] columnNames = {"Dépot légal", "Nom commercial", "Composition", "Effet", "Contre indication"};
    		table = new JTable(data, columnNames);
    		table.getSelectionModel().addListSelectionListener(table);
    		scrollPane = new JScrollPane(table);
    		scrollPane.setPreferredSize(new Dimension(600, 280));
    		p.add(scrollPane); //ajout liste
       
		
		// mise en forme de la fenêtre
			Container contentPane = getContentPane();
			contentPane.add(p);
		
        
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()== Brecherche) {
			try {
				
				leMenu.ouvrirFenetre(new JIFMedicamentFamille(leMenu, JTfamille.getText()));
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
	}

}
