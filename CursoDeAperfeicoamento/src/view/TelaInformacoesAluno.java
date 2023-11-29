package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import dados.*;
import negocio.*;

public class TelaInformacoesAluno {
	
	JFrame jfrm;
	JLabel nome, id, cpf, tel, dtNasc, end;
	
	public TelaInformacoesAluno(Dados d, int pos) {
		jfrm = new JFrame("Informacao de Aluno"); 
		jfrm.setLayout(null);
		jfrm.setSize(300, 300);
		Aluno a = d.getAluno(pos);
		nome = new JLabel(a.getNome());
		id = new JLabel(a.getNumID());
		cpf = new JLabel(a.getCPF());
		tel = new JLabel(a.getNumTel());
		dtNasc = new JLabel(a.getDataNasc());
		end = new JLabel(a.getEndereco());
		
		nome.setBounds(10, 10, 200, 30);
		id.setBounds(10, 50, 200, 30);
		cpf.setBounds(10, 100, 200, 30);
		tel.setBounds(10, 150, 200, 30);
		dtNasc.setBounds(10, 200, 200, 30);
		jfrm.add(nome);
		jfrm.add(id);
		jfrm.add(cpf);
		jfrm.add(tel);
		jfrm.add(dtNasc);
		jfrm.setVisible(true);
		
	}  		

}
