public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total <= 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int j = 10; j>=1; j--){
            System.out.print(j+ " ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int paysY = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int diff = fertility - mortality;
        for (int i = 1; i <=10; i++ ) {
            paysY = paysY + (paysY * diff/1000);
            System.out.println("Год "+ i + " численность населения составляет "+ paysY);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int i = 1;
        for (;total<12_000_000; i++) {
            total = total + salary +(salary*7/100);
            System.out.println("Месяц " + i + " Итого " + total);

        }
    }
    public static void task5 (){
        System.out.println("Задача 5");
        int salary = 15000;
        int total = 0;
        int i = 1;
        for (; total<=12_000_000; i++){
            total = total + salary + (salary*7/100);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int salary = 15000;
        int total = 0;
        int i = 1;
        for (; total<=12_000_000 && i<=108; i++){
            total = total + salary + (salary*7/100);
            if (i%6 == 0 ){
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int dayFriday = 5   ;
        for(; dayFriday<=31 ;dayFriday=dayFriday +7){
            System.out.println("Сегодня пятница," + dayFriday +"-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int i = 1896;
        for (; i<=2054; i = i + 79)
            System.out.println(i);
    }
}
