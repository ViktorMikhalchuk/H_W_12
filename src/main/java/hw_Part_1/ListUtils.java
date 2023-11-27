package hw_Part_1;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static int countOccurance(List<String> stringList, String targetString) {
        int count = 0;
        for (String str : stringList) {
            if (str.equals(targetString)) {
                count++; // рахує кількість входжень рядка у список
            }
        }
        return count;
    }

    public static <T> List<T> toList(T[] array) {
        List<T> resultList = new ArrayList<>();
        for (T item : array) {  // конвертує масив у список
            resultList.add(item);
        }
        return resultList;
    }

    public static List<Integer> findUnique(List<Integer> numberList) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer number : numberList) {
            if (!uniqueList.contains(number)) {  //знаходить унікальні числа у числовому списку
                uniqueList.add(number);
            }
        }

        return uniqueList;
    }
}
