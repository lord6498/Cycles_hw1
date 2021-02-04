import ru.netology.stats.StatService;

public class Main {
    public static void main(String[] args) {

        int[] salesPerMonth = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatService service = new StatService();
        int sum = service.salesPerMonth(salesPerMonth);
        System.out.println(sum + " Summ of values");

        int average = service.averageSumm(salesPerMonth);
        System.out.println(average + " Average ");

        int maxValue = service.maxValue(salesPerMonth);
        System.out.println(maxValue);

        int minValue = service.minValue(salesPerMonth);
        System.out.println(minValue);

        int monthLess = service.valueLessThenAverage(salesPerMonth);
        System.out.println(monthLess);

        int monthMore = service.valueMoreThenAverage(salesPerMonth);
        System.out.println(monthMore);


    }
}
