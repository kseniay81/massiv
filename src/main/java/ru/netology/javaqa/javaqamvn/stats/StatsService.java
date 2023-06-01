package ru.netology.javaqa.javaqamvn.stats;
public class StatsService {

    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;

        }
        return sumMonth;
    }
    public double avergSales(long[] sales) {
        double avergSum = 0;
        double sumMonth = 0;

        sumMonth = sumSales(sales);
        avergSum = sumMonth / sales.length;

        return avergSum;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int lessThanAvergSales(long[] sales) {
        int lessAvergMonth = 0;
        double avergSum = avergSales(sales);

        for (long sale : sales) {
            if (sale <= avergSum) {
                lessAvergMonth++;
            }
        }
        return lessAvergMonth;
    }

    public int aboveAvergSales(long[] sales) {
        int aboveAvergMonth = 0;
        double avergSum = avergSales(sales);

        for (long sale : sales) {
            if (sale >= avergSum) {
                aboveAvergMonth++;
            }
        }
        return aboveAvergMonth;
    }

}
