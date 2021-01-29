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
        String expected = "6";
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        String actual = service.maxValue(salesPerMonth);
        String[] data = actual.split("");
        Assertions.assertEquals(expected, data[0]);
    }

    @Test
    void minValue() {
        String expected = "9";
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        String actual = service.minValue(salesPerMonth);
        String[] data = actual.split("");
        Assertions.assertEquals(expected, data[0]);
    }

    @Test
    void valueLessThenAverage() {
        String expected = "5";
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        String actual = service.valueLessThenAverage(salesPerMonth);
        String[] data = actual.split("");
        Assertions.assertEquals(expected, data[0]);
    }

    @Test
    void valueMoreThenAverage() {
        String expected = "5";
        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        String actual = service.valueMoreThenAverage(salesPerMonth);
        String[] data = actual.split("");
        Assertions.assertEquals(expected, data[0]);
    }

}