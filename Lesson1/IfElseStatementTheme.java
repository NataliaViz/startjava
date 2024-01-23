public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1 Перевод псевдокода на язык Java");
        String gender = "man";
        int age = 25;
        double height = 2;
        String name = "Ivan";

        if(gender != "man") {
            System.out.println("Вы не можете зарегистрироваться на сайте");
        } else {
            System.out.println("Введите ваш возраст");
        }
        if(age > 18) {
            System.out.println("Вы можете подолжить регистрацию");
        } else {
            System.out.println("Вы не можете зарегистрироваться на сайте");
        }
        if(height < 1.8) {
            System.out.println("Вы коротышка");
        } else {
            System.out.println("Вы очень высокий человек");
        }
        char firstLetterOfName = name.charAt(0);
        if(firstLetterOfName == 'M') {
            System.out.println("Скорее всего тебя зовут Максим");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Скорее всего тебя зовут Иван");
        } else {
            System.out.println("При таком раскладе мне не угадать");
        }

        System.out.println("\n2 Поиск большего числа");
        int max = 20;
        int min = 14;

        if(max < min) {
            System.out.println("число " + min + " больше числа " + max);
        } else if (max > min) {
            System.out.println("число " + max + " больше числа " + min);
        } else {
            System.out.println("оба числа равны");
        }

        System.out.println("\n3 Проверка числа");
        int a = 159;
        if(a == 0) {
            System.out.println("Число равно = 0");
        } else if(a > 0 & (a % 2) == 0) {
            System.out.println(a + " является положительным и четным");
        } else if(a < 0 & (a % 2) == 0) {
            System.out.println(a + " является отрицательным и четным");
        } else if(a < 0 & (a % 2) != 0) {
            System.out.println(a + " является отрицательным и нечетным");
        } else {
            System.out.println(a + " является положительным и нечетным");
        }

        System.out.println("\n4 Поиск одинаковых цифр в числах");
        int one = 141;
        int two = 145;
        if(one / 100 != two / 100 && (one / 10) % 10 != (two / 10) % 10 && one % 100 != two % 100) {
            System.out.println("Нет повторяющихся цифр");
        } else if(one / 100 == two / 100) {
            System.out.println("В числе " + one + " и " + two + " - превая цифра одинаковая");
        } if((one / 10) % 10 == (two / 10) % 10) {
            System.out.println("В числе " + one + " и " + two + " - вторая цифра одинаковая");
        } if(one % 100 == two % 100) {
            System.out.println("В числе " + one + " и " + two + " - третья цифра одинаковая");
        }

        System.out.println("\n5 Определение символа по его коду");
        char symbol = '\u0031';
        if(symbol == 'W') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if(symbol == 'w') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if(symbol == '1') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Символ " + symbol + " не буква и не цифр");
        } 

        System.out.println("\n6 Подсчет суммы вклада и начисленных банком %");
        int depositAmount = 301000;
        if(depositAmount <= 100000) {
            int accruedInterest = (depositAmount / 100) * 5;
            int result = depositAmount + accruedInterest;
            System.out.println("сумма вклада = " + depositAmount);
            System.out.println("сумма начисленного % = " + accruedInterest);
            System.out.println("итоговая сумма с % = " + result);
        } else if(depositAmount > 100000 & depositAmount <= 300000) {
            int accruedInterest = (depositAmount / 100) * 7;
            int result = depositAmount + accruedInterest;
            System.out.println("сумма вклада = " + depositAmount);
            System.out.println("сумма начисленного % = " + accruedInterest);
            System.out.println("итоговая сумма с % = " + result);
        } else if(depositAmount > 300000) {
            int accruedInterest = (depositAmount / 100) * 10;
            int result = depositAmount + accruedInterest;
            System.out.println("сумма вклада = " + depositAmount);
            System.out.println("сумма начисленного % = " + accruedInterest);
            System.out.println("итоговая сумма с % = " + result);
        }

        System.out.println("\n7 Определение оценки по предметам");
        int histori = 59;
        int programming = 92;
        double gpiPercent = (histori + programming) / 2.0;
        if(histori <= 60) {
            histori = 2;
        } else if(histori > 60 && histori < 72) {
            histori = 3;
        } else if(histori > 72 && histori < 91) {
            histori = 4;
        } else {
            histori = 5;
        }
         if(programming <= 60) {
            programming = 2;
        } else if(programming > 60 && programming < 72) {
            programming = 3;
        } else if(programming > 72 && programming < 91) {
            programming = 4;
        } else {
            programming = 5;
        }
        double gpi = (histori + programming) / 2.0;
        System.out.println("История - " + histori);
        System.out.println("Программирование - " + programming);
        System.out.println("Средний балл оценок по предметам = " + gpi);
        System.out.println("Средний процент по по предметам = " + gpiPercent);

        System.out.println("\n8 Расчет годовой прибыли");
        int sales = 13000;
        int rent = 5000;
        int productionСost = 9000;
        int annualProfit = (sales - rent - productionСost) * 12;
        if(annualProfit == 0) {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        } else if(annualProfit > 0) {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }

    }
}