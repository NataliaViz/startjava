public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1 Вывод характеристик компьютера");

        String deviceName = "WIN-L2315454DS";
        float cpu = 7700f;
        byte ram = 17;
        char deviceCode = 's';
        int deviceCode2 = 2545457;
        long codeProduct = 545457813254l;
        double systemType = 64.0;
        System.out.println("Имя устройста " + deviceName);
        System.out.println("Процессор " + cpu);
        System.out.println("Код устройства " + deviceCode + deviceCode2);
        System.out.println("Код продукта " + codeProduct);
        System.out.println("Тип системы " + systemType);

        System.out.println("\n2 Расчет стоимости товара со скидкой");

        double penPrice = 100;
        double bookPrice = 200;
        double sumProduct = penPrice + bookPrice;
        double discontAmount = sumProduct / 100 * 11;
        double discontPrice = sumProduct - discontAmount;
        System.out.println("Общая стоимость товара без скидки = " + sumProduct + " руб.");
        System.out.println("Сумма скидки = " + discontAmount + " руб.");
        System.out.println("Общая стоимость товара со скидкой = " + discontPrice + " руб.");
    
        System.out.println("\n3 JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4 Вывод min и max значений целых числовых типов");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807l;
        System.out.println("a = " + a);
        System.out.println("a max = " + ++a);
        System.out.println("a min = " + --a);
        System.out.println("\nb = " + b);
        System.out.println("b max = " + ++b);
        System.out.println("b min = " + --b);
        System.out.println("\nc = " + c);
        System.out.println("c max = " + ++c);
        System.out.println("c min = " + --c);
        System.out.println("\nd = " + d);
        System.out.println("d max = " + ++d);
        System.out.println("d min = " + --d);

        System.out.println("\n5 Перестановка значений переменных");
        int x = 5;
        int y = 2;

        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println("Первоначальное значение: x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Перестановка с помощью арифметической операции");
        System.out.println("Первоначальное значение: x = " + x + ", y = " + y);
        y = y + x;
        x = y - x;
        y = y - x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Перестановка с помощью побитовой операции операции");
        System.out.println("Первоначальное значение: x = " + x + ", y = " + y);
        y = y ^ x;
        x = y ^ x;
        y = y ^ x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("\n6 Вывод символов и их кодов");
        char dollar = '$';
        System.out.println("код 36 = " + dollar);
        char asterisk = '*';
        System.out.println("код 42 = " + asterisk);
        char atSign = '@';
        System.out.println("код 64 = " + atSign);
        char verticalBar = '|';
        System.out.println("код 124 = " + verticalBar);
        char tilde = '~';
        System.out.println("код 126 = " + tilde);

        System.out.println("\n7 Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = 92; //почему компелятор выдает ошибку на запиль'\'?
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("     " + slash + backSlash);
        System.out.println("    " + slash + "  " + backSlash);
        //можно так переносить? (в уроке сказано что не желательно писать код дальше этой линии)
        System.out.println("   " + slash + underscore +leftParenthesis + " " + rightParenthesis +
            backSlash);
        System.out.println("  " + slash + "      " + backSlash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash +
            backSlash + underscore + underscore + backSlash);

        System.out.println("\n8 Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        System.out.println("Число 123 содержит:");
        System.out.println("сотен - " + n / 100);
        System.out.println("десятков - " + n / 10);
        System.out.println("едениц - " + n / 1);

        System.out.println("\n9 Вывод времени");
        int second = 86399;
        //вычесление часов
        int hours = second / 3600;
        //вычесленеи минут
        int minutes = (second % 3600) / 60;
        //вычесление секунд
        int seconds = (second % 3600) % 60;
        System.out.println("Время - " + hours + ":" + minutes + ":" + seconds);
    }
}