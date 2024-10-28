import java.util.Scanner;

public class VetorString {
   



	public static void main(String[] args) {
	String[]nomes= {"Maria Clara", "Maria Eduarda", "Matheus","Maxsuel","Murillo Fernandes",
			        "Murilo Rangel", "Nauan","Nicoly","Nikolas","Pedro", 
			        "Rafael Silva","Rafel Rosa","Reinaldo","Sarah","Taís",
			        "Thiago","Valdir","Wallas","Yuri","Rebecca"};
	
	
	String[]data= {" 10/12"," 31/08"," 17/07"," 06/12"," 19/08"," 19/08",
			       " 15/02"," 13/04"," 03/11"," 20/10"," 26/09",
			       " 08/02"," 21/06"," 25/03"," 16/06"," 16/11"," 24/11"," 25/09"," 30/10"," 28/02"};
	
	int mes;
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o mês: ");
	mes=sc.nextInt();
	
	switch (mes) {
	case 1: System.out.println("Não têm aniversariantes do mês: ");
		break;
	case 2: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[11]+" "+data[11]+"\n"+nomes [6]+" "+data[6]+"\n"+nomes[19]+" "+data[19]);
		break;
	case 3: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[13]+" "+data[13]);
		break;
	case 4: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[7]+data[7]);
		break;
	case 5: System.out.println("Não têm aniversariantes do mês: ");
		break;
	case 6: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[14]+" "+data[14] +"\n"+nomes[5]+" "+data[5]);
	
		break;
	case 7: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[2]+" "+data[2]);
		break;
	case 8: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[1]+" "+data[1]+"\n"+nomes[4]+" "+data[4]);
		break;
	case 9: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[17]+" "+data[17]);
		break;
	case 10: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[9]+" "+data[9]+"\n"+nomes[18]+" "+data[18]);
		break;
	case 11: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[8]+" "+data[8]+"\n"+nomes[15]+" "+data[15]+" "+"\n"+nomes[16]+" "+data[16]);
		break;
	case 12: System.out.println("Aniversariantes do mês: ");
	System.out.println(nomes[3]+" "+data[3]+"\n"+nomes[0]+" "+data[0]);
		break;
	}
	
//	for(int i=0; i<20;i++) {
//		System.out.println(nomes[i]+""+data[i]);
	}
}
	
	

