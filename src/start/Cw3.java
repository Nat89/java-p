package start;

public class Cw3 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 2, 7, 8, 1, 9, 2};
        int szukana = 11;
        int licznik = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == szukana) {
                licznik++;
            }


        }
        System.out.println(szukana + " Występuje " + licznik + " razy ");

    }
}
