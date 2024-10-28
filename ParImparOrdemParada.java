import java.util.Scanner;

public class ParImparOrdemParada {
    
	public static void main(String[] args) {
		int num, cont,produto,soma,contImpar, contPar;
		num = 0;
		produto=1;
		soma=0;
		contImpar=0;
		contPar=0;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			if(num>=0) {
				if(num%2==1) {
					produto*=num;
					contImpar++;
				}else {
					soma+=num;
					contPar++;
					
				}
			}
			System.out.println("Caso queira parar digite [0]");
			
		}while(num!=0);
		System.out.println("Total de ímpares: "+contImpar+"\nProduto: "+produto);
		System.out.println("Total de pares: "+contPar+"\nTotal soma: "+soma);
			
		}
			
			
		}
		

	


