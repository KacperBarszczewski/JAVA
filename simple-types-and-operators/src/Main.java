import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //1/////////////////////////////////////////
        System.out.println('a' + 'A');

        System.out.println("\"");

        System.out.println("What is the result of adding? " + 1 + 2 + 3);

        System.out.println(1 + 2 + 3 + " What will be the result here?");

        System.out.println("What is the result of adding? " + (1 + 2 + 3));

        boolean boolExample = !(true);
        System.out.println(boolExample);

        byte by = (byte) 256;
        System.out.println(by);

        byte bySecond = (byte) 256;
        System.out.println(bySecond);

        char c = 0x6d;
        char d = 0155;
        System.out.println(c + " = " + d);

        double roundingExample = 2.0 - 1.9;
        System.out.println(roundingExample);

        System.out.println();
        /////////////////////////////////////////////

        int a = 1000000000;
        System.out.println("Here the variable a has a value: " + a);

        a += 1000000000;
        System.out.println("Here the variable a has a value: " + a);

        a += 1000000000;
        System.out.println("Here the variable a has a value: " + a);

        a += 1000000000;
        System.out.println("Here the variable a has a value: " + a);

        System.out.println(2147483647 + 1);
        System.out.println(2147483647L + 1);

        System.out.println();
        //2/////////////////////////////////////
        float GravityMars = 0.38F;
        float MyWeight = 80;
        double result;
        int intResult;
        char charResult;
        int charToInt;

        result = MyWeight * GravityMars;
        System.out.println("Gravity on Mars: " + String.format("%.4f", result));

        intResult = (int) result;
        System.out.println("float to int: " + intResult);

        charResult = (char) intResult;
        System.out.println("int to char: " + charResult);

        charToInt = charResult + 1;
        System.out.println("char to int: " + charToInt);

        System.out.println();
        //3/////////////////////////////////////////////////
        int number = (int) (Math.random() * 100);

        if (number % 2 == 0) {
            System.out.println("Number: " + number + " is even");
        } else {
            System.out.println("Number: " + number + " is odd");
        }

        System.out.println();
        //5///////////////////////////////////////////////////////////////
        double netto = 9.99F;
        double vat = 0.23;
        double brutto = netto * (1 + vat);
        double totalPrice = brutto * 10000;

        System.out.println("Brutto: " + brutto);
        System.out.println("value brutto of 10000 products: " + totalPrice);
        System.out.println("10000 products netto value: " + totalPrice * (1 - vat));

        //Big Decimal
        BigDecimal netto2 = new BigDecimal(9.99);
        BigDecimal vat2 = new BigDecimal(0.23);
        BigDecimal brutto2 = netto2.multiply(BigDecimal.ONE.add(vat2));
        BigDecimal totalPrice2 = brutto2.multiply(new BigDecimal(10000));
        BigDecimal totalPriceNetto2 = totalPrice2.multiply(BigDecimal.ONE.subtract(vat2));


        System.out.println("Brutto: " + brutto2);
        System.out.println("value brutto of 10000 products: " + totalPrice2);
        System.out.println("10000 products netto value: " + totalPriceNetto2);


    }
}