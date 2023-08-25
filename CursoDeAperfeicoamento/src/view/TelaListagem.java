package view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class TelaListagem {
	JList<String> jlst; 
	JScrollPane jscrlp; 

	public TelaListagem(String nomes[]) {    
		JFrame jfrm = new JFrame("Listagem de Dados"); 
		jfrm.setLayout(new FlowLayout()); 
		jfrm.setSize(300, 300);  
		jlst = new JList<String>(nomes); 
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		jscrlp = new JScrollPane(jlst); 
		jscrlp.setPreferredSize(new Dimension(120, 200)); 
		jfrm.add(jscrlp); 
		jfrm.setVisible(true);  
	} 

}
