import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TabelaMain extends JFrame{
	private JLabel lblMensagem, lblNomeElemento, lblSimbolo, lblNumeroAtomico, 
	lblMassaAtomica, lblGrupo, lblPeriodo;
	private JCheckBox chkSolido, chkLiquido, chkGasoso;
	private JComboBox cmbElementos;
	private JTextField txtNomeElemento, txtSimbolo, txtNumeroAtomico,
	txtMassaAtomica, txtGrupo, txtPeriodo;
	ArrayList<TabelaPeriodica>listaElementos;
	
	public TabelaMain() {
		super("Tabela Periódica de Elementos Químicos.");
		listaElementos = new ArrayList<TabelaPeriodica>();
	}

	public void LerArquivo(ArrayList<TabelaPeriodica>listaElementos) {
		TabelaPeriodica tabelaPeriodica;
		String strDadosLidos, strNomeElemento, strSimboloElemento, strMassaAtomica, strValor;
		int intNumeroAtomico, intGrupo, intPeriodo, intEstado;
		int intContador;
		boolean blnRepete;
		
		try {
			Scanner dadosArquivo = new Scanner (new File("C: "+File.separator +"LivroOOP"+ 
		File.separator+"ElementosQuimicos.txt"));
		
			while (dadosArquivo.hasNext()) {
				intContador=0;
				strNomeElemento ="";
				strSimboloElemento = "";
				strMassaAtomica = "";
				intEstado=0;
				strDadosLidos= dadosArquivo.next();
				
				blnRepete = true;
				
				while(blnRepete) {
					strNomeElemento += strDadosLidos.charAt(intContador);
					intContador ++;
					
					if (strDadosLidos.charAt(intContador)== '|') {
						intContador++;
						blnRepete= false;
					}
				}
				blnRepete= true;
				
				while(blnRepete) {
					strSimboloElemento+= strDadosLidos.charAt(intContador);
					intContador++;
					
					if (strDadosLidos.charAt(intContador)=='|') {
						intContador++;
						blnRepete= false;
					}
			}
				blnRepete = true;
				strValor="";
				
				while (blnRepete) {
					strValor += strDadosLidos.charAt(intContador);
					intContador++;
					
					if(strDadosLidos.charAt(intContador)=='|') {
						intContador++;
						blnRepete = false;
						
					}
					
				}
			intNumeroAtomico = Integer.parseInt(strValor);
			
			blnRepete = true;
			 while(blnRepete) {
				 strMassaAtomica += strDadosLidos.charAt(intContador);
				 intContador++;
				  if(strDadosLidos.charAt(intContador)== '|') {
					  intContador++;
					  blnRepete = false;
					  
				  }
			 }
			 blnRepete = true;
			 strValor= "";
			 
			 while(blnRepete) {
				 strValor +=strDadosLidos.charAt(intContador);
				 intContador++;
				 
				 if(strDadosLidos.charAt(intContador)== '|') {
					 intContador++;
					 blnRepete= false;
				 }
			 }
			 intGrupo = Integer.parseInt(strValor);
			 
			 blnRepete = true;
			 strValor= "";
			 
			 while (blnRepete) {
				 strValor += strDadosLidos.charAt(intContador);
				 intContador++;
				 
				 if (strDadosLidos.charAt(intContador)== '|') {
					 intContador++;
					 blnRepete = false;
					 
					 
				 }
			 }
			 intPeriodo = Integer.parseInt(strValor);
			 
			 strValor ="";
			 strValor +=strDadosLidos.charAt(intContador);
			 intEstado = Integer.parseInt(strValor);
			 
			 tabelaPeriodica = new TabelaPeriodica(strNomeElemento, strSimboloElemento,
					 intNumeroAtomico, strMassaAtomica, intGrupo, intPeriodo, intEstado);
			 
			 listaElementos.add(tabelaPeriodica);
			 cmbElementos.addItem(strNomeElemento);
					 
			 
			}
			dadosArquivo.close();
			}
catch (FileNotFoundException excecao) {
	JOptionPane.showMessageDialog(null, "Não foi possível ler os dados. ","Erro.", JOptionPane.ERROR_MESSAGE);
}
			
	}
	public void AdicionarElemento(ArrayList<TabelaPeriodica>listaElementos) {
		TabelaPeriodica tabelaPeriodica;
		String strNomeElemento, strSimboloElemento, strMassaAtomica, strDadosArquivo;
		int intNumeroAtomico, intGrupo, intPeriodo, intEstado;
		strNomeElemento = txtNomeElemento.getText();
		strSimboloElemento = txtSimbolo.getText();
		intNumeroAtomico = Integer.parseInt(txtNumeroAtomico.getText());
		strMassaAtomica = txtMassaAtomica.getText();
		intGrupo = Integer.parseInt(txtGrupo.getText());
		intPeriodo = Integer.parseInt(txtPeriodo.getText());
		
		if (chkSolido.isSelected())
			intEstado = 1;
		else if(chkLiquido.isSelected())
			intEstado = 2;
		else if (chkGasoso.isSelected())
			intEstado = 3 ;
		else
			intEstado = 0;
		
		tabelaPeriodica = new TabelaPeriodica(strNomeElemento, strSimboloElemento,
				intNumeroAtomico, strMassaAtomica, intGrupo, intPeriodo, intEstado);
		
		listaElementos.add(tabelaPeriodica);
		cmbElementos.addItem(strNomeElemento);
		
		txtNomeElemento.setText("");
		txtSimbolo.setText("");
		txtNumeroAtomico.setText("");
		txtMassaAtomica.setText("");
		txtGrupo.setText("");
		txtPeriodo.setText("");
		chkSolido.setSelected(false);
		chkLiquido.setSelected(false);
		chkGasoso.setSelected(false);
		
		try {
			PrintStream arquivoSaida = new PrintStream(new File("C:" +File.separator+ 
					"LivroOOP"+File.separator+"ElementosQuimicos.txt"));

			for (int intContador = 0; intContador< listaElementos.size();
					intContador++) {
					strDadosArquivo = listaElementos.get(intContador).getNomeElemento()+"|"+
						listaElementos.get(intContador).getSimboloElemento()+"|"+
						listaElementos.get(intContador).getNumeroAtomico()+"|"+
						listaElementos.get(intContador).getMassaAtomica()+"|"+
						listaElementos.get(intContador).getGrupo()+"|"+
						listaElementos.get(intContador).getPeriodo()+"|"+
						listaElementos.get(intContador).getEstado()+"|"+
						
					arquivoSaida.println(strDadosArquivo);
				
			}
			
			arquivoSaida.close();
		
		
}
	catch(IOException excecao) {
		JOptionPane.showMessageDialog(null, "Não foi possível gravar os dados.","ERRO.", JOptionPane.ERROR_MESSAGE);
	}
		JOptionPane.showMessageDialog(null, "Elemento adicionado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
	}
class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource() == btnSelecionar) {
			int intItem = cmbElementos.getSelectedIndex();
			
			txtNomeElemento.setText(listaElementos.get(intItem).getNomeElemento());
			txtSimbolo.setText(listaElementos.get(intItem).getSimboloElemento());
			txtNumeroAtomico.setText(String.valueOf(listaElementos.get(intItem).getNumeroAtomico()));
			
		}
	}
	
}
}

