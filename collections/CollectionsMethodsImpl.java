package org.example.collections;

import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsMethodsImpl implements CollectionsMethods{
    @Override
    public int getRandomElement(List<Integer> basket) {
        Random random = new Random();
        return basket.get(random.nextInt(basket.size()));
    }

    @Override
    public List<Integer> removeNulls(List<Integer> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> removeDuplicates(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public boolean comparisonList(List<Integer> list1, List<Integer> list2) {
        return list1 == list2;
    }

    @Override
    public List<String> copyListWithLimitItems(List<String> list, int limit) {
        return list.stream()
                .filter(s -> s.length() > limit)
                .collect(Collectors.toList());
    }

    @Override
    public <T> Map<T, Long> countByStreamGroupBy(List<T> inputList) {
        return inputList.stream()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));
    }

    @Override
    public List<String> removeDifferences(List<String> listOne, List<String> listTwo) {
        List<String> differences = new ArrayList<>(listOne);
        differences.removeAll(listTwo);
        return differences;
    }

    @Override
    public List<String> removeDifferencesWithStream(List<String> listOne, List<String> listTwo) {
        return listOne.stream()
                .filter(element -> !listTwo.contains(element))
                .collect(Collectors.toList());
    }

    @Override
    public String convertToJson(List<String> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

}
