package start;

import java.util.Scanner;

public class Cw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = -1;
        int promien;

        while (key != 0){
            // pobierany promien
            System.out.println("Wpisz wartość promienia: ");
        promien = scanner.nextInt();

        System.out.println("Wybierz funkcję do obliczeń: \n (1) Pole Koła \n (2) Obwód okręgu \n (3) Sfera.");

        //klucz do instrukcji switch-case
        key = scanner.nextInt();
        switch (key) {
            case 1:
                System.out.printf("Pole: %.2f ", Math.PI * Math.pow(promien, 2));
                break;
            case 2:
                System.out.printf("Obwód %.2f \n\n", Math.PI * 2 * promien);
            case 3:
                System.out.printf("Sfera: %.2f \n\n", 4 * Math.PI * Math.pow(promien, 3) / 3);
                break;
            case 0:
                System.out.println("Wyjście\n");
                break;
            default:
                System.out.println("Błedny wybór!\n");
        }}
    }
    }

