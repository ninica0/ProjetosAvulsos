import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int num1, num2, escolha, res;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a operação que desejar:\n" + "1 - Adição\n" + "2 -"
                + " Subtração\n" + "3 - Divisão\n" + "4 - Multiplicação");
        escolha = sc.nextInt();

        if (escolha == 1) {

            System.out.println("Digite um número:\n");
            num1 = sc.nextInt();
            System.out.println("Digite outro número:\n");
            num2 = sc.nextInt();
            res = num1 + num2;
            System.out.println("O resultado da adição é:\n" + res);

        } else if (escolha == 2) {

            System.out.println("Digite um número:\n");
            num1 = sc.nextInt();
            System.out.println("Digite outro número:\n");
            num2 = sc.nextInt();
            res = num1 - num2;
            System.out.println("O resultado da subtração é:\n" + res);

        } else if (escolha == 3) {

            System.out.println("Digite um número:\n");
            num1 = sc.nextInt();
            System.out.println("Digite outro número:\n");
            num2 = sc.nextInt();
            res = num1 / num2;
            System.out.println("O resultado da divisão é:\n" + res);

        } else if (escolha == 4) {

            System.out.println("Digite um número:\n");
            num1 = sc.nextInt();
            System.out.println("Digite outro número:\n");
            num2 = sc.nextInt();
            res = num1 * num2;
            System.out.println("O resultado da multiplicação é:\n" + res);
        }
    }
}
