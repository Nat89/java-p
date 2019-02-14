package start;

public class Jp2 {
    public static void main(String[] args) {
        //deklaracje
        String name, lastname, possition;
        final String PESEL;
        char gender;
        double salary_net;
        boolean isRetired;
        // przypisanie
        name = "Adam";
        lastname = "Kowalski";
        possition = "Developer";
        PESEL = "123456789";
        salary_net = 10000;
        isRetired = false;
        gender = 'M';
        //prezentacja
        System.out.printf("%10s | %10s | %12s | %2s |%8.2f | %b", name, lastname, possition, gender, salary_net, isRetired);

    }



}
