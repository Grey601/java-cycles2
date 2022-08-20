package ru.netology.stats;

public class StatsService {

    public int calcSumSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public double calcAvgSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        int avgSales = sumSales/sales.length;
        return avgSales;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int countHigherThenAvgMonths(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        int avgSales = sumSales/sales.length;
        int numHigherThenAvgMonths = 0;
        for (int n = 0; n < sales.length; n++) {
            if (sales[n] > avgSales) {
                numHigherThenAvgMonths = numHigherThenAvgMonths + 1;
            }
        }
        return numHigherThenAvgMonths;
    }

    public int countLowerThenAvgMonths(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        int avgSales = sumSales / sales.length;
        int numLowerThenAvgMonths = 0;
        for (int n = 0; n < sales.length; n++) {
            if (sales[n] < avgSales) {
                numLowerThenAvgMonths = numLowerThenAvgMonths + 1;
            }
        }
        return numLowerThenAvgMonths;
    }
}
