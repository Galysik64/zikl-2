public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int savings = 0;
        int month = 15000;
        int i = 0;
        while (savings < 2_459_000) {
            i++;
            savings = month + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " рублей.");
        }
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int r = 10; r > 0; r--) {
            System.out.print(r + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int people = 12000000;
        int born = 17;
        int death = 8;
        int year = 2010;
        while (year < 2020) {
            year++;
            int increase = born - death;
            people += people * increase / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }
        System.out.println("Задача 4");
        int total = 12_000_000;
        double percent = 7d / 100;
        int contribution = 15000;
        int period = 0;
        while (contribution < total) {
            contribution = (int) (contribution * (1 + percent));
            period++;
            System.out.println("Месяц " + period + " сумма накоплений равна " + contribution + " рублей.");
        }
        System.out.println("Задача 5");
        period = 0;
        contribution = 15000;
        while (contribution < total) {
            contribution = (int) (contribution * (1 + percent));
            period++;
            if (period % 6 == 0)
                System.out.println("Месяц " + period + " сумма накоплений равна " + contribution + " рублей.");
        }
        System.out.println("Задача 6");
        period = 0;
        contribution = 15000;
        month = 12 * 9;
        while (period < month) {
            contribution = (int) (contribution * (1 + percent));
            period++;
            if (period % 6 == 0)
                System.out.println("Месяц " + period + " сумма накоплений равна " + contribution + " рублей.");
        }
        System.out.println("Задача 7");
        int friday = 1;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо сдать отчет.");
        }
        System.out.println("Задача 8");
        period = 79;
        int begin = 0;
        int start = year - 200;
        int end = year + 100;
        for(int g = begin; g < end; g += period) {
            if(g > start) {
                System.out.println(g);
            }
        }
    }
}

