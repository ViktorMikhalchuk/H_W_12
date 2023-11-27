package hw_Part_1;

import java.util.ArrayList;
import java.util.List;

import static hw_Part_1.ListUtils.*;

public class Application {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("dog");
        stringList.add("dog");
        stringList.add("cat");
        stringList.add("elephant");
        stringList.add("dog");
        stringList.add("bird");

        String targetString = "dog";
        int occurrences = countOccurance(stringList, targetString);
        System.out.println("Occurrences of '" + targetString + "': " + occurrences);

        Integer[] intArray = {1, 7, 1, 4, 5, 2, 2, 2};
        List<Integer> intList = toList(intArray);
        System.out.println("List from array: " + intList);

        List<Integer> uniqueIntList = findUnique(intList);
        System.out.println("Unique numbers: " + uniqueIntList);

    }
}


//1. Створити метод countOccurance, що приймає на вхід рядковий список як параметр і довільний рядок. Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості. Порахувати скільки разів зустрічається переданий рядок як другий аргумент.
//
//2. Створити метод toList, що приймає на вхід цілісний масив довільної довжини. Конвертувати масив у список відповідного типу даних та повернути з методу.
//
//Наприклад:
//
//Було Array [1, 2, 3]
//
//Стало List [1, 2, 3]
//
//3. Створити метод findUnique, що приймає на вхід числовий список, що складається з довільних значень, які можуть повторюватися в необмеженій кількості. Необхідно повернути новий числовий список, що містить тільки унікальні числа.
//
//4. ** Створити метод calcOccurance, який приймає на вхід рядковий список як параметр. Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості. Обчислити скільки разів трапляється кожне слово. Результат вивести у консоль.
//
//Наприклад:
//
//bird: 2
//
//fox: 1
//
//cat: 1
//
//4. *** Створити метод findOccurance, що приймає на вхід рядковий список як параметр. Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості. Обчислити скільки разів трапляється кожне слово. Результат повернути у вигляді списку структур, що описують повторення кожного окремого взятого слова.
//
//Наприклад:
//
//[
//
//   {name: "bird", occurrence: 2},
//
//   {name: "fox", occurrence: 1},
//
//   {name: "cat", occurrence: 1}
//
//]