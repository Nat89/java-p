package start;

public class Cw3 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 2, 7, 8, 1, 9, 2};
        int szukana = 2;
        int licznik = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == szukana) {
                licznik++;
            }


        }
        System.out.println(szukana + " Występuje " + licznik + " razy ");

int suma_mniejsze = 0;
int suma_większe = 0;
        for (int k : numbers) {
            if (k>szukana) {
                suma_większe += k;

            }
            else if (k<szukana) {
                suma_mniejsze +=k;
            }

        }
        System.out.println(suma_większe - suma_mniejsze);

        int max_value=numbers[0];
        for(int i =0; i<numbers.length; i++) {
            if (numbers[i]>max_value) {
                max_value = numbers[i];

            }
        }
        System.out.println(max_value);
    }

}

