package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldBelowAverageSales() {
        StatsService service = new StatsService();
        int expected = 12;
        int actual = service.belowAverageSales(sales);
        assertEquals(expected, actual);
    }
    @Test
    void shouldAboveAverageSales() {
        StatsService service = new StatsService();
        int expected = 0;
        int actual = service.aboveAverageSales(sales);
        assertEquals(expected, actual);
    }
}