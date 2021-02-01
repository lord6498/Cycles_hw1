package ru.netology.stats;

import java.util.stream.IntStream;

public class StatService {
    // Сумма всех продаж за месяц
    public int salesPerMonth(int[] salesPerMonth) {
        long valueForReturn = 0;
        for (int summ : salesPerMonth) {
            valueForReturn += summ;
        }
        return (int) valueForReturn;
    }

    // Среднняя сумма продаж
    public int averageSumm(int[] salesPerMonth) {
        long valueForReturn = 0;
        for (int summ : salesPerMonth) {
            valueForReturn += summ;
        }
        valueForReturn /= salesPerMonth.length;
        return (int) valueForReturn;
    }

    // Максимальная продажа
    public int maxValue(int[] salesPerMonth) {
        long max = salesPerMonth[0];
        long monthCurrent = 0;
        long month = 0;
        for (int currentValue : salesPerMonth) {
            monthCurrent = monthCurrent + 1;
            if (currentValue > max) {
                max = currentValue;
                month = monthCurrent;
            }

        }

        return (int) month;
    }

    // Минимальная продажа
    public int minValue(int[] salesPerMonth) {
        long min = salesPerMonth[0];
        long monthCurrent = 0;
        long month = 0;
        for (int currentValue : salesPerMonth) {
            monthCurrent = monthCurrent + 1;
            if (currentValue < min) {
                min = currentValue;
                month = monthCurrent;
            }

        }

        return (int) month;
    }

    // Максимальная продажа
    public int valueLessThenAverage(int[] salesPerMonth) {
        long average = IntStream.of(salesPerMonth).sum()/salesPerMonth.length;
        long month = 0;
        for (int currentValue : salesPerMonth) {
            if (currentValue < average) {
                month = month+1;
            }

        }

        return (int) month;
    }

    // Максимальная продажа
    public int valueMoreThenAverage(int[] salesPerMonth) {
        long average = IntStream.of(salesPerMonth).sum()/salesPerMonth.length;
        long month = 0;
        for (int currentValue : salesPerMonth) {
            if (currentValue > average) {
                month = month+1;
            }

        }

        return (int) month;
    }

}

