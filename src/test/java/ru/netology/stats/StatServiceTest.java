package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class StatServiceTest {
    StatService service = new StatService();


    @Test
    void salesPerMonth() {
        int expected = 180;
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.salesPerMonth(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void averageSumm() {
        int expected = 15;
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSumm(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxValue() {
        int expected = 8;
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxValue(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minValue() {
        int expected = 9;
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minValue(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void valueLessThenAverage() {
        int expected = 5;
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.valueLessThenAverage(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void valueMoreThenAverage() {
        int expected = 5;
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.valueMoreThenAverage(salesPerMonth);
        Assertions.assertEquals(expected, actual);
    }

}