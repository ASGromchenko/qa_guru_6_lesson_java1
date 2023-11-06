package guru.qa;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 4;

        System.out.println("Арифметические операторы: \n");
        int sum = a + b;
        int subtr = a - b;
        int multipl = a * b;
        int div = a / b;
        int rem = a % b;
        System.out.println("Сумма = " + sum);
        System.out.println("Вычитание = " + subtr);
        System.out.println("Умножение = " + multipl);
        System.out.println("Деление = " + div);
        System.out.println("Остаток от деления = " + rem);

        System.out.println("\nОператоры сравнения: \n");
        boolean c = a == b;
        boolean d = a != b;
        boolean e = a > b;
        boolean f = a < b;
        boolean g = a >= b;
        boolean h = a <= b;
        System.out.println("Равенство = " + c);
        System.out.println("Неравенство = " + d);
        System.out.println("Больше = " + e);
        System.out.println("Меньше или равно = " + h);

        System.out.println("\nЛогические операторы: \n");
        boolean tr = true;
        boolean fl = false;
        System.out.println("AND = " + (tr&&fl));
        System.out.println("OR = " + (tr||fl));
        System.out.println("NONE = " + !(tr&&fl));

        int x = Integer.MAX_VALUE;
        int y = 5000;
        int summ = x + y;
        System.out.println("Переполнение = " + summ);

        System.out.println("\nВычисления комбинаций типов данных");
        int j = 5;
        double l = 2.5;

        System.out.println("Сумма = " + (j+l));
        System.out.println("Разность = " + (j-l));
        System.out.println("Умножение = " + (j*l));
        System.out.println("Деление = " + (j/l));



    }
}