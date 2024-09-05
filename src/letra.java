import java.util.Scanner;

public class letra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a String desejada: ");
        String nome = scanner.nextLine();
        scanner.close();

        int contador = 0;
        for (int i = 0; i < nome.length(); i++) {
            char letra = nome.toLowerCase().charAt(i);
            if (letra == 'a') {
                contador ++;
            }
            
        }
        System.out.println("A string " +nome+ " contem "+contador+ " letras a");
    }
}
