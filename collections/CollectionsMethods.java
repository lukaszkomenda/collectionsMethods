package org.example.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface CollectionsMethods {
    int getRandomElement(List<Integer> basket);
    List<Integer> removeNulls (List<Integer> list);
    List<Integer> removeDuplicates(List<Integer> list);
    boolean comparisonList(List<Integer> list1, List<Integer> list2);
    List<String> copyListWithLimitItems (List<String> list, int limit);
    <T>Map<T, Long> countByStreamGroupBy (List<T> inputList);
    List<String> removeDifferences(List<String> listOne, List<String> listTwo);
    List<String> removeDifferencesWithStream(List<String> listOne, List<String> listTwo);
    String convertToJson (List<String> list);
    Set<Integer> convertArrayIntoSet (Integer[] array);
    Map<Integer, Integer> convertListIntoMap (List<Integer> list);
    List<String> zippedList (List<String> names, List<Integer> ages);
}
