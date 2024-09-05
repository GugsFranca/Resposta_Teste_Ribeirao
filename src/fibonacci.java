import java.util.Scanner;

public class fibonacci {

    public static boolean sequencia (int num){
        int a = 0, b = 1;

        if (num == 0 || num == 1) {return true;}
        while (b<= num) {
            if (b == num) {
                return true;
            }
            int soma = b + a;
            a = b;
            b = soma;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número desejado: ");
        int num = scanner.nextInt();

        if (sequencia(num)) {
            System.out.println("O número " + num + " pertence a sequência.");
        }else{
            System.out.println("O número " + num + " não pertence a sequência.");
        }

        scanner.close();
    }
    
}