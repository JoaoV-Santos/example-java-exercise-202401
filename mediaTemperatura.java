import java.util.Scanner;

public class mediaTemperatura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double temperatura = 0;
        double temperaturaSoma = 0;
        int i = 1;

        while (i < 13) {
            System.out.print("\nDigite a temperatura " + i + " (entre 4 e 10): ");
            temperatura = in.nextDouble();
            //temperaturaSoma = temperatura;

            while (temperatura < 4 || temperatura > 10) {
                System.out.print("\nEntrada inválida. Digite uma temperatura entre 4 e 10: ");
                temperatura = in.nextDouble();
            }
            temperaturaSoma += temperatura;
            i += 1;
            temperatura = 0;
        }

        double media = temperaturaSoma / 12;
        System.out.printf("\nA média de hoje das temperaturas é: %.1fºC" , media);


        in.close();
    }
}
