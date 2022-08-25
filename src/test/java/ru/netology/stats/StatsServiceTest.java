package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcSumSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sumExpected = 180;
        int sumActual = service.calcSumSales(sales);

        Assertions.assertEquals(sumExpected, sumActual);
    }

    @Test
    public void shouldCalcAvgSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int avgExpected = 15;
        double avgActual = service.calcAvgSales(sales);

        Assertions.assertEquals(avgExpected, avgActual);
    }

    @Test
    public void shouldFindMaxSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int maxSalesMonthExpected = 8;
        int maxSalesMonthActual = service.maxSalesMonth(sales);

        Assertions.assertEquals(maxSalesMonthExpected, maxSalesMonthActual);
    }

    @Test
    public void shouldFindMinSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int minSalesMonthExpected = 9;
        int minSalesMonthActual = service.minSalesMonth(sales);

        Assertions.assertEquals(minSalesMonthExpected, minSalesMonthActual);
    }

    @Test
    public void shouldCountHigherThenAvgMonthsTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int higherThenAvgMonthsExpected = 5;
        int higherThenAvgMonthsActual = service.countHigherThenAvgMonths(sales);

        Assertions.assertEquals(higherThenAvgMonthsExpected, higherThenAvgMonthsActual);
    }

    @Test
    public void shouldCountLowerThenAvgMonthsTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int lowerThenAvgMonthsExpected = 5;
        int lowerThenAvgMonthsActual = service.countLowerThenAvgMonths(sales);

        Assertions.assertEquals(lowerThenAvgMonthsExpected, lowerThenAvgMonthsActual);
    }

}