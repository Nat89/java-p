package start;

public class TableExample {
    public static void main(String[] args) {
        double signal [] = {0.5, 0.11, 0.43, 0.67, 0.01, 0.11};
        // wypisanie
        // inicjalizacja zmiennej pomocniczej; warunek zatrzymania pętli; krok)
//        for(int i =0;) {


//        }
        System.out.println(signal[0]);
        System.out.println(signal[1]);
        System.out.println(signal[2]);
        System.out.println(signal[3]);
        System.out.println(signal[4]);
        System.out.println(signal[5]);
        // modyfikacja
        signal[4] = 0;
        signal[2] = 10;
        System.out.println(signal[0]);
        System.out.println(signal[1]);
        System.out.println(signal[2]);
        System.out.println(signal[3]);
        System.out.println(signal[4]);
        System.out.println(signal[5]);
        // długość tablicy
        System.out.println("Długość sygnału: " + signal.length);
    }
}
