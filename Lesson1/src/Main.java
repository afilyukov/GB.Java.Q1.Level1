public class Main {
    public static void main(String[] args) {
        byte byte1 = -127;
        short short1 = 32767;
        int int1 = -2;
        int int2 = 15;
        long long1 = 1000L;
        float a = 10.15f;
        float b = 1.0f;
        float c = 87f;
        float d = 12.71f;
        double double1 = -500.187;
        char char1 = '*';
        boolean b1 = true;
        String greeName = "Alexander";

        System.out.println(Formula(a, b, c,d));
        System.out.println(Analyze(int1, int2));
        Compare(int1);
        printGree(greeName);
        isLeapYear(2020);


    }

    private static float Formula(float f1, float f2, float f3, float f4){
        return f1 * (f2 + (f3 / f4));
    }

    private static boolean Analyze(int i1, int i2) {
        if (i1+i2 > 10 && i1+i2 <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    private static void Compare(int i1) {
        if (i1>=0) {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is negative");
        }
    }

    private static void printGree(String nameGree) {
        System.out.println("Hi, " + nameGree);
    }

    private static void isLeapYear(int year){
        if ((year!=0) && (year%4==0) && (year%100 !=0) || (year%400==0)) {
            System.out.println("Current year is " + year + ". It is a leap year");
        }
        else {
            System.out.println("Current year is " + year + ". It is not a leap year");
        }
    }
}