public class Main {
    public static void main(String[] args) {
        System.out.println(" ДОМАШНЕЕ ЗАДАНИЕ - 1");
        System.out.println("  Задание - 1");
        for (int i = 1; i < 11; i ++) {
            System.out.println("Значение " + i);
        }
        System.out.println("  Задание - 2");
        for (int l = 10; l >= 1; l --) {
            System.out.println("Значение " + l);
        }
        System.out.println("  Задание - 3");
        for (int k = 0; k <17; k = k + 2) {
            System.out.println("Четное число " + k);
        }
        System.out.println("  Задание - 4");
        for (int m = 10; m >= -10; m --) {
            System.out.println("Следующее число по убыванию " + m);
        }
        System.out.println(" ДОМАШНЕЕ ЗАДАНИЕ - 2");
        System.out.println("  Задание - 1");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println("  Задание - 2");
        for (int sequence = 7; sequence <=98; sequence = sequence + 7) {
            System.out.println(sequence);
        }
        System.out.println("  Задание - 3");
        for (int s = 1; s <= 512; s = s * 2) {
            System.out.println(s);
        }
        System.out.println(" ДОМАШНЕЕ ЗАДАНИЕ - 3");
        System.out.println("  Задание -  1");
        int deposit = 29000;
        int total = 0;
        for (int month = 1; month <=12; month ++) {
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("  Задание - 2");
        int deposit1 = 29000;
        int total1 = 0;
        for (int month1 = 1; month1 <=12; month1 ++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + deposit1;
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + total1 + " рублей");
        }
        System.out.println("-------------------------------");
        System.out.println("Прошу проверить  ДЗ");
    }
}