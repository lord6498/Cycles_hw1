package ru.netology.stats;

import java.util.stream.IntStream;

public class StatService {
    // Сумма всех продаж за месяц
    public int salesPerMonth(int[] salesPerMonth) {
        int valueForReturn = 0;
        for (int summ : salesPerMonth) {
            valueForReturn += summ;
        }
        return valueForReturn;
    }

    // Среднняя сумма продаж
    public int averageSumm(int[] salesPerMonth) {
        int valueForReturn = 0;
        for (int summ : salesPerMonth) {
            valueForReturn += summ;
        }
        valueForReturn /= salesPerMonth.length;
        return valueForReturn;
    }

    // Максимальная продажа
    public int maxValue(int[] salesPerMonth) {
        int max = salesPerMonth[0];
        int monthCurrent = 0;
        int month = 0;
        for (int currentValue : salesPerMonth) {
            monthCurrent++;
            if (currentValue >= max) {
                max = currentValue;
                month = monthCurrent;
            }

        }

        return month;
    }

    // Минимальная продажа
    public int minValue(int[] salesPerMonth) {
        int min = salesPerMonth[0];
        int monthCurrent = 0;
        int month = 0;
        for (int currentValue : salesPerMonth) {
            monthCurrent++;
            if (currentValue <= min) {
                min = currentValue;
                month = monthCurrent;
            }

        }

        return  month;
    }

    // Количество месяцев меньше средней суммы
    public int valueLessThenAverage(int[] salesPerMonth) {
        int average = averageSumm(salesPerMonth);
        int month = 0;
        for (int currentValue : salesPerMonth) {
            if (currentValue < average) {
                month++;
            }

        }

        return month;
    }

    // Количество месяцев больше средней суммы
    public int valueMoreThenAverage(int[] salesPerMonth) {
        int average = averageSumm(salesPerMonth);
        int month = 0;
        for (int currentValue : salesPerMonth) {
            if (currentValue > average) {
                month++;
            }

        }

        return month;
    }

}

