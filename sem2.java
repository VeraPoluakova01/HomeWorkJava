import java.util.Scanner;

public class sem2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите первую строку: ");
        StringBuilder lineFirst = new StringBuilder(scanner.nextLine());

        System.out.println("Введите вторую строку: ");
        StringBuilder lineSec = new StringBuilder(scanner.nextLine());

        // Проверяем, содержит ли первая строка вторую

        // if (lineFirst.toString().contains(lineSec.toString())) {
        //     System.out.println("Строка содержит");           
        // }

        // Если строка содержит вторую, то заменяем вторую на текст

        // if (lineFirst.toString().contains(lineSec.toString())) {
        //     System.out.println((lineFirst.toString().replace(lineSec.toString(), "Строка удалена")));           
        // }
        // else {
        //     System.out.println("Строка не найдена");
        // }
        
        //// теперь не через String, а через Builder
        if (lineFirst.toString().contains(lineSec.toString())) {
            System.out.println("Строка содержит"); 
        // Найдем индекс входа втрой строки в первую
            int startIndex = lineFirst.indexOf(lineSec.toString());
        // Найдем индекс окончанмя вхождения второй строки в первую
            int endIndex = startIndex + lineSec.length();
            System.out.println(startIndex);
            System.out.println(endIndex);
            System.out.println(lineFirst.replace(startIndex, endIndex, "Good!"));
        }

        else {
            System.out.println("Строка не найдена");
        }

        // Сравнить время замены элементов Стрингом и БилдСтрингом

        long begin = System.currentTimeMillis();
        
        long end = System.currentTimeMillis();
        System.out.println(end - begin);

     }
    
}
