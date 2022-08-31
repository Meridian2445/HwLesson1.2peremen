public class Main {
    public static void main(String[] args) {System.out.println("Hello world!");
        byte a = 123;
        short b = 12345;
        int c = 1234567;
        long d = 1234567891234L;
        float e = 11.2234f;
        double f = 11.12345678;

        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float weightDifference = secondBoxer - firstBoxer;
        System.out.println("разница между весами боксеров " + weightDifference + " кг");

        float totalWeight = firstBoxer + secondBoxer;
        System.out.println("общий вес боксеров " + totalWeight + " кг!");


        byte weightOneBanana = 80;
        byte bananas = 5;
        short milk = 200;
        short milkportion = 100;
        short milkWeight = 105;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        byte eggs = 4;
        byte oneEggWeight = 70;

        int banansWeight = weightOneBanana * bananas;
        System.out.println("вес бананов " + banansWeight + " грамм");

        int weightMilk = milk / milkportion * milkWeight;
        System.out.println("вес молока " + weightMilk + " грамм");

        int iceCreamWeight = iceCream * weightOneIceCream;
        System.out.println("вес мороженого " + iceCreamWeight + " грамм");

        int eggWeight = eggs * oneEggWeight;
        System.out.println("вес яиц " + eggWeight + " грамм");

        int breakfastWeight = banansWeight + weightMilk + iceCreamWeight + eggWeight;
        System.out.println("общий вес завтрака " + breakfastWeight + " грамм");

        short weightOneKilogram = 1000;
        float breakfast = (breakfastWeight / weightOneKilogram);
        System.out.println("вес завтрака " + breakfast + " кг");


        byte excessWeight = 7;
        short oneKilogram = 1000;
        short resetOneDay = 250;
        short resetOneDaySecondOption = 500;
        int needReset = excessWeight * oneKilogram;
        System.out.println("нужно сбросить " + needReset + " грамм");

        int numberDays = needReset / resetOneDay;
        System.out.println("понадобится " + numberDays + " дней");

        int numberDaySecondOption = needReset / resetOneDaySecondOption;
        System.out.println("понадобится (второй вариант) " + numberDaySecondOption + " дней");

        int daysAverange = (numberDays + numberDaySecondOption) / 2;
        System.out.println("в среднем потребуется " + daysAverange + " дней");
    }
}
