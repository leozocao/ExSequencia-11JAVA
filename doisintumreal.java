import java.util.Scanner;

public class doisintumreal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1;
        double n2, n3, situ1, situ2, situ3;

        System.out.print("Digite um número inteiro: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro número inteiro: ");
        n2 = teclado.nextInt();
        System.out.print("Digite um número real: ");
        n3 = teclado.nextDouble();

        situ1 = (n1 * 2) * (n2 / 2);
        situ2 = (n1 * 3) + (double)n3;
        situ3 = Math.pow(n3 , 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + situ1);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + situ2);
        System.out.print("O terceiro elevado ao cubo: " + situ3);
        

        teclado.close();
    }
}