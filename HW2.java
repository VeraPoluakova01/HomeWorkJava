
//import java.util.Locale;
import java.util.Scanner;
//1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
//5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//7. *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

public class HW2 {
    public static void main(String[] args) {
        //1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        StringBuilder lineFirst = new StringBuilder(scanner.nextLine());
        System.out.println("Введите вторую строку: ");
        StringBuilder lineSec = new StringBuilder(scanner.nextLine());

        //Проверяем, содержит ли первая строка вторую

        if (lineFirst.toString().contains(lineSec.toString())) {
            System.out.println("Строка содержит");
        } else System.out.println("Строка  не содержит");


        //2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

        System.out.println("Введите первую строку: ");
        StringBuilder str1 = new StringBuilder(scanner.nextLine());
        System.out.println("Введите вторую строку: ");
        StringBuilder str2 = new StringBuilder(scanner.nextLine());
        String str11 = str1.toString().toLowerCase();
        String str22 = str2.reverse().toString().toLowerCase();

        if (str11.contains(str22)) {
            System.out.println("Строки являются вращением");
        } else System.out.println("Строки не являются врвщением");


        //3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

        String reversedStr = reverseString(str11);
        System.out.println("Исходная строка: " + str11);
        System.out.println("Развернутая строка: " + reversedStr);


        //4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        StringBuilder firstNum = new StringBuilder("3");
        StringBuilder secondNum = new StringBuilder("56");
        StringBuilder plus = new StringBuilder();

        plus.append(firstNum).append("+").append(secondNum).append("=").append("59");
        System.out.println(plus);

        StringBuilder minus = new StringBuilder();
        minus.append(firstNum).append("-").append(secondNum).append("=").append("-53");
        System.out.println(minus);

        StringBuilder multiplication = new StringBuilder();
        multiplication.append(firstNum).append("*").append(secondNum).append("=").append("168");
        System.out.println(multiplication);

        //5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        String ch = "=";
        int startIndex = plus.indexOf(ch);
        // Найдем индекс окончанмя вхождения второй строки в первую
        int endIndex = startIndex + 1;

        System.out.println(minus.deleteCharAt(startIndex).insert(startIndex, " равно "));

        //6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

        // plus.replace("=", "равно")
        // Найдем индекс входа втрой строки в первую

        System.out.println(plus.replace(startIndex, endIndex, " равно "));


    }


    public static String reverseString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

}
