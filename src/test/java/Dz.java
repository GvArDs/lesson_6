public class Dz {
    public static void main(String[] args) {
        System.out.println("\n>>> byte");

        byte a = 1;
        byte b = 2;

        byte byteAddition = (byte) (a + b);
        byte byteSubtraction = (byte) (a - b);
        byte byteMultiplication = (byte) (a * b);
        byte byteDivision = (byte) (a / b);
        byte eByte = (byte) (a % b);

        System.out.println("\t\t" + a + " + " + b + " = " + byteAddition);
        System.out.println("\t\t" + a + " - " + b + " = " + byteSubtraction);
        System.out.println("\t\t" + a + " * " + b + " = " + byteMultiplication);
        System.out.println("\t\t" + a + " / " + b + " = " + byteDivision);
        System.out.println("\t\t" + a + " % " + b + " = " + eByte);


        System.out.println("\n>>> int");

        int c = 1;
        int d = 2;

        int intAddition = (Integer) (c + d);
        int intSubtraction = (Integer) (c - d);
        int intMultiplication = (Integer) (c * d);
        int intDivision = (Integer) (c / d);
        int eInt = (Integer) (c % d);

        System.out.println("\t\t" + c + " + " + d + " = " + intAddition);
        System.out.println("\t\t" + c + " - " + d + " = " + intSubtraction);
        System.out.println("\t\t" + c + " * " + d + " = " + intMultiplication);
        System.out.println("\t\t" + c + " / " + d + " = " + intDivision);
        System.out.println("\t\t" + c + " % " + d + " = " + eInt);


        System.out.println("\n>>> double");

        double e = 1.99;
        double f = 2.99;

        double doubleAddition = (Double) (e + f);
        double doubleSubtraction = (Double) (e - f);
        double doubleMultiplication = (Double) (e * f);
        double doubleDivision = (Double) (e / f);
        double eDouble = (Double) (e % f);

        System.out.println("\t\t" + e + " + " + f + " = " + doubleAddition);
        System.out.println("\t\t" + e + " - " + f + " = " + doubleSubtraction);
        System.out.println("\t\t" + e + " * " + f + " = " + doubleMultiplication);
        System.out.println("\t\t" + e + " / " + f + " = " + doubleDivision);
        System.out.println("\t\t" + e + " % " + f + " = " + eDouble);

        System.out.println("\n>>> ____");
        boolean aBoolean = c >= d;
        System.out.println("\t\tc >= d - " + aBoolean);

        boolean bBoolean = c < d;
        System.out.println("\t\tc < d - " + bBoolean);

        boolean cBoolean = c != d;
        System.out.println("\t\tc != d - " + cBoolean);

        boolean dBoolean = c == d;
        System.out.println("\t\tc == d - " + dBoolean);

        System.out.println("\n>>> String");
        String s = null;
        System.out.println("\t\t" + s + " " + 1);

        System.out.println("\n>>> Overflow byte");
        int w = 127;
        int z = (byte) (w + 1);
        System.out.println("\t\t" + z);

        System.out.println("\n>>> Overflow short");

        int aW = 32767;
        int aZ = (short) (aW + 1);
        System.out.println("\t\t" + aZ);

        System.out.println("\n>>> int and double");
        int intA = 100;
        double doubleB = 111.11;
        System.out.println("\t\tintA + doubleB = " + (intA + doubleB));
        System.out.println("\t\tintA - doubleB = " + (intA - doubleB));
        System.out.println("\t\tintA * doubleB = " + (intA * doubleB));
        System.out.println("\t\tintA / doubleB = " + (intA / doubleB));
        System.out.println("\t\tintA % doubleB = " + (intA % doubleB));
    }
}
