package start;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dozwolone operacje: (+) , (-) , (*) , (/) , (%) , (^) ");
        double varl = scanner.nextDouble();
        scanner.nextLine();
        char key = scanner.nextLine() .charAt( (0));
        double var2 = scanner.nextDouble();
        switch (key) {
            case '+':
                System.out.printf("%f %c %f = %f",varl , key, var2, varl + var2);
                break;
            case '-':
                    System.out.printf("%f %c %f = %f",varl , key, var2, varl - var2);
                    break;
            case '*':
                System.out.printf("%f %c %f = %f",varl , key, var2, varl * var2);
                break;
            case '/':
                    System.out.printf("%f %c %f = %f",varl , key, var2, varl / var2);
                break;
            case '%':
                    System.out.printf("%f %c %f = %f",varl , key, var2, varl % var2);
                    break;
            case '^':
                        System.out.printf("%f %c %f = %f",varl , key, var2, Math.pow(varl, var2));
                        break;
        }
        scanner.close();
    }
}
