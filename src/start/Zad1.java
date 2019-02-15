import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Podaj staż pracy");
        int empl_fell = scanner.nextInt();
        switch (empl_fell) {
        case 0: case 1: case 2: case 3: case 4:
            System.out.println("junior");
            break;
        case 5: case 6: case 7: case 8: case 9:
            System.out.println("regular");
            break;
        default:
            System.out.println("senior");
        }
      scanner.close ();

    }
}
