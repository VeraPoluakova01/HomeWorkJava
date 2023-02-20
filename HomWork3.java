// 1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
// 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// 3. Вставить элемент в список в первой позиции.
// 4. Извлечь элемент (по указанному индексу) из заданного списка.
// 5. Обновить определенный элемент списка по заданному индексу.
// 6. Удалить третий элемент из списка.
// 7. Поиска элемента в списке по строке.
// 8. Создать новый список и добавить в него несколько элементов первого списка.
// 9. Удалить из первого списка все элементы отсутствующие во втором списке.
// 10. * Сортировка списка.
// 11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

import java.util.*;

public class HomWork3 {
    public static void main(String[] args) {
        // 1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.

        List<String> listColor = new ArrayList<>();
        listColor.add("Orange");
        listColor.add("Red");
        listColor.add("Yellow");
        listColor.add("Green");
        listColor.add("Blue");
        listColor.add("Purple");
        listColor.add("Pink");
        listColor.add("White");
        System.out.println(listColor);
        // Поэлементный вывод
//      for (String col :listColor) {
//            System.out.println(col);
//
//        }
        // 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        ListIterator<String> iterator = listColor.listIterator();
        while (iterator.hasNext()) {
            iterator.set(iterator.next().concat("!"));

        }
        System.out.println(listColor);

        // 3. Вставить элемент в список в первой позиции.

        listColor.add(1, "Dark red!");
        System.out.println(listColor);

        // 4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println(listColor.get(5));

        // 5. Обновить определенный элемент списка по заданному индексу. Меняю значение 4-го эл-та.
        listColor.set(3, "Dark yellow!");
        System.out.println(listColor);

        // 6. Удалить третий элемент из списка

        listColor.remove(3);
        System.out.println(listColor);

        // 7. Поиска элемента в списке по строке.

        String str = "Orange!";

        System.out.println("Есть ли " + str + " - " + listColor.contains(str));
        System.out.println("Индекс искомого цвета: " + listColor.indexOf(str));

        // 8. Создать новый список и добавить в него несколько элементов первого списка.

        List<String> listColorNew = listColor.subList(0, 3);

        listColorNew.add("Purple light");
        listColorNew.add("Pink light");
        System.out.println("Новый список " + listColorNew);

        // 9. Удалить из первого списка все элементы отсутствующие во втором списке.

        listColor.retainAll(listColorNew);
        System.out.println("Список после retainAll " + listColor);

        // 10. * Сортировка списка.

        System.out.println("Исходный список  " + listColor);
        Collections.sort(listColor);
        System.out.println("Отсортированный список  " + listColor);


        // 11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList. (Вставить элемент в список в первой позиции.)

        List<String> list1 = new ArrayList<>();

        // Сравнить время замены элементов Стрингом и БилдСтрингом


        List<String> list2 = new LinkedList();
        long begin1 = System.currentTimeMillis();

        for (int j = 0; j < 200000; j++) {
            list2.add(0, "red!");
        }
        long end2 = System.currentTimeMillis();

        System.out.println("Скорость LinkedList  " + (end2 - begin1));

        long begin = System.currentTimeMillis();

        for (int k = 0; k < 200000; k++) {
            list1.add(0, "red!");
        }

        long end = System.currentTimeMillis();
        System.out.println("Скорость ArrayList  " + (end - begin));



    }
}