package start;

public class Zad3 {
    public static void main(String[] args) {
        double number = 0.58888;
        boolean isNormalized = true;
        if (number > 1 || number < 0) {
            isNormalized = false;
        }
        System.out.println(isNormalized);
    }
}
