import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
	String nome, user;
	int senha, senha2, loop = 1;
	
	nome = JOptionPane.showInputDialog(null, "Digite seu nome completo: ");
	senha =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua senha de 6 números (apenas números): "));
	
	JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso! ");
	
	do {
		
		user = JOptionPane.showInputDialog(null, "Digite seu nome de usuário: ");
		senha2 =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua senha: "));
		
		if (user.equals(nome) && (senha2==senha)){
			JOptionPane.showMessageDialog(null, "Login concluído com sucesso!");
			loop = 2;
		}else {
			JOptionPane.showMessageDialog(null, "Nome ou senha inválido. Tente novamente.");
		}
		
	}while (loop == 1); 
	
	 
	

	}

}
