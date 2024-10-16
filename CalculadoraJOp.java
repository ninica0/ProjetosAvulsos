import javax.swing.JOptionPane;

public class CalculadoraJOp {

   



	public static void main(String[] args) {
		int num1, num2, escolha, res;
		
		escolha = Integer.parseInt(JOptionPane.showInputDialog( "Escolha a operação que desejar:\n"+"1 - Adição\n"+"2 -"
				+ " Subtração\n"+"3 - Divisão\n"+"4 - Multiplicação"));
		
		
		if(escolha==1) {
			
	num1 = Integer.parseInt(JOptionPane.showInputDialog( "Digite um número:\n"));
		 
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:\n"));
		
		res = num1 + num2;
		JOptionPane.showMessageDialog(null, "O resultado da adição é:"+res);
		
		}else if (escolha==2) {
			
			num1 =Integer.parseInt(JOptionPane.showInputDialog("Digite um número:\n"));
			
			num2 =Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:\n"));
			
			res = num1 - num2;
			JOptionPane.showMessageDialog(null,"O resultado da subtração é:"+res);

			}else if (escolha==3) {
				
		num1 =Integer.parseInt(JOptionPane.showInputDialog("Digite um número:\n"));
			
			num2 =Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:\n"));
			
			res = num1 / num2;
			JOptionPane.showMessageDialog(null, "O resultado da divisão é:"+res);
			
			}else if (escolha==4) {
				
				num1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:\n"));
				
				num2 =Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:\n"));
			
				res = num1 * num2;
				JOptionPane.showMessageDialog(null, "O resultado da multiplicação é:"+res);
			}
	

		

	}
	}



