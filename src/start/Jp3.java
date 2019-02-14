package start;

public class Jp3 {
    public static void main(String[] args) {
        // PL
        String varl, var2, var3, var4;
        // P2
        varl = "java";
        var2 = "test";
        var3 = varl + var2;
                // P3
        var4 = var3 + "AAA";
        //P4
        System.out.println(var3.toUpperCase());
        System.out.println(var3.toLowerCase());
        //P5
        System.out.println(var4.length());
        //P6
        System.out.print("Index 2: " + var3.charAt (2));
        System.out.print("Index 5: " + var3.charAt (5));
        System.out.print(var4.charAt(var4.length()-3));
        //P7
        System.out.println("VAR1 substr: " + var4.substring(0,4));
        System.out.println("VAR2 substr: " + var4.substring(4,8));
    }
}
