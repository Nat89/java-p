package start;

// Komentarz
// psvm - public static void main (String[] args)
// sout - System.out.println() ;
// CTRL + SHIFT + F10 - run
// CTRL + /
// CTRL + D - duplicate
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // Sprawdzenie JRE
        System.out.println("JRE version: " + System.getProperty ("java.runtime.version"));

        int lunchTimer = 123456;
        int endTimer = -1234566;
        System.out.println(lunchTimer);
        System.out.println(endTimer);

        double salary = 2100.99;
        System.out.println(salary);

        char signA = 'A';
        char sign9 = '9';
        char signTab = '\'';
        char signSpace = ' ';
        System.out.println(signA);
        System.out.println(sign9);
        System.out.println(signTab);
        System.out.println(signSpace);

        boolean flag = true;
        boolean isLunch = false;
        System.out.println(true);
        System.out.println("isLunch = " + isLunch) ;

//        char sign = 'Natalia', 'Ewa' , 'Ela'

    }
}
